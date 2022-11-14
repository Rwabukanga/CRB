package com.CRBProjectt.CRBProjectt.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.CRBProjectt.CRBProjectt.domain.Policydetails;
import com.CRBProjectt.CRBProjectt.domain.Propertyinsurance;

@Repository
public interface PropertyinsuranceRepository extends JpaRepository<Propertyinsurance, Integer> {

	Optional<Propertyinsurance> findById(int id);
}
