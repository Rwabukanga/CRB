package com.CRBProjectt.CRBProjectt.Controller;

import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.CRBProjectt.CRBProjectt.InnerDomain.InnerSector;
import com.CRBProjectt.CRBProjectt.Service.DistrictService;
import com.CRBProjectt.CRBProjectt.Service.SectorService;
import com.CRBProjectt.CRBProjectt.Utility.Messages;
import com.CRBProjectt.CRBProjectt.Utility.ResponseBean;
import com.CRBProjectt.CRBProjectt.domain.District;
import com.CRBProjectt.CRBProjectt.domain.Sector;

@CrossOrigin
@Controller
@RequestMapping(value="/sector")
public class SectorController {
	
	@Autowired
	private SectorService sectorservice;
	
	@Autowired
	private DistrictService districtservice;
	
	
	@CrossOrigin
	@RequestMapping(value="/savesector", method=RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE )
	public ResponseEntity<Object> createSector(HttpServletRequest request, @RequestBody InnerSector sector){
		
		ResponseBean rb = new ResponseBean();
		
		try {
			District district = null;
			Optional<District> d = districtservice.findByid(sector.getDistrictid());
			if(d.isPresent()) {
				district = d.get();
			}
			
			Sector s = new Sector();
			
			s.setName(sector.getName());
			
			s.setDistrictid(district);
			
			 sectorservice.createSector(s);
			  
				rb.setCode(Messages.SUCCESS_CODE);
				rb.setDescription(Messages.save);
				rb.setObject(s);	
			
		}catch(Exception ex) {
			ex.printStackTrace();
			rb.setCode(Messages.ERROR_CODE);
			rb.setDescription("fail to save");
		}
		
		return new ResponseEntity<Object>(rb, HttpStatus.OK);
		
		
	}

}
