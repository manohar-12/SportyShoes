package com.ecommerce.sportsshoe.Repository;
import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ecommerce.sportsshoe.Model.*;

public interface PurchaseRepository extends JpaRepository<PurchaseModel, Integer>{

	@Query("SELECT p FROM PurchaseModel p WHERE p.purchase_Date = ?1")
	List<PurchaseModel> findByDate(String pd);
	
	//@Query("Select pt from PurchaseModel pt where pt.productModel.shoeCategory=?1")
	//List<PurchaseModel> findByCategory(String pc);
	

}