package com.ecommerce.sportsshoe.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.sportsshoe.Model.AdminModel;
import com.ecommerce.sportsshoe.Repository.adminRepository;

@RestController
@Repository
@RequestMapping("/shoe-shop/admin")
public class AdminController {
@Autowired
adminRepository ar;
@GetMapping(value="/display/all")
public List<AdminModel> getCustomers(){
	List<AdminModel> admins = (List<AdminModel>) ar.findAll();
	return admins;
}

@PostMapping(value="/admin/add")
public AdminModel add(@RequestBody AdminModel model) {
	return ar.save(model);
}
@PutMapping(value = "/admin/update")
public AdminModel putProductUpdate(@RequestBody AdminModel model) {
	return ar.save(model);
}

}
