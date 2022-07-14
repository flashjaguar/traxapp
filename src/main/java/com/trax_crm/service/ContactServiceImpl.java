package com.trax_crm.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trax_crm.entity.Contact;
import com.trax_crm.repository.ContactRepository;
@Service
public class ContactServiceImpl implements ContactService {

	@Autowired
	private ContactRepository contactrepo;
	@Override
	public void saveContact(Contact ct) {
		contactrepo.save(ct);
	}
	@Override
	public List<Contact> listAllContact() {
		List<Contact> findAll = contactrepo.findAll();
		return findAll;
	}
	@Override
	public Contact getContactById(long id) {
		Optional<Contact> findById = contactrepo.findById(id);
		Contact contact = findById.get();
		return contact;
	}

}
