package com.CRBProjectt.CRBProjectt.ServiceImplementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CRBProjectt.CRBProjectt.Repository.CountryRepository;
import com.CRBProjectt.CRBProjectt.Service.CountryService;
import com.CRBProjectt.CRBProjectt.domain.Country;

@Service
public class CountryServiceImplementation implements CountryService {
	
	@Autowired
	private CountryRepository countryrepo;

	@Override
	public Country createCountry(Country country) {
		// TODO Auto-generated method stub
		return countryrepo.save(country);
	}

	@Override
	public void updateCountry(Country country) {
		// TODO Auto-generated method stub
		countryrepo.save(country);
	}

	@Override
	public void deleteCountry(int id) {
		// TODO Auto-generated method stub
		countryrepo.deleteById(id);
	}

	@Override
	public Optional<Country> findByid(int id) {
		// TODO Auto-generated method stub
		return countryrepo.findByid(id);
	}

	@Override
	public List<Country> findAll(Class c) {
		// TODO Auto-generated method stub
		return countryrepo.findAll();
	}
	
	
	
	

}
