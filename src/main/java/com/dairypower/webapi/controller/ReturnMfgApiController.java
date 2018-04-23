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
import com.dairypower.webapi.model.po.PoDetail;
import com.dairypower.webapi.repository.CreditNoteHeaderRepository;
import com.dairypower.webapi.repository.GetMfgReturnRepository;


@RestController
public class ReturnMfgApiController {
	
	@Autowired
	GetMfgReturnRepository getMfgReturnRepository;
	
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

}
