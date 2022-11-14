package com.CRBProjectt.CRBProjectt.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.CRBProjectt.CRBProjectt.domain.Cell;
import com.CRBProjectt.CRBProjectt.domain.Transportclaims;

@Repository
public interface TransportclaimsRepository extends JpaRepository<Transportclaims, Integer> {
	
	public Optional<Transportclaims> findByid(int id);

}
