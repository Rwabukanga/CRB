package com.CRBProjectt.CRBProjectt.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.CRBProjectt.CRBProjectt.domain.Director;

@Repository
public interface DirectorRepository extends JpaRepository<Director, Integer> {

	Optional<Director> findById(int id);
	
}
