package com.gagan.aptagiri.service;

import java.util.List;

import com.gagan.aptagiri.entity.Customer;

public interface CustomerService {
	
	public List<Customer> getCustomers();

	public void saveCustomer(Customer theCustomer);
}
