package com.trax_crm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trax_crm.entity.Billing;

public interface BillingRepository extends JpaRepository<Billing, Long> {

}
