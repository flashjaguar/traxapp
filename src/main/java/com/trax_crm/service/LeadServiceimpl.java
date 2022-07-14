package com.trax_crm.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trax_crm.entity.Lead;
import com.trax_crm.repository.LeadRepository;

@Service
public class LeadServiceimpl implements LeadService {

	@Autowired
	private LeadRepository leadrepo;
	@Override
	public void saveLead(Lead lead) {
		leadrepo.save(lead);
		
	}
	@Override
	public Lead getLeadById(long id) {
		Optional<Lead> findById = leadrepo.findById(id);
		Lead lead = findById.get();
		return lead;
	}
	@Override
	public void deleteOneLead(long id) {
		leadrepo.deleteById(id);		
	}
	@Override
	public List<Lead> listAllLead() {
		List<Lead> findAll = leadrepo.findAll();
		return findAll;
	}
	

}
