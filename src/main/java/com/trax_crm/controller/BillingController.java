package com.trax_crm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.trax_crm.entity.Billing;
import com.trax_crm.entity.Contact;
import com.trax_crm.service.BillingService;
import com.trax_crm.service.ContactService;

@Controller
public class BillingController {
	
	@Autowired
	private ContactService contactService;
	
	@Autowired
	private BillingService billingService;

	@RequestMapping("/generateBill")
	public String generateBill(@RequestParam("id") long id,ModelMap model) {
		Contact contacts = contactService.getContactById(id);
		model.addAttribute("contacts", contacts);
		return "billing_page";
	}
	
	@RequestMapping("/savebill")
	public String saveBill(@ModelAttribute("billing") Billing billing,ModelMap model) {
		billingService.saveBill(billing);
		model.addAttribute("billing", billing);
		return "billing_info";
	}
}
