package com.CRBProjectt.CRBProjectt.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.CRBProjectt.CRBProjectt.domain.Motorclaim;

@Repository
public interface MotorclaimRepository extends JpaRepository<Motorclaim, Integer> {

	
	public Optional<Motorclaim> findByid(int id);
	
}
