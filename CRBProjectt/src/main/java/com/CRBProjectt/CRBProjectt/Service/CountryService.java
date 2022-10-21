package com.CRBProjectt.CRBProjectt.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.CRBProjectt.CRBProjectt.domain.Country;

@Service
public interface CountryService {

	public Country createCountry(Country country);
	public void updateCountry(Country country);
	public void deleteCountry(int id);
	public Optional<Country> findByid(int id);
	public List<Country> findAll(Class c);
}
