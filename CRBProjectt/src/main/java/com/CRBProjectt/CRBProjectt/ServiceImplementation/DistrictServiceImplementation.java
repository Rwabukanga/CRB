package com.CRBProjectt.CRBProjectt.ServiceImplementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CRBProjectt.CRBProjectt.Repository.DistrictRepository;
import com.CRBProjectt.CRBProjectt.Service.DistrictService;
import com.CRBProjectt.CRBProjectt.domain.District;

@Service
public class DistrictServiceImplementation implements DistrictService {
	
	@Autowired
	private DistrictRepository districtrepo;

	@Override
	public District createDistrict(District district) {
		// TODO Auto-generated method stub
		return districtrepo.save(district);
	}

	@Override
	public void updateDistrict(District district) {
		// TODO Auto-generated method stub
		districtrepo.save(district);
	}

	@Override
	public void deleteDistrict(int id) {
		// TODO Auto-generated method stub
		districtrepo.deleteById(id);
	}

	@Override
	public Optional<District> findByid(int id) {
		// TODO Auto-generated method stub
		return districtrepo.findByid(id);
	}

	@Override
	public List<District> findAll(Class c) {
		// TODO Auto-generated method stub
		return districtrepo.findAll();
	}

}
