package com.CRBProjectt.CRBProjectt.ServiceImplementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CRBProjectt.CRBProjectt.Repository.BouncedChequeRepository;
import com.CRBProjectt.CRBProjectt.Service.BouncedChequeService;
import com.CRBProjectt.CRBProjectt.domain.BouncedCheque;
import com.CRBProjectt.CRBProjectt.domain.Cell;

@Service
public class BouncedChequeServiceImplementation implements BouncedChequeService {

	@Autowired
	private BouncedChequeRepository bouncecheque;
	
	@Override
	public BouncedCheque createBouncedCheque(BouncedCheque cheq) {
		// TODO Auto-generated method stub
		return bouncecheque.save(cheq);
	}

	@Override
	public void updateBouncedCheque(BouncedCheque cheg) {
		// TODO Auto-generated method stub
		bouncecheque.save(cheg);
	}

	@Override
	public void deleteBouncedCheque(int id) {
		// TODO Auto-generated method stub
		bouncecheque.deleteById(id);
	}

	@Override
	public Optional<BouncedCheque> findByid(int id) {
		// TODO Auto-generated method stub
		return bouncecheque.findByid(id);
	}

	@Override
	public List<BouncedCheque> findAll(Class c) {
		// TODO Auto-generated method stub
		return bouncecheque.findAll();
	}

}
