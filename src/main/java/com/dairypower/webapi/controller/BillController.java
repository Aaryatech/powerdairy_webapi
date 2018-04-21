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

import com.dairypower.webapi.model.bill.BillDetail;
import com.dairypower.webapi.model.bill.BillHeader;
import com.dairypower.webapi.model.bill.GetBillDetail;
import com.dairypower.webapi.model.bill.GetBillHeader;
import com.dairypower.webapi.model.master.Info;
import com.dairypower.webapi.model.master.RSHeader;
import com.dairypower.webapi.model.master.RsDetail;
import com.dairypower.webapi.model.master.TSetting;
import com.dairypower.webapi.model.po.GetPoDetail;
import com.dairypower.webapi.model.po.GetPoHeader;
import com.dairypower.webapi.repository.BillDetailRepository;
import com.dairypower.webapi.repository.BillHeaderRepository;
import com.dairypower.webapi.repository.GetBillDetailRepository;
import com.dairypower.webapi.repository.GetBillHeaderRepository;
import com.dairypower.webapi.repository.RsDetailRepository;
import com.dairypower.webapi.repository.TSettingRepository;

@RestController
public class BillController {
	
	@Autowired
	BillHeaderRepository billHeaderRepository;
	
	@Autowired
	GetBillHeaderRepository getBillHeaderRepository;
	
	@Autowired
	BillDetailRepository billDetailRepository;
	
	@Autowired
	GetBillDetailRepository getBillDetailRepository;
	
	@Autowired
	RsDetailRepository rsDetailRepository;
	
	@Autowired
	TSettingRepository tSettingRepository;
	
	// ----------------------------Save Bill---------------------------
			@RequestMapping(value = { "/saveBill" }, method = RequestMethod.POST)
			public @ResponseBody BillHeader saveBill(@RequestBody BillHeader billHeader) {

				BillHeader billHeadeRes = null;
				List<BillDetail> billDetailList=new ArrayList<BillDetail>();
				try {
					billHeadeRes = billHeaderRepository.saveAndFlush(billHeader);
				
	                for(BillDetail billDetail:billHeader.getBillDetailList())
	                {
	                	billDetail.setBillTempId(billHeadeRes.getBillTempId());
	                	BillDetail billDetailRes=billDetailRepository.saveAndFlush(billDetail);
	                	billDetailList.add(billDetailRes);
	                }
	                billHeadeRes.setBillDetailList(billDetailList);
					
				} catch (Exception e) {

					e.printStackTrace();

				}
				return billHeadeRes;

			}

	// ----------------------------------------------------------------------
			// ----------------------------------------------------------------------
			@RequestMapping(value = "/getAllBillHeaders", method = RequestMethod.POST)
			public @ResponseBody List<GetBillHeader> getAllBillHeaders(@RequestParam("fromDate") String fromDate,@RequestParam("toDate") String toDate) {

				List<GetBillHeader> getBillHeaderList;
				try {
					getBillHeaderList = getBillHeaderRepository.findAllBillHeaders(fromDate,toDate);
				}
				catch (Exception e) {
					getBillHeaderList=new ArrayList<>();
					e.printStackTrace();

				}
				return getBillHeaderList;

			}
			//--------------------------------------------------------------------------
			@RequestMapping(value = "/getSettledBills", method = RequestMethod.POST)
			public @ResponseBody List<GetBillHeader> getSettledBills(@RequestParam("date") String date,@RequestParam("isSettled") int isSettled) {

				List<GetBillHeader> 	getBillHeaderList=new ArrayList<>();
				try {
				getBillHeaderList = getBillHeaderRepository.getSettledBills(date,isSettled);
					
					for(int i=0;i<getBillHeaderList.size();i++)
					{
						List<GetBillDetail> billDetailList=getBillDetailRepository.findAllByBillTempId(getBillHeaderList.get(i).getBillTempId());
						getBillHeaderList.get(i).setBillDetailList(billDetailList);
					}
					
				}
				catch (Exception e) {
					getBillHeaderList=new ArrayList<>();
					e.printStackTrace();

				}
				return getBillHeaderList;

			}
			//--------------------------------------------------------------------------
			//--------------------------------------------------------------------------
			@RequestMapping(value = "/getAllBillHeader", method = RequestMethod.POST)
			public @ResponseBody List<BillHeader> getAllBillHeader(@RequestParam("date") String date) {

				List<BillHeader> 	billHeaderList=new ArrayList<>();
				try {
				billHeaderList =billHeaderRepository.getAllBillHeader(date);
					
				}
				catch (Exception e) {
					billHeaderList=new ArrayList<>();
					e.printStackTrace();

				}
				return billHeaderList;

			}
			//--------------------------------------------------------------------------
			
			// ----------------------------------------------------------------------
			@RequestMapping(value = "/getBillHeaderDetails", method = RequestMethod.POST)
			public @ResponseBody GetBillHeader getBillHeaderDetails(@RequestParam("billTempId") int billTempId) {

				GetBillHeader billHeader=null;
				try {
					billHeader= getBillHeaderRepository.findBillHeadersAndDetails(billTempId);
					
					List<GetBillDetail> billDetailList=getBillDetailRepository.findAllByBillTempId(billTempId);
					
					billHeader.setBillDetailList(billDetailList);
				}
				catch (Exception e) {
					billHeader=new GetBillHeader();
					e.printStackTrace();

				}
				return billHeader;

			}
			//--------------------------------------------------------------------------
			// --------------------------------------------------------------------------------------
			@RequestMapping(value = "/getRsData", method = RequestMethod.POST)
			public @ResponseBody RsDetail getRsData(@RequestParam("itemId") int itemId,@RequestParam("custId") int custId)  {

				RsDetail rsDetail=new RsDetail();
				try {
					rsDetail = rsDetailRepository.findByCustIdAndItemId(custId,itemId);
				} catch (Exception e) {
					e.printStackTrace();

				}
				return rsDetail;
			}

			// --------------------------------------------------------------------------------------
			
			@RequestMapping(value = { "/getSettingValue" }, method = RequestMethod.POST)
			public @ResponseBody TSetting getSettingValue(@RequestParam("settingKey") String settingKey) {

				TSetting settingRes = tSettingRepository.findBySettingKey(settingKey);

				return settingRes;
			}
			@RequestMapping(value = { "/updateSetingValue" }, method = RequestMethod.POST)
			public @ResponseBody Info updateSeetingForPB(@RequestParam("settingValue") int settingValue,
					@RequestParam("settingKey") String settingKey) {

				Info info = new Info();

				int result = tSettingRepository.updateSetingValue(settingValue, settingKey);

				if (result > 0) {

					info.setError(false);
					info.setMessage("Setting Value updated successfully");
				}

				else {

					info.setError(true);
					info.setMessage("Setting Value Not updated");
				}

				return info;

			}
}
