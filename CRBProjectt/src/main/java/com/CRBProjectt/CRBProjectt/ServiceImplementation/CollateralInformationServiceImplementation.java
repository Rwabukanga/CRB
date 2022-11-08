package com.CRBProjectt.CRBProjectt.ServiceImplementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CRBProjectt.CRBProjectt.Repository.CollateralInformationRepository;
import com.CRBProjectt.CRBProjectt.Service.CollateralInformationService;
import com.CRBProjectt.CRBProjectt.domain.CollateralInformation;


@Service
public class CollateralInformationServiceImplementation implements CollateralInformationService {
	
	
	@Autowired
	private CollateralInformationRepository collrepo;

	@Override
	public CollateralInformation createCollateral(CollateralInformation coll) {
		// TODO Auto-generated method stub
		return collrepo.save(coll);
	}

	@Override
	public void updateCollateral(CollateralInformation coll) {
		// TODO Auto-generated method stub
		collrepo.save(coll);
	}

	@Override
	public void deleteCollateralInformation(int id) {
		// TODO Auto-generated method stub
		collrepo.deleteById(id);
	}

	@Override
	public Optional<CollateralInformation> findByid(int id) {
		// TODO Auto-generated method stub
		return collrepo.findById(id);
	}

	@Override
	public List<CollateralInformation> findAll(Class c) {
		// TODO Auto-generated method stub
		return collrepo.findAll();
	}

}
