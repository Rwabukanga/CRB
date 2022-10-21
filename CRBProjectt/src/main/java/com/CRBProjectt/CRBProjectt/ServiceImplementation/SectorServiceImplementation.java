package com.CRBProjectt.CRBProjectt.ServiceImplementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CRBProjectt.CRBProjectt.Repository.SectorRepository;
import com.CRBProjectt.CRBProjectt.Service.SectorService;
import com.CRBProjectt.CRBProjectt.domain.Sector;

@Service
public class SectorServiceImplementation implements SectorService {
	
	@Autowired
	private SectorRepository sectorrepo;

	@Override
	public Sector createSector(Sector province) {
		// TODO Auto-generated method stub
		return sectorrepo.save(province);
	}

	@Override
	public void updateSector(Sector province) {
		// TODO Auto-generated method stub
		sectorrepo.save(province);
	}

	@Override
	public void deleteSector(int id) {
		// TODO Auto-generated method stub
		sectorrepo.deleteById(id);
	}

	@Override
	public Optional<Sector> findByid(int id) {
		// TODO Auto-generated method stub
		return sectorrepo.findByid(id);
	}

	@Override
	public List<Sector> findAll(Class c) {
		// TODO Auto-generated method stub
		return sectorrepo.findAll();
	}
	
	
	

}
