package com.CRBProjectt.CRBProjectt.Service;

import java.util.Optional;

import com.CRBProjectt.CRBProjectt.domain.SystemUser;

public interface SystemUserService {

	public void createUser(SystemUser user);
	
	//public Optional<SystemUser> findByUsername(String username);
}
