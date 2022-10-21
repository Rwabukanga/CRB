package com.CRBProjectt.CRBProjectt.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.CRBProjectt.CRBProjectt.domain.Gender;

@Service
public interface GenderService {
	
	public Gender createGender(Gender gender);
	public void updateGender(Gender gender);
	public void deleteGender(int id);
	public Optional<Gender> findByid(int id);
	public List<Gender> findAll(Class c);

}
