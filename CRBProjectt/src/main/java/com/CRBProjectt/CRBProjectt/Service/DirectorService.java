package com.CRBProjectt.CRBProjectt.Service;

import java.util.List;
import java.util.Optional;

import com.CRBProjectt.CRBProjectt.domain.Director;



public interface DirectorService {

	
	public Director createDirector(Director director);
	public void updateDirector(Director director);
	public void deleteCountry(int id);
	public Optional<Director> findByid(int id);
	public List<Director> findAll(Class c);
}
