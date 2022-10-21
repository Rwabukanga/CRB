package com.CRBProjectt.CRBProjectt.Service;

import java.util.List;
import java.util.Optional;

import com.CRBProjectt.CRBProjectt.domain.Tcl550MaritStatus;

public interface Tcl550MaritStatusService {
	
	public Tcl550MaritStatus createMartalStatus(Tcl550MaritStatus client);
	public void updateTcl550MaritStatus(Tcl550MaritStatus client);
	public void deleteTcl550MaritStatus(int id);
	public Optional<Tcl550MaritStatus> findByid(int id);
	public List<Tcl550MaritStatus> findAll(Class c);

}
