package com.CRBProjectt.CRBProjectt.ServiceImplementation;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CRBProjectt.CRBProjectt.Repository.PropertyinsuranceRepository;
import com.CRBProjectt.CRBProjectt.Service.PropertyinsuranceService;
import com.CRBProjectt.CRBProjectt.domain.Propertyinsurance;


@Service
@Transactional
public class PropertyinsuranceServiceImplementation implements PropertyinsuranceService{

	@Autowired
	private PropertyinsuranceRepository proinsrepo;

	@Override
	public Propertyinsurance createPropertyinsurance(Propertyinsurance province) {
		// TODO Auto-generated method stub
		return proinsrepo.save(province);
	}

	@Override
	public void updatePropertyinsurance(Propertyinsurance province) {
		// TODO Auto-generated method stub
		proinsrepo.save(province);
	}

	@Override
	public void deletePropertyinsurance(int id) {
		// TODO Auto-generated method stub
		proinsrepo.deleteById(id);
	}

	@Override
	public Optional<Propertyinsurance> findByid(int id) {
		// TODO Auto-generated method stub
		return proinsrepo.findById(id);
	}

	@Override
	public List<Propertyinsurance> findAll(Class c) {
		// TODO Auto-generated method stub
		return proinsrepo.findAll();
	}
	
	
	
}
