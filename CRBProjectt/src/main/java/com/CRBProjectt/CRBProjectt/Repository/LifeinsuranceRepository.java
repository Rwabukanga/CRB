package com.CRBProjectt.CRBProjectt.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.CRBProjectt.CRBProjectt.domain.Lifeinsurance;

@Repository
public interface LifeinsuranceRepository extends JpaRepository<Lifeinsurance, Integer> {

	Optional<Lifeinsurance> findById(int id);
}
