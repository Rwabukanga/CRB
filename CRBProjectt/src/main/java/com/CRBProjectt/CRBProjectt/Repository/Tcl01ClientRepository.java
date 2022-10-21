package com.CRBProjectt.CRBProjectt.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.CRBProjectt.CRBProjectt.domain.Tcl01Client;

@Repository
public interface Tcl01ClientRepository extends JpaRepository<Tcl01Client, Integer> {

	public Optional<Tcl01Client> findByid(int id);
}
