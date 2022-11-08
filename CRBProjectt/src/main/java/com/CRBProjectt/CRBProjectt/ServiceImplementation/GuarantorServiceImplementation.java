package com.CRBProjectt.CRBProjectt.ServiceImplementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CRBProjectt.CRBProjectt.Repository.GuarantorRepository;
import com.CRBProjectt.CRBProjectt.Service.GuarantorService;
import com.CRBProjectt.CRBProjectt.domain.Guarantor;

@Service
public class GuarantorServiceImplementation implements GuarantorService {

	@Autowired
	private GuarantorRepository grepo;
	
	@Override
	public Guarantor createGuarantor(Guarantor guarantor) {
		// TODO Auto-generated method stub
		return grepo.save(guarantor);
	}

	@Override
	public void updateGuarantor(Guarantor guarantor) {
		// TODO Auto-generated method stub
		grepo.save(guarantor);
	}

	@Override
	public void deleteGuarantor(int id) {
		// TODO Auto-generated method stub
		grepo.deleteById(id);
	}

	@Override
	public Optional<Guarantor> findByid(int id) {
		// TODO Auto-generated method stub
		return grepo.findById(id);
	}

	@Override
	public List<Guarantor> findAll(Class c) {
		// TODO Auto-generated method stub
		return grepo.findAll();
	}

}
