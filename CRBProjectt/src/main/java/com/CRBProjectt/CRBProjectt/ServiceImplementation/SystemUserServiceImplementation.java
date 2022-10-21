package com.CRBProjectt.CRBProjectt.ServiceImplementation;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CRBProjectt.CRBProjectt.Repository.SystemUserRepository;
import com.CRBProjectt.CRBProjectt.Service.SystemUserService;
import com.CRBProjectt.CRBProjectt.domain.SystemUser;

@Service
public class SystemUserServiceImplementation implements SystemUserService {

	@Autowired
	private SystemUserRepository userrepo;
	
	@Override
	public void createUser(SystemUser user) {
		// TODO Auto-generated method stub
		userrepo.save(user);
	}

	

	

}
