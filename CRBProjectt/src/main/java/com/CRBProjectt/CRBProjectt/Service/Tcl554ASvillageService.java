package com.CRBProjectt.CRBProjectt.Service;

import java.util.List;
import java.util.Optional;

import com.CRBProjectt.CRBProjectt.domain.Tcl554ASvillage;

public interface Tcl554ASvillageService {

	
	public Tcl554ASvillage createTcl01Client(Tcl554ASvillage client);
	public void updateTcl554ASvillage(Tcl554ASvillage client);
	public void deleteTcl554ASvillage(int id);
	public Optional<Tcl554ASvillage> findByid(int id);
	public List<Tcl554ASvillage> findAll(Class c);
}
