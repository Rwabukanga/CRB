package com.CRBProjectt.CRBProjectt.Service;

import java.util.List;
import java.util.Optional;

import com.CRBProjectt.CRBProjectt.domain.Tln03Loan;

public interface Tln03LoanService {
	
	public Tln03Loan createTln03Loan(Tln03Loan client);
	public void updateTln03Loan(Tln03Loan client);
	public void deleteTln03Loan(int id);
	public Optional<Tln03Loan> findByid(int id);
	public List<Tln03Loan> findAll(Class c);

}
