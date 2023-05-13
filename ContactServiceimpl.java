package com.customer.service;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.customer.dto.ContactDTO;
import com.customer.dto.CustomerDTO;
import com.customer.entity.Contact;
import com.customer.entity.Customer;
import com.customer.exception.CustomerException;
import com.customer.repository.CustomerRepository;

@Service(value = "ContactService")
@Transactional
public class ContactServiceimpl implements ContactService {

	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public CustomerDTO getCustomerDetails(Integer customerId) throws CustomerException {
		Optional<Customer> optional = customerRepository.findById(customerId);
		
		Customer customer = optional.orElseThrow(()->new CustomerException("Service.CUSTOMER_NOT_FOUND"));
		CustomerDTO customerDTO = new CustomerDTO();
		
		customerDTO.setCustId(customer.getCustId());
		customerDTO.setCustname(customer.getCustname());
		customerDTO.setCustLoc(customer.getCustLoc());
		customerDTO.setCustEmailId(customer.getCustEmailId());
		customerDTO.setCustAadharNum(customer.getCustAadharNum());
		customerDTO.setCustContactNum(customer.getCustContactNum());
		
		List<Contact> contact = customer.getContactDetails();
		List<ContactDTO> contactDTOs = new LinkedList<>();
		
		if (!contact.isEmpty()) {
			contactDTOs = contact.stream()
					.map(c->new ContactDTO(c.getCustPersonId(),c.getFrndName(),
							c.getFrndEmailId(),c.getFrndPhoneNumber()))
					.collect(Collectors.toList());
		}
		customerDTO.setContactDetails(contactDTOs);
		return customerDTO;
	}
		
	@Override
	public Integer addCustomer(CustomerDTO customerDTO) throws CustomerException {
		
		Customer customer = new Customer();
		customer.setCustId(customerDTO.getCustId());
		customer.setCustname(customerDTO.getCustname());
		customer.setCustContactNum(customer.getCustContactNum());
		customer.setCustLoc(customerDTO.getCustLoc());
		customer.setCustEmailId(customer.getCustEmailId());
		customer.setCustAadharNum(customer.getCustAadharNum());
		
		
		List<ContactDTO> contactDTOs = customerDTO.getContactDetails();
		List<Contact> contactdetails;
		
		contactdetails = contactDTOs.stream()
				.map(c->new Contact(c.getCustPersonId(),c.getFrndName(),c.getFrndEmailId(),c.getFrndPhoneNumber()))
				.collect(Collectors.toList());
		customer.setContactDetails(contactdetails);
		customerRepository.save(customer);
		return customer.getCustId();
		
	}
	
	@Override
	public void deleteCustomer(Integer customerId) throws CustomerException {
		Optional<Customer> optional = customerRepository.findById(customerId);
		Customer customer = optional.orElseThrow(()->new CustomerException("Service.CUSTOMER_DELETED"));
		customerRepository.delete(customer);
	}
}
