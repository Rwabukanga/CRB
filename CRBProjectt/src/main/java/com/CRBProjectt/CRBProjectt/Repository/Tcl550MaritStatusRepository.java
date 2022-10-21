package com.CRBProjectt.CRBProjectt.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.CRBProjectt.CRBProjectt.domain.Tcl550MaritStatus;

@Repository
public interface Tcl550MaritStatusRepository extends JpaRepository<Tcl550MaritStatus, Integer> {

	public Optional<Tcl550MaritStatus> findByid(int id);
}
