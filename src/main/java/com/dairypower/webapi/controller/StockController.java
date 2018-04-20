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

import com.dairypower.webapi.model.stock.GetCratesStock;
import com.dairypower.webapi.model.stock.GetCurrentStock;
import com.dairypower.webapi.model.stock.ItemStockDetail;
import com.dairypower.webapi.model.stock.StockDetail;
import com.dairypower.webapi.model.stock.StockHeader;
import com.dairypower.webapi.repository.GetCratesStockRepository;
import com.dairypower.webapi.repository.GetCurrentStockRepository;
import com.dairypower.webapi.repository.ItemStockDetailRepository;
import com.dairypower.webapi.repository.StockDetailRepository;
import com.dairypower.webapi.repository.StockHeaderRepository; 

@RestController
public class StockController {

	@Autowired
	StockHeaderRepository stockHeaderRepository;
	
	@Autowired
	StockDetailRepository stockDetailRepository;
	
	@Autowired
	ItemStockDetailRepository itemStockDetailRepository;
	
	@Autowired
	GetCurrentStockRepository getCurrentStockRepository;
	
	@Autowired
	GetCratesStockRepository getCratesStockRepository;
	
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
	
	@RequestMapping(value = { "/getStock" }, method = RequestMethod.GET)
	public @ResponseBody StockHeader getStock()
	{
		 
		StockHeader getStock = new StockHeader();
		try {
			  int status = 0;
			getStock = stockHeaderRepository.findByStatus(status);
			
			if(getStock==null)
			{
				 getStock = new StockHeader();
			}
			 
			 
		} catch (Exception e) {

			e.printStackTrace();
		}
         
		return getStock;

	}
	
	@RequestMapping(value = { "/getStockDetail" }, method = RequestMethod.POST)
	public @ResponseBody List<ItemStockDetail> getStockDetail(@RequestParam ("stockId") int stockId)
	{
		 
		List<ItemStockDetail> stockDetail = new ArrayList<ItemStockDetail>();
		try {
			 
				 stockDetail = itemStockDetailRepository.getDetailed(stockId); 
			 
		} catch (Exception e) {

			e.printStackTrace();
		}
         
		return stockDetail;

	}
	
	@RequestMapping(value = { "/getCurrentStock" }, method = RequestMethod.POST)
	public @ResponseBody List<GetCurrentStock> getCurrentStock(@RequestParam ("date") String date)
	{
		 
		List<GetCurrentStock> getCurrentStock = new ArrayList<GetCurrentStock>();
		try {
			 
			getCurrentStock = getCurrentStockRepository.getCurrentStock(date); 
			 
		} catch (Exception e) {

			e.printStackTrace();
		}
         
		return getCurrentStock;

	}
	
	@RequestMapping(value = { "/getCratesStock" }, method = RequestMethod.POST)
	public @ResponseBody  GetCratesStock  getCratesStock(@RequestParam ("date") String date)
	{
		 
		 GetCratesStock  getCratesStock = new   GetCratesStock ();
		try {
			 System.out.println("date " + date);
			 getCratesStock = getCratesStockRepository.getCratesStock(date); 
			 
			if(getCratesStock==null)
			{
				getCratesStock = new   GetCratesStock ();
			}
			 
		} catch (Exception e) {

			e.printStackTrace();
		}
         
		return getCratesStock;

	}
	
	@RequestMapping(value = { "/getStockBetweenDate" }, method = RequestMethod.POST)
	public @ResponseBody List<GetCurrentStock> getStockBetweenDate(@RequestParam ("fromDate") String fromDate,
			@RequestParam ("toDate") String toDate )
	{
		 
		List<GetCurrentStock> getStockBetweenDate = new ArrayList<GetCurrentStock>();
		try {
			 
			getStockBetweenDate = getCurrentStockRepository.getStockBetweenDate(fromDate,toDate); 
			 
		} catch (Exception e) {

			e.printStackTrace();
		}
         
		return getStockBetweenDate;

	}
	
	@RequestMapping(value = { "/getStockDetailForUpdate" }, method = RequestMethod.POST)
	public @ResponseBody List<StockDetail> getStockDetailForUpdate(@RequestParam ("stockId") int stockId)
	{
		 
		List<StockDetail> getStockDetailForUpdate = new ArrayList<StockDetail>();
		try {
			 
			getStockDetailForUpdate = stockDetailRepository.findByStockHeaderId(stockId);  
			
			
		} catch (Exception e) {

			e.printStackTrace();
		}
         
		return getStockDetailForUpdate;

	}

// ----------------------------------------------------------------------
	
}
