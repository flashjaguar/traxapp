package com.trax_crm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trax_crm.entity.Contact;

public interface ContactRepository extends JpaRepository<Contact, Long> {

}
