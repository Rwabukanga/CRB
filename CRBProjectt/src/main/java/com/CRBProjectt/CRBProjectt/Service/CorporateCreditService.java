package com.CRBProjectt.CRBProjectt.Service;

import java.util.List;
import java.util.Optional;

import com.CRBProjectt.CRBProjectt.domain.CorporateCredit;

public interface CorporateCreditService {

	
	public CorporateCredit createCorporateCredit(CorporateCredit coll);
	public void updateCorporateCredit(CorporateCredit coll);
	public void deleteCorporateCredit(int id);
	public Optional<CorporateCredit> findByid(int id);
	public List<CorporateCredit> findAll(Class c);
}
