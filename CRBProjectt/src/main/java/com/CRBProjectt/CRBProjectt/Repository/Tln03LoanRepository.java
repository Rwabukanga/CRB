package com.CRBProjectt.CRBProjectt.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.CRBProjectt.CRBProjectt.domain.Tln03Loan;

@Repository
public interface Tln03LoanRepository extends JpaRepository<Tln03Loan, Integer> {

	public Optional<Tln03Loan> findByid(int id);
}
