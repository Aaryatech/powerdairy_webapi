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

import com.dairypower.webapi.model.GetMfgReturn;
import com.dairypower.webapi.model.MfgReturnDetail;
import com.dairypower.webapi.model.master.Info;
import com.dairypower.webapi.model.master.MfgReturn;
import com.dairypower.webapi.model.po.PoDetail;
import com.dairypower.webapi.repository.CreditNoteHeaderRepository;
import com.dairypower.webapi.repository.GetMfgReturnRepository;
import com.dairypower.webapi.repository.MfgReturnDetailRepository;
import com.dairypower.webapi.repository.MfgReturnRepository;


@RestController
public class ReturnMfgApiController {
	
	@Autowired
	GetMfgReturnRepository getMfgReturnRepository;
	
	@Autowired
	MfgReturnRepository mfgReturnRepository;
	
	@Autowired
	MfgReturnDetailRepository mfgReturnDetailRepository;
	
	
	@RequestMapping(value = { "/saveMfgReturn" }, method = RequestMethod.POST)
	public @ResponseBody Info saveMfgReturn(@RequestBody MfgReturn mfgReturn) {

		MfgReturn mfgReturnRes = null;
		Info info = new Info();
		try {
			mfgReturnRes = mfgReturnRepository.saveAndFlush(mfgReturn);
			
			for(int i = 0; i<mfgReturn.getMfgReturnDetailList().size();i++)
				mfgReturn.getMfgReturnDetailList().get(i).settReturnId(mfgReturnRes.gettReturnId());
			
			List<MfgReturnDetail> mfgReturnDetailList = mfgReturnDetailRepository.saveAll(mfgReturn.getMfgReturnDetailList());

			if (mfgReturnRes != null) {
				info.setError(false);
				info.setMessage("MfgReturn Saved Successfully.");
			} else {
				info.setError(true);
				info.setMessage("MfgReturn Not Saved .");
			}

		} catch (Exception e) {

			info.setError(true);
			info.setMessage("MfgReturn Not Saved .");
			e.printStackTrace();

		}
		return info;

	}
	
	@RequestMapping(value = "/mfgReturnRecordBetweenDate", method = RequestMethod.POST)
	public @ResponseBody List<GetMfgReturn> mfgReturnRecordBetweenDate(@RequestParam("fromDate") String fromDate
			,@RequestParam("toDate") String toDate) {

		List<GetMfgReturn> getMfgReturnList  = new ArrayList<GetMfgReturn>();
		try {
			 
			getMfgReturnList = getMfgReturnRepository.mfgReturnRecordBetweenDate(fromDate,toDate);
			
			 
		}
		catch (Exception e) {
			 
			e.printStackTrace();

		}
		return getMfgReturnList;

	}
	
	@RequestMapping(value = "/manufactureReturnDetail", method = RequestMethod.POST)
	public @ResponseBody List<MfgReturnDetail> manufactureReturnDetail(@RequestParam("tReturnId") int tReturnId) {

		List<MfgReturnDetail> getMfgReturnList  = new ArrayList<MfgReturnDetail>();
		try {
			 
			getMfgReturnList = mfgReturnDetailRepository.manufactureReturnDetail(tReturnId); 
			 
		}
		catch (Exception e) {
			 
			e.printStackTrace();

		}
		return getMfgReturnList;

	}

}
