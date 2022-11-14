package com.CRBProjectt.CRBProjectt.ServiceImplementation;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CRBProjectt.CRBProjectt.Repository.ShareholderRepository;
import com.CRBProjectt.CRBProjectt.Service.ShareholderService;
import com.CRBProjectt.CRBProjectt.domain.Shareholder;

@Service
@Transactional
public class ShareholderServiceImplementation implements ShareholderService{

	
	@Autowired
	private ShareholderRepository sharerepo;
	
	
	@Override
	public Shareholder createShareholder(Shareholder shareholder) {
		// TODO Auto-generated method stub
		return sharerepo.save(shareholder);
	}

	@Override
	public void updateShareholder(Shareholder shareholder) {
		// TODO Auto-generated method stub
		sharerepo.save(shareholder);
	}

	@Override
	public void deleteShareholder(int id) {
		// TODO Auto-generated method stub
		sharerepo.deleteById(id);
	}

	@Override
	public Optional<Shareholder> findByid(int id) {
		// TODO Auto-generated method stub
		return sharerepo.findByid(id);
	}

	@Override
	public List<Shareholder> findAll(Class c) {
		// TODO Auto-generated method stub
		return sharerepo.findAll();
	}
	
	

}
