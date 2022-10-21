package com.CRBProjectt.CRBProjectt.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.CRBProjectt.CRBProjectt.domain.Cell;



@Repository
public interface CellRepository extends JpaRepository<Cell, Integer> {

	public Optional<Cell> findByid(int id);
}
