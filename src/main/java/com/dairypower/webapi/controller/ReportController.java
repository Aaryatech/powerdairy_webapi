package com.dairypower.webapi.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.dairypower.webapi.model.CreditNoteReport;
import com.dairypower.webapi.model.LeakageQtyReport;
import com.dairypower.webapi.repository.CreditNoteReportRepo;
import com.dairypower.webapi.repository.LeakageQtyReportRepo;

@RestController
public class ReportController {
	
	@Autowired
	CreditNoteReportRepo creditNoteReportRepo;
	
	@Autowired
	LeakageQtyReportRepo leakageQtyReportRepo;
	
	@RequestMapping(value = "/getCreditNoteReport", method = RequestMethod.POST)
	public @ResponseBody List<CreditNoteReport> getCreditNoteReport(@RequestParam("fromDate") String fromDate, 
			@RequestParam("toDate") String toDate) {

		List<CreditNoteReport>creditReportList;
		try {
			
			creditReportList = creditNoteReportRepo.creditNoteBetDateReport(fromDate, toDate);
			
		}
		catch (Exception e) {
			System.err.println("Exce in getting /getCreditNoteReport @ ReportController");
			creditReportList=new ArrayList<>();
			e.printStackTrace();

		}
		
		return creditReportList;

	}
	
	
	@RequestMapping(value = "/getLeakageQtyReport", method = RequestMethod.POST)
	public @ResponseBody List<LeakageQtyReport> getLeakageQtyReport(@RequestParam("fromDate") String fromDate, 
			@RequestParam("toDate") String toDate) {

		List<LeakageQtyReport> leakageQtyReportList = new ArrayList<LeakageQtyReport>() ;
		try {
			
			leakageQtyReportList = leakageQtyReportRepo.getLeakageQtyReport(fromDate, toDate); 
			
		}
		catch (Exception e) {
			System.err.println("Exce in getting /getCreditNoteReport @ ReportController");
			 
			e.printStackTrace();

		}
		
		return leakageQtyReportList;

	}
	
	
	

}
