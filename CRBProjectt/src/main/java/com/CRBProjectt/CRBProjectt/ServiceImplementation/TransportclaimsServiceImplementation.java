package com.CRBProjectt.CRBProjectt.ServiceImplementation;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CRBProjectt.CRBProjectt.Repository.TransportclaimsRepository;
import com.CRBProjectt.CRBProjectt.Service.TransportclaimsService;
import com.CRBProjectt.CRBProjectt.domain.Transportclaims;

@Service
@Transactional
public class TransportclaimsServiceImplementation implements TransportclaimsService {

	@Autowired
	private TransportclaimsRepository trepo;

	@Override
	public Transportclaims createTransportclaims(Transportclaims cell) {
		// TODO Auto-generated method stub
		return trepo.save(cell);
	}

	@Override
	public void updateTransportclaims(Transportclaims cell) {
		// TODO Auto-generated method stub
		trepo.save(cell);
	}

	@Override
	public void deleteTransportclaims(int id) {
		// TODO Auto-generated method stub
		trepo.deleteById(id);
	}

	@Override
	public Optional<Transportclaims> findByid(int id) {
		// TODO Auto-generated method stub
		return trepo.findByid(id);
	}

	@Override
	public List<Transportclaims> findAll(Class c) {
		// TODO Auto-generated method stub
		return trepo.findAll();
	}
	
	
	
	
}
