package com.dairypower.webapi.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.dairypower.webapi.model.master.Info;
import com.dairypower.webapi.model.po.GetPoDetail;
import com.dairypower.webapi.model.po.GetPoHeader;
import com.dairypower.webapi.model.po.PoDetail;
import com.dairypower.webapi.model.po.PoHeader;
import com.dairypower.webapi.repository.GetPoDetailRepository;
import com.dairypower.webapi.repository.GetPoHeaderRepository;
import com.dairypower.webapi.repository.PoDetailRepository;
import com.dairypower.webapi.repository.PoHeaderRepository;

@RestController
public class PoController {

	@Autowired
	PoHeaderRepository poHeaderRepository;

	@Autowired
	PoDetailRepository poDetailRepository;

	@Autowired
	GetPoHeaderRepository getPoHeaderRepository;
	
	@Autowired
	GetPoDetailRepository getPoDetailRepository;
	
	// ----------------------------Save Po---------------------------
	@RequestMapping(value = { "/savePo" }, method = RequestMethod.POST)
	public @ResponseBody PoHeader saveBill(@RequestBody PoHeader poHeader) {

		System.out.println("Po Header "+poHeader.toString());
		
		PoHeader poHeadeRes = null;
		List<PoDetail> poDetailList = new ArrayList<PoDetail>();
		try {
			poHeadeRes = poHeaderRepository.saveAndFlush(poHeader);
			for (PoDetail poDetail : poHeader.getPoDetailList()) {
				poDetail.setPoHeaderId(poHeadeRes.getPoHeaderId());
				PoDetail poDetailRes = poDetailRepository.saveAndFlush(poDetail);
				poDetailList.add(poDetailRes);
			}
			poHeadeRes.setPoDetailList(poDetailList);

		} catch (Exception e) {

			e.printStackTrace();

		}
		return poHeadeRes;

	}

	// ----------------------------------------------------------------------
	@RequestMapping(value = "/getAllPoHeader", method = RequestMethod.GET)
	public @ResponseBody List<GetPoHeader> getAllPoHeaders() {

		List<GetPoHeader> poHeaderList;
		try {
			poHeaderList = getPoHeaderRepository.findAllPoHeaders();
		}
		catch (Exception e) {
			poHeaderList=new ArrayList<>();
			e.printStackTrace();

		}
		return poHeaderList;

	}
	@RequestMapping(value = "/getPoHeaderDetailsBetweenDate", method = RequestMethod.POST)
	public @ResponseBody List<GetPoHeader> getPoHeaderDetailsBetweenDate(@RequestParam("fromDate") String fromDate, 
			@RequestParam("toDate") String toDate) {
		
		List<GetPoHeader> poHeaderList = new ArrayList<>();
		try {
			poHeaderList= getPoHeaderRepository.getPoHeaderDetailsBetweenDate(fromDate,toDate);
		 
		}
		catch (Exception e) {
		 
			e.printStackTrace();

		}
		return poHeaderList;

	}
	//--------------------------------------------------------------------------
	// ----------------------------------------------------------------------
		@RequestMapping(value = "/getPoHeaderDetails", method = RequestMethod.POST)
		public @ResponseBody GetPoHeader getAllPoHeaderDetails(@RequestParam("poHeaderId") int poHeaderId) {

			GetPoHeader poHeader=null;
			try {
				poHeader= getPoHeaderRepository.findPoHeadersAndDetails(poHeaderId);
				
				List<GetPoDetail> poDetailList=getPoDetailRepository.findAllByHeaderId(poHeaderId);
				
				poHeader.setPoDetailList(poDetailList);
			}
			catch (Exception e) {
				poHeader=new GetPoHeader();
				e.printStackTrace();

			}
			return poHeader;

		}
		
		@RequestMapping(value = "/getBatchListByitemId", method = RequestMethod.POST)
		public @ResponseBody List<PoDetail> getBatchListByitemId(@RequestParam("itemId") int itemId) {

			List<PoDetail> poDetailList  = new ArrayList<PoDetail>();
			try {
				 
				  poDetailList=poDetailRepository.getBatchListByitemId(itemId);
				
				 
			}
			catch (Exception e) {
				 
				e.printStackTrace();

			}
			return poDetailList;

		}
		
		@RequestMapping(value = "/updatePoDetail", method = RequestMethod.POST)
		public @ResponseBody PoDetail updatePoDetail( @RequestBody PoDetail poDetail) {

			PoDetail poDetailRet  = new PoDetail();
			try {
				 
				poDetailRet=poDetailRepository.save(poDetail);
				
				 
			}
			catch (Exception e) {
				 
				e.printStackTrace();

			}
			return poDetailRet;

		}
		//--------------------------------------------------------------------------
		// ----------------------------------------------------------------------
		@RequestMapping(value = "/getPoDetails", method = RequestMethod.POST)
		public @ResponseBody List<GetPoDetail> getPoDetails(@RequestParam("itemId") int itemId) {

			List<GetPoDetail> poDetailList=null;
			try {
				 poDetailList=getPoDetailRepository.findBatchesById(itemId);

			}
			catch (Exception e) {
				e.printStackTrace();

			}
			return poDetailList;

		}
		//--------------------------------------------------------------------------
		// ----------------------------------------------------------------------
		@RequestMapping(value = "/getPoDetailsList", method = RequestMethod.GET)
		public @ResponseBody List<GetPoDetail> getPoDetailsList() {

			List<GetPoDetail> poDetailList=null;
			try {
				 poDetailList=getPoDetailRepository.findAllAvailableBatches();

			}
			catch (Exception e) {
				e.printStackTrace();

			}
			return poDetailList;

		}
		//--------------------------------------------------------------------------
		@RequestMapping(value = "/updatePoDetailList", method = RequestMethod.POST)
		public @ResponseBody List<PoDetail> updatePoDetailList(@RequestBody List<PoDetail> poDetailList) {

			List<PoDetail> poDetailRet  = new ArrayList<>();
			try {
				 
				poDetailRet=poDetailRepository.saveAll(poDetailList);
				
				 
			}
			catch (Exception e) {
				 
				e.printStackTrace();

			}
			return poDetailRet;

		}
		//--------------------------------------------------------------------------

		@RequestMapping(value = "/getPoDetailsBalance", method = RequestMethod.POST)
		public @ResponseBody List<PoDetail> getPoDetailsBalance(@RequestParam("poIdList") List<String> poIdList) {

			List<PoDetail> poDetailList  = new ArrayList<PoDetail>();
			try {
				 
				  poDetailList=poDetailRepository.getPoDetailsBalance(poIdList);
				
				 
			}
			catch (Exception e) {
				 
				e.printStackTrace();

			}
			return poDetailList;

		}
		
		@RequestMapping(value = "/deletePurchaseBill", method = RequestMethod.POST)
		public @ResponseBody Info deletePurchaseBill(@RequestParam("poHeaderId") int poHeaderId) {

			Info delete  = new Info();
			try {
				 
				 poHeaderRepository.deletePo(poHeaderId);
				 poDetailRepository.deletePoDetail(poHeaderId);
				
				 
			}
			catch (Exception e) {
				 
				e.printStackTrace();

			}
			return delete;

		}
}
