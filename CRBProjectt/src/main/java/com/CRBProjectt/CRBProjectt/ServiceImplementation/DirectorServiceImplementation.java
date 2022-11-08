package com.CRBProjectt.CRBProjectt.ServiceImplementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CRBProjectt.CRBProjectt.Repository.DirectorRepository;
import com.CRBProjectt.CRBProjectt.Service.DirectorService;
import com.CRBProjectt.CRBProjectt.domain.Director;

@Service
public class DirectorServiceImplementation implements DirectorService {

	@Autowired
	private DirectorRepository dirrepo;
	
	@Override
	public Director createDirector(Director director) {
		// TODO Auto-generated method stub
		return dirrepo.save(director);
	}

	@Override
	public void updateDirector(Director director) {
		// TODO Auto-generated method stub
		dirrepo.save(director);
	}

	@Override
	public void deleteCountry(int id) {
		// TODO Auto-generated method stub
		dirrepo.deleteById(id);
	}

	@Override
	public Optional<Director> findByid(int id) {
		// TODO Auto-generated method stub
		return dirrepo.findById(id);
	}

	@Override
	public List<Director> findAll(Class c) {
		// TODO Auto-generated method stub
		return dirrepo.findAll();
	}

}
