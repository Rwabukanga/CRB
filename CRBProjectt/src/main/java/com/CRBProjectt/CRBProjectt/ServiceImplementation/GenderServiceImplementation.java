package com.CRBProjectt.CRBProjectt.ServiceImplementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CRBProjectt.CRBProjectt.Repository.GenderRepository;
import com.CRBProjectt.CRBProjectt.Service.GenderService;
import com.CRBProjectt.CRBProjectt.domain.Gender;

@Service
public class GenderServiceImplementation implements GenderService {

	@Autowired
	private GenderRepository genderrepo;

	@Override
	public Gender createGender(Gender gender) {
		// TODO Auto-generated method stub
		return genderrepo.save(gender);
	}

	@Override
	public void updateGender(Gender gender) {
		// TODO Auto-generated method stub
		genderrepo.save(gender);
	}

	@Override
	public void deleteGender(int id) {
		// TODO Auto-generated method stub
		genderrepo.deleteById(id);
	}

	@Override
	public Optional<Gender> findByid(int id) {
		// TODO Auto-generated method stub
		return genderrepo.findByid(id);
	}

	@Override
	public List<Gender> findAll(Class c) {
		// TODO Auto-generated method stub
		return genderrepo.findAll();
	}
	
	
	
}
