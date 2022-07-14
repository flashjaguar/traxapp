package com.trax_crm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trax_crm.entity.Billing;
import com.trax_crm.repository.BillingRepository;
@Service
public class BillingServiceImpl implements BillingService {

	@Autowired
	private BillingRepository billingRepo;
	@Override
	public void saveBill(Billing billing) {
		billingRepo.save(billing);
	}

}
