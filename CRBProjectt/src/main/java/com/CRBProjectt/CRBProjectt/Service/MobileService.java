package com.CRBProjectt.CRBProjectt.Service;

import java.util.List;
import java.util.Optional;

import com.CRBProjectt.CRBProjectt.domain.Mobile;

public interface MobileService {
	
	
    public Mobile createMobile(Mobile claim);
	
	public void updateMobile(Mobile claim);
	
	public void deleteMobile(int id);
	
	public Optional<Mobile> findByid(int id);
	
	public List<Mobile> findAll(Class c);

}
