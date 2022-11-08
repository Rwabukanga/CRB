package com.CRBProjectt.CRBProjectt.ServiceImplementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CRBProjectt.CRBProjectt.Repository.Tcl01ClientRepository;
import com.CRBProjectt.CRBProjectt.Service.Tcl01ClientService;
import com.CRBProjectt.CRBProjectt.domain.Tcl01Client;

@Service
public class Tcl01ClientServiceImplementation implements Tcl01ClientService {
	
	@Autowired
	private Tcl01ClientRepository clientrepo;

	@Override
	public Tcl01Client createTcl01Client(Tcl01Client client) {
		// TODO Auto-generated method stub
		return clientrepo.save(client);
	}

	@Override
	public void updateTcl01Client(Tcl01Client client) {
		// TODO Auto-generated method stub
		clientrepo.save(client);
	}

	@Override
	public void deleteTcl01Client(int id) {
		// TODO Auto-generated method stub
		clientrepo.deleteById(id);
	}

	@Override
	public Optional<Tcl01Client> findByid(int id) {
		// TODO Auto-generated method stub
		return clientrepo.findByid(id);
	}

	@Override
	public List<Tcl01Client> findAll(Class c) {
		// TODO Auto-generated method stub
		return clientrepo.findAll();
	}

	@Override
	public Optional<Tcl01Client> findByEmailAddress(String emailAddress) {
		// TODO Auto-generated method stub
		return clientrepo.findByEmailAddress(emailAddress);
	}
	
	
	
	
	
	
	
	

}
