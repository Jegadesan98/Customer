package com.customer.service;

import com.customer.dto.CustomerDTO;
import com.customer.exception.CustomerException;

public interface ContactService {
	public CustomerDTO getCustomerDetails(Integer customerId) throws CustomerException;
	public Integer addCustomer(CustomerDTO customerDTO) throws CustomerException;
	public void deleteCustomer(Integer customerId) throws CustomerException;
	

		
}
