package com.CRBProjectt.CRBProjectt.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.CRBProjectt.CRBProjectt.domain.Policydetails;

@Repository
public interface PolicydetailsRepository extends JpaRepository<Policydetails, Integer>{
	
	Optional<Policydetails> findById(int id);

}
