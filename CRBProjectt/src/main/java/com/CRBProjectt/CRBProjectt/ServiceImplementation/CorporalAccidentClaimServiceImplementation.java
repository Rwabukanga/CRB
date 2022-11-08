package com.CRBProjectt.CRBProjectt.ServiceImplementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CRBProjectt.CRBProjectt.Repository.CorporalAccidentClaimRepository;
import com.CRBProjectt.CRBProjectt.Service.CorporalAccidentClaimService;
import com.CRBProjectt.CRBProjectt.domain.CorporalAccidentClaim;


@Service
public class CorporalAccidentClaimServiceImplementation implements CorporalAccidentClaimService {

	@Autowired
	private CorporalAccidentClaimRepository corporalrepo;
	
	@Override
	public CorporalAccidentClaim createCorporal(CorporalAccidentClaim coll) {
		// TODO Auto-generated method stub
		return corporalrepo.save(coll);
	}

	@Override
	public void updateCorporal(CorporalAccidentClaim coll) {
		// TODO Auto-generated method stub
		corporalrepo.save(coll);
	}

	@Override
	public void deleteCorporal(int id) {
		// TODO Auto-generated method stub
		corporalrepo.deleteById(id);
	}

	@Override
	public Optional<CorporalAccidentClaim> findByid(int id) {
		// TODO Auto-generated method stub
		return corporalrepo.findById(id);
	}

	@Override
	public List<CorporalAccidentClaim> findAll(Class c) {
		// TODO Auto-generated method stub
		return corporalrepo.findAll();
	}

}
