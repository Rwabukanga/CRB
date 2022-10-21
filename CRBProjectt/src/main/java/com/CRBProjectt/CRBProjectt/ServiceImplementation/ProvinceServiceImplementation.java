package com.CRBProjectt.CRBProjectt.ServiceImplementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CRBProjectt.CRBProjectt.Repository.ProvinceRepository;
import com.CRBProjectt.CRBProjectt.Service.ProvinceService;
import com.CRBProjectt.CRBProjectt.domain.Province;

@Service
public class ProvinceServiceImplementation implements ProvinceService {

	@Autowired
	private ProvinceRepository provincerepo;

	@Override
	public Province createProvince(Province province) {
		// TODO Auto-generated method stub
		return provincerepo.save(province);
	}

	@Override
	public void updateProvince(Province province) {
		// TODO Auto-generated method stub
		provincerepo.save(province);
	}

	@Override
	public void deleteProvince(int id) {
		// TODO Auto-generated method stub
		provincerepo.deleteById(id);
	}

	@Override
	public Optional<Province> findByid(int id) {
		// TODO Auto-generated method stub
		return provincerepo.findByid(id);
	}

	@Override
	public List<Province> findAll(Class c) {
		// TODO Auto-generated method stub
		return provincerepo.findAll();
	}
	
	
	
}
