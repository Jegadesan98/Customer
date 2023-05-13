package com.customer.api;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.customer.dto.CustomerDTO;
import com.customer.exception.CustomerException;
import com.customer.service.ContactService;

@RestController
@RequestMapping(value = "/customer")
public class CustomerApi {
		@Autowired
		private ContactService contactService;
		@Autowired
		private Environment environment;
		
		@GetMapping(value = "/customers/{customerId}")
		public ResponseEntity<CustomerDTO> getCustomer(@PathVariable Integer customerId) throws CustomerException {
			CustomerDTO customer = contactService.getCustomerDetails(customerId);
			return new ResponseEntity<>(customer, HttpStatus.OK);
		}
		@PostMapping(value = "/customers")
		public ResponseEntity<String> addCustomer(@RequestBody CustomerDTO customer) throws CustomerException {
			Integer customerId = contactService.addCustomer(customer);
			String successMessage = environment.getProperty("API.INSERT_SUCCESS") + customerId;
			return new ResponseEntity<>(successMessage, HttpStatus.CREATED);
		}
		
		@DeleteMapping(value = "/customers/{customerId}")
		public ResponseEntity<String> deleteCustomer(@PathVariable Integer customerId) throws CustomerException {
			contactService.deleteCustomer(customerId);
			String successMessage = environment.getProperty("API.DELETE_SUCCESS");
			return new ResponseEntity<>(successMessage, HttpStatus.OK);
		}
	}


