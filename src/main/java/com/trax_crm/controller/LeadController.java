package com.trax_crm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.trax_crm.entity.Contact;
import com.trax_crm.entity.Lead;
import com.trax_crm.service.ContactService;
import com.trax_crm.service.LeadService;

@Controller
public class LeadController {

	@Autowired
	private LeadService leadservice;
	
	@Autowired
	private ContactService contactservice;
	
	
	@RequestMapping("/viewpage")
	public String viewLeadPage() {
		return "view_lead_page";
	}
	
	@RequestMapping("/savelead")
	public String saveLead(@ModelAttribute("lead") Lead lead,ModelMap model) {
		leadservice.saveLead(lead);
		model.addAttribute("lead", lead);
		return "lead_info";
	}
	
	@RequestMapping("/convertlead")
	public String convertlead(@RequestParam("id") long id,ModelMap model) {
		Lead lead=leadservice.getLeadById(id);
		
		Contact ct=new Contact();
		ct.setFirstName(lead.getFirstName());
		ct.setLastName(lead.getLastName());
		ct.setEmail(lead.getEmail());
		ct.setMobile(lead.getMobile());
		ct.setLeadsource(lead.getLeadsource());
		ct.setGender(lead.getGender());
		
		contactservice.saveContact(ct);
		
		leadservice.deleteOneLead(id);
		
		List<Contact> contacts=contactservice.listAllContact();
		model.addAttribute("contacts", contacts);
		return "contact_results";
	}
	@RequestMapping("/listlead")
	public String leadDeatils(ModelMap model) {
		List<Lead> leads=leadservice.listAllLead();
		model.addAttribute("leads", leads);
		return "serach_result";
	}
	@RequestMapping("/leadById")
	public String leadById(@RequestParam("id") long id,ModelMap model) {
		Lead lead = leadservice.getLeadById(id);
		model.addAttribute("lead", lead);
		return "lead_info";
		
	}
}
