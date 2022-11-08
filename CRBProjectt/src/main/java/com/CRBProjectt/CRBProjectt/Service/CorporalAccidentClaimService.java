package com.CRBProjectt.CRBProjectt.Service;

import java.util.List;
import java.util.Optional;

import com.CRBProjectt.CRBProjectt.domain.CorporalAccidentClaim;

public interface CorporalAccidentClaimService {

	public CorporalAccidentClaim createCorporal(CorporalAccidentClaim coll);
	public void updateCorporal(CorporalAccidentClaim coll);
	public void deleteCorporal(int id);
	public Optional<CorporalAccidentClaim> findByid(int id);
	public List<CorporalAccidentClaim> findAll(Class c);
	
}
