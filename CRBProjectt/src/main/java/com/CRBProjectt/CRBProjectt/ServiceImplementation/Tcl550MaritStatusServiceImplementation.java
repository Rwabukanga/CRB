package com.CRBProjectt.CRBProjectt.ServiceImplementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CRBProjectt.CRBProjectt.Repository.Tcl550MaritStatusRepository;
import com.CRBProjectt.CRBProjectt.Service.Tcl550MaritStatusService;
import com.CRBProjectt.CRBProjectt.domain.Tcl550MaritStatus;

@Service
public class Tcl550MaritStatusServiceImplementation implements Tcl550MaritStatusService{
	
	@Autowired
	private Tcl550MaritStatusRepository statusrepo;

	@Override
	public Tcl550MaritStatus createMartalStatus(Tcl550MaritStatus client) {
		// TODO Auto-generated method stub
		return statusrepo.save(client);
	}

	@Override
	public void updateTcl550MaritStatus(Tcl550MaritStatus client) {
		// TODO Auto-generated method stub
		statusrepo.save(client);
	}

	@Override
	public void deleteTcl550MaritStatus(int id) {
		// TODO Auto-generated method stub
		statusrepo.deleteById(id);
	}

	@Override
	public Optional<Tcl550MaritStatus> findByid(int id) {
		// TODO Auto-generated method stub
		return statusrepo.findByid(id);
	}

	@Override
	public List<Tcl550MaritStatus> findAll(Class c) {
		// TODO Auto-generated method stub
		return statusrepo.findAll();
	}
	
	

}
