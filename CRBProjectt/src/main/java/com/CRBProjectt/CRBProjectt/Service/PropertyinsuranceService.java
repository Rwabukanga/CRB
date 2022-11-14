package com.CRBProjectt.CRBProjectt.Service;

import java.util.List;
import java.util.Optional;

import com.CRBProjectt.CRBProjectt.domain.Propertyinsurance;

public interface PropertyinsuranceService {
	
	public Propertyinsurance createPropertyinsurance(Propertyinsurance province);
	public void updatePropertyinsurance(Propertyinsurance province);
	public void deletePropertyinsurance(int id);
	public Optional<Propertyinsurance> findByid(int id);
	public List<Propertyinsurance> findAll(Class c);

}
