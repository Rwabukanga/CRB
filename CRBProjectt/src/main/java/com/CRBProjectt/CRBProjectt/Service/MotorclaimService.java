package com.CRBProjectt.CRBProjectt.Service;

import java.util.List;
import java.util.Optional;

import com.CRBProjectt.CRBProjectt.domain.Motorclaim;

public interface MotorclaimService {
	
	public Motorclaim createMotorclaim(Motorclaim claim);
	public void updateMotorclaim(Motorclaim claim);
	public void deleteMotorclaim(int id);
	public Optional<Motorclaim> findByid(int id);
	public List<Motorclaim> findAll(Class c);


}
