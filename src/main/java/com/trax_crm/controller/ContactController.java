package com.trax_crm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.trax_crm.entity.Contact;
import com.trax_crm.service.ContactService;

@Controller
public class ContactController {

	@Autowired
	private ContactService contactService;
	
	@RequestMapping("/listcontact")
	public String contactDetails(ModelMap model) {
		List<Contact> contacts = contactService.listAllContact();
		model.addAttribute("contacts", contacts);
		return "contact_results";
	}
	
	@RequestMapping("/contactById")
	public String contactById(@RequestParam("id") long id,ModelMap model) {
		Contact contacts = contactService.getContactById(id);
		model.addAttribute("contacts", contacts);
		return "contact_info";
	}
}
