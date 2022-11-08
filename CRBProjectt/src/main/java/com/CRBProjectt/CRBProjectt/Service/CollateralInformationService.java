package com.CRBProjectt.CRBProjectt.Service;

import java.util.List;
import java.util.Optional;

import com.CRBProjectt.CRBProjectt.domain.CollateralInformation;

public interface CollateralInformationService {

	
	public CollateralInformation createCollateral(CollateralInformation coll);
	public void updateCollateral(CollateralInformation coll);
	public void deleteCollateralInformation(int id);
	public Optional<CollateralInformation> findByid(int id);
	public List<CollateralInformation> findAll(Class c);
	
}
