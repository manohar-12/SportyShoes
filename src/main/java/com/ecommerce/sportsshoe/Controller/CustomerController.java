package com.ecommerce.sportsshoe.Controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.sportsshoe.Model.*;
import com.ecommerce.sportsshoe.Repository.*;

@RestController
@RequestMapping("/shoe-shop/customers")
public class CustomerController {
	@Autowired(required = true)
	CustomerRepository cust_repo;
	@GetMapping(value = "/display/all")
	public List<CustomerModel> getCustomers(){
		List<CustomerModel> customer = (List<CustomerModel>) cust_repo.findAll();
		return customer;
	}
	
	@GetMapping(value = "/search/id/{id}")
	public Optional<CustomerModel> getCustomerId(@PathVariable int id){
		return cust_repo.findById(id);
	}
}