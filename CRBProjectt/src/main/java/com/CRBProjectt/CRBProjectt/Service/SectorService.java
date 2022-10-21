package com.CRBProjectt.CRBProjectt.Service;

import java.util.List;
import java.util.Optional;

import com.CRBProjectt.CRBProjectt.domain.Sector;

public interface SectorService {

	public Sector createSector(Sector province);
	public void updateSector(Sector province);
	public void deleteSector(int id);
	public Optional<Sector> findByid(int id);
	public List<Sector> findAll(Class c);
}
