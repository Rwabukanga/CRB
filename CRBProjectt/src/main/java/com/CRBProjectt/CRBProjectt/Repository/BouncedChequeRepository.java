package com.CRBProjectt.CRBProjectt.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.CRBProjectt.CRBProjectt.domain.Bondsclaim;
import com.CRBProjectt.CRBProjectt.domain.BouncedCheque;

@Repository
public interface BouncedChequeRepository extends JpaRepository<BouncedCheque, Integer> {

	public Optional<BouncedCheque> findByid(int id);
	
}
