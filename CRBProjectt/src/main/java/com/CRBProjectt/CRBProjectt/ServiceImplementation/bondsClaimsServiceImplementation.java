package com.CRBProjectt.CRBProjectt.ServiceImplementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CRBProjectt.CRBProjectt.Repository.bondsClaimsRepository;
import com.CRBProjectt.CRBProjectt.Service.bondsClaimsService;
import com.CRBProjectt.CRBProjectt.domain.Bondsclaim;

@Service
public class bondsClaimsServiceImplementation implements bondsClaimsService {

	@Autowired
	private bondsClaimsRepository bondsrepo;
	
	
	@Override
	public Bondsclaim createBondsclaim(Bondsclaim cell) {
		// TODO Auto-generated method stub
		return bondsrepo.save(cell);
	}

	@Override
	public void updateBondsclaim(Bondsclaim cell) {
		// TODO Auto-generated method stub
		bondsrepo.save(cell);
	}

	@Override
	public void deleteBondsclaim(int id) {
		// TODO Auto-generated method stub
		bondsrepo.deleteById(id);
	}

	@Override
	public Optional<Bondsclaim> findByid(int id) {
		// TODO Auto-generated method stub
		return bondsrepo.findByid(id);
	}

	@Override
	public List<Bondsclaim> findAll(Class c) {
		// TODO Auto-generated method stub
		return bondsrepo.findAll();
	}

}
