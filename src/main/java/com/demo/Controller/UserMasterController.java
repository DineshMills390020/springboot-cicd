package com.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.demo.Model.Ankempms.Ankempms;
import com.demo.Model.AttpayEmpmst.AttpayEmpmst;
import com.demo.Model.DInvReqHeaderH.DInvReqHeaderH;
import com.demo.Repository.AnkempmsRepository.AnkempmsRepository;
import com.demo.Repository.AttpayEmpmstRepository.AttpayEmpmstRepository;
import com.demo.Repository.DinvHeaderRepositoryH.DinvHeaderRepositoryH;

@RestController
@CrossOrigin
@RequestMapping("api/UserMaster")
public class UserMasterController {
	
	@Autowired
	private AnkempmsRepository ankempms;
	
	@Autowired
	private AttpayEmpmstRepository attpayEmpmst;
	
	@Autowired
	private DinvHeaderRepositoryH headerHistory;
	
	
	@RequestMapping(value = "/pay", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Ankempms> getAnkempmsList() {
		try {
			System.out.println("getAnkempmsList :-");
			return ankempms.getAnkempmsList();
		} catch (Exception e) {
			System.out.println("getAnkempmsList Null :-");
			return null;
		}
	}
	
	@RequestMapping(value = "/birthday", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<AttpayEmpmst> getAttpayEmpmstList() {
		try {
			System.out.println("getAttpayEmpmstList :-");
			return attpayEmpmst.getAttpayEmpmstList();
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
	
	
	@RequestMapping(value = "/headerHistoryList", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<DInvReqHeaderH> getReqDocumentHistoryList() {
			
		try {
			System.out.println("getReqDocumentHistoryList  :-");
			return headerHistory.getReqDocumentHistoryList();
		} catch (Exception e) {
			System.out.println("getReqDocumentHistoryList null :-");
			return null;
		}
	}
	
}
