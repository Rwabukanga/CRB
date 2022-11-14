package com.CRBProjectt.CRBProjectt.Service;

import java.util.List;
import java.util.Optional;

import com.CRBProjectt.CRBProjectt.domain.Shareholder;

public interface ShareholderService {
	
	public Shareholder createShareholder(Shareholder shareholder);
	public void updateShareholder(Shareholder shareholder);
	public void deleteShareholder(int id);
	public Optional<Shareholder> findByid(int id);
	public List<Shareholder> findAll(Class c);

}
