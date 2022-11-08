package com.CRBProjectt.CRBProjectt.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.CRBProjectt.CRBProjectt.domain.Bondsclaim;
import com.CRBProjectt.CRBProjectt.domain.Cell;

@Repository
public interface bondsClaimsRepository extends JpaRepository<Bondsclaim, Integer> {

	public Optional<Bondsclaim> findByid(int id);
}
