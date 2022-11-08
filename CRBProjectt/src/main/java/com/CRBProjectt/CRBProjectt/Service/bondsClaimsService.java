package com.CRBProjectt.CRBProjectt.Service;

import java.util.List;
import java.util.Optional;

import com.CRBProjectt.CRBProjectt.domain.Bondsclaim;

public interface bondsClaimsService {

	
	public Bondsclaim createBondsclaim(Bondsclaim cell);
	public void updateBondsclaim(Bondsclaim cell);
	public void deleteBondsclaim(int id);
	public Optional<Bondsclaim> findByid(int id);
	public List<Bondsclaim> findAll(Class c);
}
