package com.ecommerce.sportsshoe.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.sportsshoe.Model.CustomerModel;

public interface  CustomerRepository extends JpaRepository<CustomerModel, Integer>{
	
	
}
