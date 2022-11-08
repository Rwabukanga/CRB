package com.CRBProjectt.CRBProjectt.ServiceImplementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CRBProjectt.CRBProjectt.Repository.LifeinsuranceRepository;
import com.CRBProjectt.CRBProjectt.Service.LifeinsuranceService;
import com.CRBProjectt.CRBProjectt.domain.Lifeinsurance;

@Service
public class LifeinsuranceServiceImplementation implements LifeinsuranceService {

	@Autowired
	private LifeinsuranceRepository lifrepo;
	
	
	@Override
	public Lifeinsurance createLifeinsurance(Lifeinsurance lifins) {
		// TODO Auto-generated method stub
		return lifrepo.save(lifins);
	}

	@Override
	public void updateLifeinsurance(Lifeinsurance lifins) {
		// TODO Auto-generated method stub
		lifrepo.save(lifins);
	}

	@Override
	public void deleteLifeinsurance(int id) {
		// TODO Auto-generated method stub
		lifrepo.deleteById(id);
	}

	@Override
	public Optional<Lifeinsurance> findByid(int id) {
		// TODO Auto-generated method stub
		return lifrepo.findById(id);
	}

	@Override
	public List<Lifeinsurance> findAll(Class c) {
		// TODO Auto-generated method stub
		return lifrepo.findAll();
	}

}
