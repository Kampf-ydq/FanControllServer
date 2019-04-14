package com.moon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.moon.common.pojo.MoonResult;
import com.moon.pojo.TbContact;
import com.moon.service.ContactService;

/*
 * 联系人管理Controller
 */
@Controller
public class ContactController {

	@Autowired 
	private ContactService contactService;
	
	@RequestMapping("/contact")
	@ResponseBody
	public MoonResult getAllContact(){
		return contactService.getAllContact();
	}
	
	/*@RequestMapping(value="/contact/create",method=RequestMethod.POST)
	@ResponseBody
	public MoonResult createContact(TbContact contact){
		
	}*/
}
