package com.CRBProjectt.CRBProjectt.Service;

import java.util.List;
import java.util.Optional;

import com.CRBProjectt.CRBProjectt.domain.Cell;

public interface CellService {
	
	public Cell createCell(Cell cell);
	public void updateCell(Cell cell);
	public void deleteCell(int id);
	public Optional<Cell> findByid(int id);
	public List<Cell> findAll(Class c);

}
