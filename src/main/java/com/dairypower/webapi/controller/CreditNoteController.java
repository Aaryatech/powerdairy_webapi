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

import com.dairypower.webapi.model.cnote.CreditNoteDetail;
import com.dairypower.webapi.model.cnote.CreditNoteHeader;
import com.dairypower.webapi.model.master.Info;
import com.dairypower.webapi.model.po.PoDetail;
import com.dairypower.webapi.model.po.PoHeader;
import com.dairypower.webapi.repository.BillHeaderRepository;
import com.dairypower.webapi.repository.CreditNoteDetailRepository;
import com.dairypower.webapi.repository.CreditNoteHeaderRepository;

@RestController
public class CreditNoteController {

	@Autowired
	CreditNoteHeaderRepository creditNoteHeaderRepository;
	
	@Autowired
	CreditNoteDetailRepository creditNoteDetailRepository;
	
	@Autowired
	BillHeaderRepository billHeaderRepository;
	
	// ----------------------------Save Credit Note---------------------------
	@RequestMapping(value = { "/saveCreditNote" }, method = RequestMethod.POST)
	public @ResponseBody CreditNoteHeader saveCreditNote(@RequestBody CreditNoteHeader creditNoteHeader) {

		CreditNoteHeader creditNoteHeaderRes = null;
		List<CreditNoteDetail> crnDetailList=new ArrayList<CreditNoteDetail>();
		try {
			creditNoteHeaderRes = creditNoteHeaderRepository.saveAndFlush(creditNoteHeader);
            for(CreditNoteDetail creditNoteDetail:creditNoteHeader.getCreditNoteDetailList())
            {
            	creditNoteDetail.setCrnHeaderId(creditNoteHeaderRes.getCrnHeaderId());
            	CreditNoteDetail crnDetailRes=creditNoteDetailRepository.saveAndFlush(creditNoteDetail);
            	crnDetailList.add(crnDetailRes);
            }
            creditNoteHeaderRes.setCreditNoteDetailList(crnDetailList);
			
		} catch (Exception e) {

			e.printStackTrace();

		}
		return creditNoteHeaderRes;

	}
	// -----------------------Update Crn Generated------------------------------------
		@RequestMapping(value = { "/updateCrnGenerated" }, method = RequestMethod.POST)
		public @ResponseBody Info updateCrnGenerated(@RequestParam int billTempId) {

			int isUpdated =billHeaderRepository.updateCrnGenerated(billTempId);
			Info info = new Info();
			if (isUpdated == 1) {
				info.setError(false);
				info.setMessage("CreditNote Status Updated Successfully");
			} else {
				info.setError(true);
				info.setMessage("CreditNote Status Updated Failed");
			}
			return info;
		}

		// ------------------------------------------------------------------------
// ----------------------------------------------------------------------
}
