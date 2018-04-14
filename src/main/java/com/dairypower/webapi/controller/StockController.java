package com.dairypower.webapi.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.dairypower.webapi.model.stock.StockDetail;
import com.dairypower.webapi.model.stock.StockHeader;
import com.dairypower.webapi.repository.StockDetailRepository;
import com.dairypower.webapi.repository.StockHeaderRepository;

@RestController
public class StockController {

	@Autowired
	StockHeaderRepository stockHeaderRepository;
	
	@Autowired
	StockDetailRepository stockDetailRepository;
	
	// ----------------------------Save Stock ---------------------------
	@RequestMapping(value = { "/saveStock" }, method = RequestMethod.POST)
	public @ResponseBody StockHeader saveCreditNote(@RequestBody StockHeader stockHeader) {

		StockHeader stockHeaderRes = null;
		List<StockDetail> stockDetailList=new ArrayList<StockDetail>();
		try {
			stockHeaderRes = stockHeaderRepository.saveAndFlush(stockHeader);
            for(StockDetail stockDetail:stockHeader.getStockDetailList())
            {
            	stockDetail.setStockHeaderId(stockHeaderRes.getStockHeaderId());
            	StockDetail stockDetailRes=stockDetailRepository.saveAndFlush(stockDetail);
            	stockDetailList.add(stockDetailRes);
            }
            stockHeaderRes.setStockDetailList(stockDetailList);
			
		} catch (Exception e) {

			e.printStackTrace();

		}
		return stockHeaderRes;

	}

// ----------------------------------------------------------------------
	
}
