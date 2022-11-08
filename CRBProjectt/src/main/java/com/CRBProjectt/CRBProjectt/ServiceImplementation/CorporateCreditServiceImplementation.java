package com.CRBProjectt.CRBProjectt.ServiceImplementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CRBProjectt.CRBProjectt.Repository.CorporateCreditRepository;
import com.CRBProjectt.CRBProjectt.Service.CorporateCreditService;
import com.CRBProjectt.CRBProjectt.domain.CorporateCredit;

@Service
public class CorporateCreditServiceImplementation implements CorporateCreditService {

	@Autowired
	private CorporateCreditRepository corprepo;

	@Override
	public CorporateCredit createCorporateCredit(CorporateCredit coll) {
		// TODO Auto-generated method stub
		return corprepo.save(coll);
	}

	@Override
	public void updateCorporateCredit(CorporateCredit coll) {
		// TODO Auto-generated method stub
		corprepo.save(coll);
	}

	@Override
	public void deleteCorporateCredit(int id) {
		// TODO Auto-generated method stub
		corprepo.deleteById(id);
	}

	@Override
	public Optional<CorporateCredit> findByid(int id) {
		// TODO Auto-generated method stub
		return corprepo.findById(id);
	}

	@Override
	public List<CorporateCredit> findAll(Class c) {
		// TODO Auto-generated method stub
		return corprepo.findAll();
	}
}
