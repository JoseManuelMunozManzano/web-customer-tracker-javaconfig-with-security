package com.neimerc.springdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.neimerc.springdemo.dao.CustomerDAO;
import com.neimerc.springdemo.entity.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {

	// need to inject customer dao
	@Autowired
	private CustomerDAO customerDAO;	
	
	@Override
	@Transactional("TransactionManager")
	public List<Customer> getCustomers() {
		
		return customerDAO.getCustomers();
	}
	
	@Override
	@Transactional("TransactionManager")
	public void saveCustomer(Customer theCustomer) {

		customerDAO.saveCustomer(theCustomer);
	}	
	
	@Override
	@Transactional("TransactionManager")
	public Customer getCustomer(int theId) {
		
		return customerDAO.getCustomer(theId);
	}
	
	@Override
	@Transactional("TransactionManager")
	public void deleteCustomer(int theId) {
		
		customerDAO.deleteCustomer(theId);
	}
	
	@Override
	@Transactional("TransactionManager")
	public List<Customer> searchCustomers(String theSearchName) {
		return customerDAO.searchCustomers(theSearchName);
	}	

}
