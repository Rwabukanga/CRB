package com.CRBProjectt.CRBProjectt.ServiceImplementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.CRBProjectt.CRBProjectt.Repository.SystemUserRepository;
import com.CRBProjectt.CRBProjectt.domain.SystemUser;


@Service
public class MyUserDetailsService implements UserDetailsService {

	@Autowired
	private  SystemUserRepository userRepo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
//		return userRepo.findByUsername(username)
//                .orElseThrow(
//                        () -> new UsernameNotFoundException("User " + username + " not found"));
		SystemUser user = userRepo.findByUsername(username);
		
		if (user == null) {
			throw new UsernameNotFoundException("Could not find user");
		}
		
		return user;
	}

}
