package com.CRBProjectt.CRBProjectt.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.CRBProjectt.CRBProjectt.domain.CorporalAccidentClaim;


@Repository
public interface CorporalAccidentClaimRepository extends JpaRepository<CorporalAccidentClaim, Integer> {

	Optional<CorporalAccidentClaim> findById(int id);
}
