package com.CRBProjectt.CRBProjectt.Service;

import java.util.List;
import java.util.Optional;

import com.CRBProjectt.CRBProjectt.domain.Transportclaims;



public interface TransportclaimsService {

	public Transportclaims createTransportclaims(Transportclaims cell);
	public void updateTransportclaims(Transportclaims cell);
	public void deleteTransportclaims(int id);
	public Optional<Transportclaims> findByid(int id);
	public List<Transportclaims> findAll(Class c);

	
}
