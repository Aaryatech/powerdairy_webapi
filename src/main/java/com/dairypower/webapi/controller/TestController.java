package com.dairypower.webapi.controller;

import java.sql.Date;

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
import com.dairypower.webapi.model.bill.CatwiseReport;
import com.dairypower.webapi.model.bill.CustomerRemAmt;
import com.dairypower.webapi.model.bill.DateRemAmt;
import com.dairypower.webapi.model.bill.DatewiseSaleReport;
import com.dairypower.webapi.model.master.Info;

import com.dairypower.webapi.model.po.BillwiseConsumptionReport;
import com.dairypower.webapi.model.po.BillwisePurchaseReport;
import com.dairypower.webapi.model.po.CategorywiseConsumptionReport;
import com.dairypower.webapi.model.po.CustomerwiseReport;
import com.dairypower.webapi.model.po.DatewisePurchaseReport;
import com.dairypower.webapi.model.po.ItemwisePurchasereport;
import com.dairypower.webapi.model.po.VehiclewiseReport;
import com.dairypower.webapi.model.po.VehiclewiseReportRpository;
import com.dairypower.webapi.repository.BillDetailRepository;
import com.dairypower.webapi.repository.BillHeaderRepository;
import com.dairypower.webapi.repository.BillwiseConsumptionRepository;
import com.dairypower.webapi.repository.BillwisePurchaseRepository;
import com.dairypower.webapi.repository.CatWiseReportRepository;
import com.dairypower.webapi.repository.CategorywiseConsumptionRepository;
import com.dairypower.webapi.repository.CustomerOutstandingAmtRepo;
import com.dairypower.webapi.repository.CustomerwiseReportRepository;
import com.dairypower.webapi.repository.DateRemAmtRepository;
import com.dairypower.webapi.repository.DatewisePurRepository;
import com.dairypower.webapi.repository.DatewiseSaleReportRepository;
import com.dairypower.webapi.repository.ItemCategoryRepository;
import com.dairypower.webapi.repository.ItemwisePurchaseRepository;

@RestController
@RequestMapping("/Test")

public class TestController {

	@Autowired
	BillHeaderRepository billHeaderRepository;

	@Autowired
	CustomerwiseReportRepository customerwiseReportRepository;
	
	@Autowired
	CustomerOutstandingAmtRepo custAmtRepo;

	@Autowired
	CategorywiseConsumptionRepository categorywiseConsumptionRepository;

	@Autowired
	BillwiseConsumptionRepository billwiseConsumptionRepository;

	@Autowired
	BillDetailRepository billDetailRepository;

	@Autowired
	DatewisePurRepository datewisePurRepository;

	@Autowired
	ItemCategoryRepository itemCategoryRepository;

	@Autowired
	BillwisePurchaseRepository billwisePurchaseRepository;

	@Autowired
	ItemwisePurchaseRepository itemwisePurchaseRepository;

	@Autowired
	VehiclewiseReportRpository vehiclewiseReportRpository;
	
	@Autowired
	CatWiseReportRepository catWiseReportRepository;
	
	@Autowired
	DatewiseSaleReportRepository datewiseSaleReportRepository;
	
	@Autowired
	DateRemAmtRepository dateRemAmtRepository;

	// --------------------------------------------------------------------------------------
	// ----------------------------Insert Bill Header----------------------------
	@RequestMapping(value = { "/insertBillHeader" }, method = RequestMethod.POST)
	public @ResponseBody Info insertBillHeader(@RequestBody BillHeader billHeader) {

		BillHeader billHeaderRes = null;
		Info info = new Info();
		try {
			billHeaderRes = billHeaderRepository.saveAndFlush(billHeader);

			if (billHeaderRes != null) {
				info.setError(false);
				info.setMessage("Bill Data Inserted Successfully.");
			} else {
				info.setError(true);
				info.setMessage(" not Insert.");
			}

		} catch (Exception e) {

			info.setError(true);
			info.setMessage(" not Insert.");
			e.printStackTrace();

		}
		return info;

	}

	/*
	 * // ---------------------------All Bill
	 * Header---------------------------------
	 * 
	 * @RequestMapping(value = "/getAllBillHeader", method = RequestMethod.GET)
	 * public @ResponseBody List<BillHeader> getAllBillHeader() {
	 * 
	 * List<BillHeader> billHeaderList; try { billHeaderList =
	 * billHeaderRepository.findAll();
	 * 
	 * for (BillHeader billHeader : billHeaderList) { List<BillDetail>
	 * billDetailList =
	 * billDetailRepository.findByBillTempId(billHeader.getBillTempId());
	 * billHeader.setBillDetailList(billDetailList); } } catch (Exception e) {
	 * billHeaderList = new ArrayList<>();
	 * 
	 * e.printStackTrace();
	 * 
	 * } return billHeaderList; }
	 * 
	 * //
	 * -----------------------------------------------------------------------------
	 * ---------
	 */ // ----------------------------Insert Bill Header----------------------------
	@RequestMapping(value = { "/insertBillDetail" }, method = RequestMethod.POST)
	public @ResponseBody Info insertBillDetail(@RequestBody BillDetail billDetail) {

		BillDetail billDetailRes = null;
		Info info = new Info();
		try {
			billDetailRes = billDetailRepository.saveAndFlush(billDetail);

			if (billDetailRes != null) {
				info.setError(false);
				info.setMessage("Bill Details Inserted Successfully.");
			} else {
				info.setError(true);
				info.setMessage(" not Insert.");
			}

		} catch (Exception e) {

			info.setError(true);
			info.setMessage(" not Insert.");
			e.printStackTrace();

		}
		return info;

	}

	// ---------------------------All Bill List---------------------------------
	@RequestMapping(value = "/getAllBillList", method = RequestMethod.GET)
	public @ResponseBody List<BillDetail> getAllBillList() {

		List<BillDetail> billDeatilList;
		try {
			billDeatilList = billDetailRepository.findAll();
		} catch (Exception e) {
			billDeatilList = new ArrayList<>();

			e.printStackTrace();

		}
		return billDeatilList;
	}

	// -------------------------------------------------------------------------
	/*
	 * // ------------------------Getting Bill by Id-----------------------
	 * 
	 * @RequestMapping(value = { "/getAllBillListById" }, method =
	 * RequestMethod.POST) public @ResponseBody List<BillDetail>
	 * getAllBillListById(@RequestParam("billDetailId") int billDetailId) {
	 * 
	 * List<BillDetail> billDetail =
	 * billDetailRepository.findByBillTempId(billDetailId);
	 * 
	 * return billDetail; }
	 * 
	 * // -------------------------------------------------------------------------
	 * // ------------------------Getting Header by Id-----------------------
	 * 
	 * @RequestMapping(value = { "/getHeaderListByTempId" }, method =
	 * RequestMethod.POST) public @ResponseBody BillHeader
	 * getHeaderListByTempId(@RequestParam("billTempId") int billTempId) {
	 * 
	 * BillHeader billHeader = billHeaderRepository.findByBillTempId(billTempId);
	 * 
	 * List<BillDetail> billDetailList =
	 * billDetailRepository.findByBillTempId(billTempId);
	 * billHeader.setBillDetailList(billDetailList);
	 * 
	 * return billHeader; }
	 * 
	 * // -------------------------------------------------------------------------
	 */ // ------------------------DateWise Purchase Report-----------------------

	@RequestMapping(value = "/getDatewisePurchase", method = RequestMethod.POST)
	public @ResponseBody List<DatewisePurchaseReport> getDatewisePurchase(@RequestParam("fromDate") Date fromDate,
			@RequestParam("toDate") Date toDate) {

		List<DatewisePurchaseReport> datewisePurList;
		try {
			datewisePurList = datewisePurRepository.findDatewiseReport(fromDate, toDate);
		} catch (Exception e) {
			datewisePurList = new ArrayList<>();
			e.printStackTrace();

		}
		return datewisePurList;

	}

	// -------------------------------------------------------------------------
	// ------------------------BillWise Purchase Report-----------------------

	@RequestMapping(value = "/getBillwisePurchase", method = RequestMethod.POST)
	public @ResponseBody List<BillwisePurchaseReport> getBillwisePurchase(@RequestParam("fromDate") Date fromDate,
			@RequestParam("toDate") Date toDate) {

		List<BillwisePurchaseReport> billwisePurList;
		try {
			billwisePurList = billwisePurchaseRepository.findBillwiseReport(fromDate, toDate);
		} catch (Exception e) {
			billwisePurList = new ArrayList<>();
			e.printStackTrace();

		}
		return billwisePurList;

	}

	// -------------------------------------------------------------------------
	// ------------------------ItemWise Purchase Report By date---------

	@RequestMapping(value = "/getItemwisePurchase", method = RequestMethod.POST)
	public @ResponseBody List<ItemwisePurchasereport> getItemwisePurchase(@RequestParam("fromDate") Date fromDate,
			@RequestParam("toDate") Date toDate) {

		List<ItemwisePurchasereport> itemwisePurList;
		try {
			itemwisePurList = itemwisePurchaseRepository.findItemwiseReport(fromDate, toDate);
		} catch (Exception e) {
			itemwisePurList = new ArrayList<>();
			e.printStackTrace();

		}
		return itemwisePurList;

	}

	// -------------------------------------------------------------------------
	// ------------------------BillWise Consumption Report-----------------------

	@RequestMapping(value = "/getAllBillwiseConsumption", method = RequestMethod.POST)
	public @ResponseBody List<BillwiseConsumptionReport> getBillwiseConsumption(
			@RequestParam("fromDate") String fromDate, @RequestParam("toDate") String toDate,@RequestParam("custId") int custId) {

		List<BillwiseConsumptionReport> billwiseConList;
		try {
			if(custId==0)
			{
			billwiseConList = billwiseConsumptionRepository.findBillwiseConReport(fromDate, toDate);
			}
			else
			{
				billwiseConList = billwiseConsumptionRepository.findBillwiseConWithCatReport(fromDate, toDate,custId);

			}
			
		} catch (Exception e) {
			billwiseConList = new ArrayList<>();
			e.printStackTrace();

		}
		return billwiseConList;

	}
	@RequestMapping(value = "/getAllDatewiseConsumption", method = RequestMethod.POST)
	public @ResponseBody List<DatewiseSaleReport> getAllDatewiseConsumption(
			@RequestParam("fromDate") String fromDate, @RequestParam("toDate") String toDate) {

		List<DatewiseSaleReport> dateWiseList;
		try {
			
			dateWiseList = datewiseSaleReportRepository.findDatewiseConReport(fromDate, toDate);
			List<DateRemAmt> remAmtList=dateRemAmtRepository.findDateWiseOutstandingAmt(fromDate, toDate);

			for(int i=0;i<dateWiseList.size();i++)
			{
				for(int j=0;j<remAmtList.size();j++)
				{
					if(dateWiseList.get(i).getBillDate().equals(remAmtList.get(j).getBillDate()))
					{
						dateWiseList.get(i).setOutstandingAmt(remAmtList.get(j).getOutstandingAmt());
					}
					
				}
			}
		} catch (Exception e) {
			dateWiseList = new ArrayList<>();
			e.printStackTrace();

		}
		return dateWiseList;

	}


	// -------------------------------------------------------------------------
	// ------------------------Categorywise ConsumptionReport-----------------
	@RequestMapping(value = "/getAllCatwiseConsumption", method = RequestMethod.POST)
	public @ResponseBody List<CategorywiseConsumptionReport> getAllCatwiseConsumption(
			@RequestParam("fromDate") String fromDate, @RequestParam("toDate") String toDate, @RequestParam("catId") int catId) {

		List<CategorywiseConsumptionReport> catwiseConList;
		try {
			if(catId==0)
			{
			catwiseConList = categorywiseConsumptionRepository.findCatwiseConReport(fromDate, toDate);
			}
			else
			{
				catwiseConList = categorywiseConsumptionRepository.findCatwiseConCatIdReport(fromDate, toDate,catId);			
			}
		} catch (Exception e) {
			catwiseConList = new ArrayList<>();
			e.printStackTrace();

		}
		return catwiseConList;

	}

	// -------------------------------------------------------------------------
	// ------------------------Categorywise Consumption Report-----------------
		@RequestMapping(value = "/getAllCatwiseReport", method = RequestMethod.POST)
		public @ResponseBody List<CatwiseReport> getAllCatwiseReport(
				@RequestParam("fromDate") String fromDate, @RequestParam("toDate") String toDate, @RequestParam("catId") int catId) {

			List<CatwiseReport> catwiseConList;
			try {
				if(catId==0)
				{
				catwiseConList = catWiseReportRepository.findCatwiseConReport(fromDate, toDate);
				}
				else
				{
					catwiseConList = catWiseReportRepository.findCatwiseConCatIdReport(fromDate, toDate,catId);			
				}
			} catch (Exception e) {
				catwiseConList = new ArrayList<>();
				e.printStackTrace();

			}
			return catwiseConList;

		}

		// -------------------------------------------------------------------------
	// ------------------------Customerwise Consumption Report-------

	@RequestMapping(value = "/getAllCustomerwiseReport", method = RequestMethod.POST)
	public @ResponseBody List<CustomerwiseReport> getAllCustomerwiseReport(@RequestParam("fromDate") String fromDate,
			@RequestParam("toDate") String toDate,@RequestParam("custId") int custId) {

		List<CustomerwiseReport> catwiseConList;
		try {
			if(custId==0)
			{
			catwiseConList = customerwiseReportRepository.findByAllCustwiseReport(fromDate, toDate);
			List<CustomerRemAmt> remAmtList=custAmtRepo.findOutstandingAmt(fromDate, toDate);
			for(int i=0;i<catwiseConList.size();i++)
			{
				for(int j=0;j<remAmtList.size();j++)
				{
					if(catwiseConList.get(i).getCustId()==remAmtList.get(j).getCustId())
					{
						catwiseConList.get(i).setOutstandingAmt(remAmtList.get(j).getOutstandingAmt());
					}
				}
			}
			}
			else
			{
				catwiseConList = customerwiseReportRepository.findByCustwiseReport(fromDate, toDate,custId);
				CustomerRemAmt remAmt=custAmtRepo.findOutstandingAmtOfCust(fromDate, toDate,custId);
				catwiseConList.get(0).setOutstandingAmt(remAmt.getOutstandingAmt());
			
			}
		} catch (Exception e) {
			catwiseConList = new ArrayList<>();
			e.printStackTrace();

		}
		return catwiseConList;

	}

	// -------------------------------------------------------------------------
	// ------------------------Vehiclewise Report-------

	@RequestMapping(value = "/getAllVehiclewiseReport", method = RequestMethod.POST)
	public @ResponseBody List<VehiclewiseReport> getAllVehiclewiseReport(@RequestParam("fromDate") String fromDate,
			@RequestParam("toDate") String toDate, @RequestParam("tVehId") int tVehId) {

		List<VehiclewiseReport> vehiclewiseList;
		try {

			// -------------------------------------------------------------------------
			// ------------------------Specific Vehiclewise Report-------

			if (tVehId != 0) {
				vehiclewiseList = vehiclewiseReportRpository.findVehiclewiseReport(fromDate, toDate, tVehId);
			}

			// -------------------------------------------------------------------------
			// ------------------------All Vehiclewise Report-------

			else {
				vehiclewiseList = vehiclewiseReportRpository.findAllVehiclewiseReport(fromDate, toDate);
			}
		} catch (Exception e) {
			vehiclewiseList = new ArrayList<>();
			e.printStackTrace();

		}
		return vehiclewiseList;

	}

}
