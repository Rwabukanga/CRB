package com.CRBProjectt.CRBProjectt.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.CRBProjectt.CRBProjectt.domain.Country;


@Repository
public interface CountryRepository extends JpaRepository<Country, Integer> {

	public Optional<Country> findByid(int id);
}
