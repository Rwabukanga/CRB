package com.CRBProjectt.CRBProjectt.Service;

import java.util.List;
import java.util.Optional;

import com.CRBProjectt.CRBProjectt.domain.BouncedCheque;
import com.CRBProjectt.CRBProjectt.domain.Cell;

public interface BouncedChequeService {

	
	public BouncedCheque createBouncedCheque(BouncedCheque cheq);
	public void updateBouncedCheque(BouncedCheque cheg);
	public void deleteBouncedCheque(int id);
	public Optional<BouncedCheque> findByid(int id);
	public List<BouncedCheque> findAll(Class c);
}
