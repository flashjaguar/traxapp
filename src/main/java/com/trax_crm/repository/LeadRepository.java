package com.trax_crm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trax_crm.entity.Lead;

public interface LeadRepository extends JpaRepository<Lead, Long> {

}
