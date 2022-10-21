package com.CRBProjectt.CRBProjectt.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.CRBProjectt.CRBProjectt.domain.Sector;

@Repository
public interface SectorRepository extends JpaRepository<Sector, Integer> {

	public Optional<Sector> findByid(int id);
}
