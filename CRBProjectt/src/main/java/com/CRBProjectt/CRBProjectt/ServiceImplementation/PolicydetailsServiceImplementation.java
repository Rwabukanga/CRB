package com.CRBProjectt.CRBProjectt.ServiceImplementation;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CRBProjectt.CRBProjectt.Repository.PolicydetailsRepository;
import com.CRBProjectt.CRBProjectt.Service.PolicydetailsService;
import com.CRBProjectt.CRBProjectt.domain.Policydetails;

@Service
@Transactional
public class PolicydetailsServiceImplementation implements PolicydetailsService {

	@Autowired
	private PolicydetailsRepository  policyrepo;
	
	@Override
	public Policydetails createPolicydetails(Policydetails det) {
		// TODO Auto-generated method stub
		return policyrepo.save(det);
	}

	@Override
	public void updatePolicydetails(Policydetails det) {
		// TODO Auto-generated method stub
		policyrepo.save(det);
	}

	@Override
	public void deletePolicydetails(int id) {
		// TODO Auto-generated method stub
		policyrepo.deleteById(id);
	}

	@Override
	public Optional<Policydetails> findByid(int id) {
		// TODO Auto-generated method stub
		return policyrepo.findById(id);
	}

	@Override
	public List<Policydetails> findAll(Class c) {
		// TODO Auto-generated method stub
		return policyrepo.findAll();
	}

}
