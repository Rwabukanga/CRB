package com.CRBProjectt.CRBProjectt.Service;

import java.util.List;
import java.util.Optional;

import com.CRBProjectt.CRBProjectt.domain.Guarantor;


public interface GuarantorService {
	
	
	public Guarantor createGuarantor(Guarantor guarantor);
	
	public void updateGuarantor(Guarantor guarantor);
	
	public void deleteGuarantor(int id);
	
	public Optional<Guarantor> findByid(int id);
	
	public List<Guarantor> findAll(Class c);

}
