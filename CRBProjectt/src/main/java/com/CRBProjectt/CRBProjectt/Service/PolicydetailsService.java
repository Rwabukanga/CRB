package com.CRBProjectt.CRBProjectt.Service;

import java.util.List;
import java.util.Optional;

import com.CRBProjectt.CRBProjectt.domain.Policydetails;

public interface PolicydetailsService {
	
    public Policydetails createPolicydetails(Policydetails det);
	
	public void updatePolicydetails(Policydetails det);
	
	public void deletePolicydetails(int id);
	
	public Optional<Policydetails> findByid(int id);
	
	public List<Policydetails> findAll(Class c);

}
