package com.CRBProjectt.CRBProjectt.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.CRBProjectt.CRBProjectt.domain.Guarantor;

@Repository
public interface GuarantorRepository extends JpaRepository<Guarantor, Integer> {

	Optional<Guarantor> findById(int id);
}
