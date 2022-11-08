package com.CRBProjectt.CRBProjectt.Service;

import java.util.List;
import java.util.Optional;

import com.CRBProjectt.CRBProjectt.domain.Tcl01Client;

public interface Tcl01ClientService {
	
	public Tcl01Client createTcl01Client(Tcl01Client client);
	public void updateTcl01Client(Tcl01Client client);
	public void deleteTcl01Client(int id);
	public Optional<Tcl01Client> findByid(int id);
	public List<Tcl01Client> findAll(Class c);
	Optional<Tcl01Client> findByEmailAddress(String emailAddress);

}
