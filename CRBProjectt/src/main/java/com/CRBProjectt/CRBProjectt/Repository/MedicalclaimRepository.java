package com.CRBProjectt.CRBProjectt.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.CRBProjectt.CRBProjectt.domain.Medicalclaim;

@Repository
public interface MedicalclaimRepository extends JpaRepository<Medicalclaim, Integer> {


	Optional<Medicalclaim> findById(int id);

}
