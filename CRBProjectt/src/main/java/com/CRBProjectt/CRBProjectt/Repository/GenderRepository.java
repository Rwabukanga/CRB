package com.CRBProjectt.CRBProjectt.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.CRBProjectt.CRBProjectt.domain.Gender;



@Repository
public interface GenderRepository extends JpaRepository<Gender, Integer> {

	public Optional<Gender> findByid(int id);
}
