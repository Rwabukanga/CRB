package com.CRBProjectt.CRBProjectt.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.CRBProjectt.CRBProjectt.domain.SystemUser;

@Repository
public interface SystemUserRepository extends JpaRepository<SystemUser, Integer> {

	Optional<SystemUser> findById(int id);
	SystemUser findByUsername(String username);
}
