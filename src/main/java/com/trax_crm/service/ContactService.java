package com.trax_crm.service;

import java.util.List;

import com.trax_crm.entity.Contact;

public interface ContactService {

	public void saveContact(Contact ct);

	public List<Contact> listAllContact();

	public Contact getContactById(long id);

}
