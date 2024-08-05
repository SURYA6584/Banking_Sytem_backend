package com.bank.services.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.bank.services.entity.Branches;


@Repository
public interface BranchRepository extends JpaRepository<Branches, String> {

	@Query(value="SELECT BRANCH_ID,BRANCH_NAME FROM BRACHES",nativeQuery = true)
	public List<Branches> getBranches();
}
