package com.CRBProjectt.CRBProjectt.Service;

import java.util.List;
import java.util.Optional;

import com.CRBProjectt.CRBProjectt.domain.Province;

public interface ProvinceService {
	
	public Province createProvince(Province province);
	public void updateProvince(Province province);
	public void deleteProvince(int id);
	public Optional<Province> findByid(int id);
	public List<Province> findAll(Class c);

}
