package com.CRBProjectt.CRBProjectt.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.CRBProjectt.CRBProjectt.domain.District;



@Repository
public interface DistrictRepository extends JpaRepository<District, Integer> {

	public Optional<District> findByid(int id);
}
