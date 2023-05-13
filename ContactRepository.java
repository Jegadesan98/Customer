package com.customer.repository;

import org.springframework.data.repository.CrudRepository;

import com.customer.entity.Contact;

public interface ContactRepository extends CrudRepository<Contact, Integer> {

}
