package com.CRBProjectt.CRBProjectt.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.CRBProjectt.CRBProjectt.domain.Mobile;

@Repository
public interface MobileRepository extends JpaRepository<Mobile, Integer> {

	Optional<Mobile> findById(int id);
}
