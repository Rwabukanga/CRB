package com.CRBProjectt.CRBProjectt.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.CRBProjectt.CRBProjectt.domain.Province;

@Repository
public interface ProvinceRepository extends JpaRepository<Province, Integer> {

	public Optional<Province> findByid(int id);
	
}
