package com.trax_crm.service;

import java.util.List;

import com.trax_crm.entity.Lead;

public interface LeadService {

	public void saveLead(Lead lead);

	public Lead getLeadById(long id);

	public void deleteOneLead(long id);

	public List<Lead> listAllLead();

}
