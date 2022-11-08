package com.CRBProjectt.CRBProjectt.ServiceImplementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CRBProjectt.CRBProjectt.Repository.MobileRepository;
import com.CRBProjectt.CRBProjectt.Service.MobileService;
import com.CRBProjectt.CRBProjectt.domain.Mobile;

@Service
public class MobileServiceImplementation implements MobileService {

	@Autowired
	private MobileRepository mobrepo;

	@Override
	public Mobile createMobile(Mobile claim) {
		// TODO Auto-generated method stub
		return mobrepo.save(claim);
	}

	@Override
	public void updateMobile(Mobile claim) {
		// TODO Auto-generated method stub
		mobrepo.save(claim);
	}

	@Override
	public void deleteMobile(int id) {
		// TODO Auto-generated method stub
		mobrepo.deleteById(id);
	}

	@Override
	public Optional<Mobile> findByid(int id) {
		// TODO Auto-generated method stub
		return mobrepo.findById(id);
	}

	@Override
	public List<Mobile> findAll(Class c) {
		// TODO Auto-generated method stub
		return mobrepo.findAll();
	}
	
	
	
	
	
}
