package com.CRBProjectt.CRBProjectt.Service;

import java.util.List;
import java.util.Optional;

import com.CRBProjectt.CRBProjectt.domain.Gender;
import com.CRBProjectt.CRBProjectt.domain.Lifeinsurance;

public interface LifeinsuranceService {
	
	public Lifeinsurance createLifeinsurance(Lifeinsurance lifins);
	public void updateLifeinsurance(Lifeinsurance lifins);
	public void deleteLifeinsurance(int id);
	public Optional<Lifeinsurance> findByid(int id);
	public List<Lifeinsurance> findAll(Class c);

}
