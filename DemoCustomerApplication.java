package com.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoCustomerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoCustomerApplication.class, args);
	}
}



//@SpringBootApplication
//public class DemoCustomerApplication implements CommandLineRunner {
//	
//	public static final Log LOGGER = LogFactory.getLog(DemoCustomerApplication.class);
//	
//	@Autowired
//	ContactService contactService;
//	
//	@Autowired
//	Environment environment;
//
//	public static void main(String[] args) {
//		SpringApplication.run(DemoCustomerApplication.class, args);
//	}
//
//	@Override
//	public void run(String... args) throws Exception {
//		// TODO Auto-generated method stub
//		
//	}

//	@Override
//	public void run(String... args) throws Exception {
//		addCustomer();
//		getCustomerWithContact();
//		deleteCustomer();
//	}
	
//	public void addCustomer() {
//		try {
//
//			CustomerDTO customerDTO = new CustomerDTO();
//			customerDTO.setCustname("Raj");
//			customerDTO.setCustEmailId("Raj@gmail.com");
//			customerDTO.setCustLoc("India");
//			customerDTO.setCustContactNum(9554534567l);
//			customerDTO.setCustAadharNum("543545346");
//			
//			ContactDTO contactDTO = new ContactDTO();
//			contactDTO.setCusPersonId(100);
//			contactDTO.setCustPersonName("jack");
//			contactDTO.setCustPersonEmailId("jack@gmail.com");
//			contactDTO.setCustPhoneNumber(4534697120l);
//			
//			ContactDTO contactDTO1 = new ContactDTO();
//			contactDTO.setCusPersonId(10002);
//			contactDTO1.setCustPersonName("jackson");
//			contactDTO1.setCustPersonEmailId("jackson@gmail.com");
//			contactDTO1.setCustPhoneNumber(4534697456l);
//
//			List<ContactDTO> contactDTOs = new LinkedList<>();
//			contactDTOs.add(contactDTO);
//			contactDTOs.add(contactDTO1);
//
//			customerDTO.setContactDetails(contactDTOs);
//
//			contactService.addCustomer(customerDTO);
//			LOGGER.info("\n" + environment.getProperty("UserInterface.CONTACTDETAILS_AND_CUSTOMER_ADDED"));
//
//		} catch (Exception e) {
//			String message = environment.getProperty(e.getMessage(),"Some exception occured. check log file");
//			LOGGER.info(message);
//		}
//	}
//	
//	public void getCustomerWithContact() {
//		try {
//			Integer customerId = 100;
//			CustomerDTO customerDTO = contactService.getCustomerDetails(customerId);
//			LOGGER.info(customerDTO);
//			
//			if(customerDTO.getContactDetails().isEmpty()) {
//				LOGGER.info(environment.getProperty("UserInterface.No_Contact"));
//			}
//		}catch(Exception e) {
//			String message = environment.getProperty(e.getMessage(),"Some exception occured.check log file");
//			LOGGER.info(message);
//		}
//		
//	}
//	public void deleteCustomer() {
//		try {
//			Integer customerId = 1002;
//			contactService.deleteCustomer(customerId);
//			LOGGER.info("\n" + environment.getProperty("UserInterface.CUSTOMER_DELETED"));
//
//		} catch (Exception e) {
//			String message = environment.getProperty(e.getMessage(),"Some exception occured. check log file ");
//			LOGGER.info(message);
//		}
//
//	}

