package com.ecommerce.sportsshoe.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ecommerce.sportsshoe.Model.AdminModel;

public interface adminRepository extends JpaRepository<AdminModel, Integer> {

}
