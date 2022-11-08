package com.CRBProjectt.CRBProjectt.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.CRBProjectt.CRBProjectt.domain.CorporateCredit;

@Repository
public interface CorporateCreditRepository extends JpaRepository<CorporateCredit, Integer> {
	
	Optional<CorporateCredit> findById(int id);

}
