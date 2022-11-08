package com.CRBProjectt.CRBProjectt.Service;

import java.util.List;
import java.util.Optional;

import com.CRBProjectt.CRBProjectt.domain.Country;
import com.CRBProjectt.CRBProjectt.domain.Medicalclaim;

public interface MedicalclaimService {

	public Medicalclaim createMedicalclaim(Medicalclaim claim);
	
	public void updateMedicalclaim(Medicalclaim claim);
	
	public void deleteMedicalclaim(int id);
	
	public Optional<Medicalclaim> findByid(int id);
	
	public List<Medicalclaim> findAll(Class c);
	
}
