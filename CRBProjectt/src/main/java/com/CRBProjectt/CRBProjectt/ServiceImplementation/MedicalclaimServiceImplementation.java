package com.CRBProjectt.CRBProjectt.ServiceImplementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CRBProjectt.CRBProjectt.Repository.MedicalclaimRepository;
import com.CRBProjectt.CRBProjectt.Service.MedicalclaimService;
import com.CRBProjectt.CRBProjectt.domain.Medicalclaim;

@Service
public class MedicalclaimServiceImplementation implements MedicalclaimService{

	@Autowired
	private MedicalclaimRepository mlrepo;

	
	@Override
	public Medicalclaim createMedicalclaim(Medicalclaim claim) {
		// TODO Auto-generated method stub
		return mlrepo.save(claim);
	}

	@Override
	public void updateMedicalclaim(Medicalclaim claim) {
		// TODO Auto-generated method stub
		mlrepo.save(claim);
	}

	@Override
	public void deleteMedicalclaim(int id) {
		// TODO Auto-generated method stub
		mlrepo.deleteById(id);
	}

	@Override
	public Optional<Medicalclaim> findByid(int id) {
		// TODO Auto-generated method stub
		return mlrepo.findById(id);
	}

	@Override
	public List<Medicalclaim> findAll(Class c) {
		// TODO Auto-generated method stub
		return mlrepo.findAll();
	}
}
