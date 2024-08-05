package com.bank.services.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.bank.services.entity.Service_offers;

@Repository
public interface ServiceRepository extends JpaRepository<Service_offers, Integer> { // Use Integer

    @Query(value = "SELECT service_name FROM services WHERE branch_id = :branchId", nativeQuery = true)
    List<String> findByBranchId(@Param("branchId") Integer branchId);

}
