package com.CRBProjectt.CRBProjectt.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.CRBProjectt.CRBProjectt.domain.Sector;
import com.CRBProjectt.CRBProjectt.domain.Shareholder;

@Repository
public interface ShareholderRepository extends JpaRepository<Shareholder, Integer> {
	
	public Optional<Shareholder> findByid(int id);

}
