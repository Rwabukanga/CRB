package com.CRBProjectt.CRBProjectt.ServiceImplementation;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CRBProjectt.CRBProjectt.Repository.MotorclaimRepository;
import com.CRBProjectt.CRBProjectt.Service.MotorclaimService;
import com.CRBProjectt.CRBProjectt.domain.Motorclaim;


@Service
@Transactional
public class MotorclaimServiceImplementation implements MotorclaimService {
	
	@Autowired
	private MotorclaimRepository mrepo;

	@Override
	public Motorclaim createMotorclaim(Motorclaim claim) {
		// TODO Auto-generated method stub
		return mrepo.save(claim);
	}

	@Override
	public void updateMotorclaim(Motorclaim claim) {
		// TODO Auto-generated method stub
		mrepo.save(claim);
	}

	@Override
	public void deleteMotorclaim(int id) {
		// TODO Auto-generated method stub
		mrepo.deleteById(id);
	}

	@Override
	public Optional<Motorclaim> findByid(int id) {
		// TODO Auto-generated method stub
		return mrepo.findByid(id);
	}

	@Override
	public List<Motorclaim> findAll(Class c) {
		// TODO Auto-generated method stub
		return mrepo.findAll();
	}
	
	
	
	

}
