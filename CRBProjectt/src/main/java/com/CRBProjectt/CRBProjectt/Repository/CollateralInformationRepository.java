package com.CRBProjectt.CRBProjectt.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.CRBProjectt.CRBProjectt.domain.CollateralInformation;


@Repository
public interface CollateralInformationRepository extends JpaRepository<CollateralInformation, Integer> {

	
	Optional<CollateralInformation> findById(int id);
}
