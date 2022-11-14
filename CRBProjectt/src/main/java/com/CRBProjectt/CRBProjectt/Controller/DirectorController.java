package com.CRBProjectt.CRBProjectt.Controller;

import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.CRBProjectt.CRBProjectt.Exeption.ResourceNotFoundException;
import com.CRBProjectt.CRBProjectt.InnerDomain.InnerDirector;
import com.CRBProjectt.CRBProjectt.Service.CountryService;
import com.CRBProjectt.CRBProjectt.Service.DirectorService;
import com.CRBProjectt.CRBProjectt.Utility.Messages;
import com.CRBProjectt.CRBProjectt.Utility.ResponseBean;
import com.CRBProjectt.CRBProjectt.domain.Country;
import com.CRBProjectt.CRBProjectt.domain.Director;
import com.CRBProjectt.CRBProjectt.domain.Salutation;


@RestController
@CrossOrigin
@RequestMapping(value="/")
public class DirectorController {

	@Autowired
	private DirectorService dirservice;
	
	@Autowired
	private CountryService countryservice;
	
	
	@CrossOrigin
	@RequestMapping(value="update/director", method=RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE )
	public ResponseEntity<Object> createCell(HttpServletRequest request, @RequestBody InnerDirector dir){
		
		ResponseBean rb = new ResponseBean();
		Country country =null;
	
			
			Director dr = new Director();
			
			Optional<Country> cc = countryservice.findByid(dir.getCountryid());
			
			if(cc.isPresent()) {
				country=cc.get();
				dr.setAccountNumber(dir.getAccountNumber());
				dr.setCountryid(country);
				dr.setDateAppointed(dir.getDateAppointed());
				dr.setDateOfBirth(dir.getDateOfBirth());
				dr.setForeName1(dir.getForeName1());
				dr.setForeName2(dir.getForeName2());
				dr.setForeName3(dir.getForeName3());
				dr.setNationalId(dir.getNationalId());
				dr.setNationality(dir.getNationality());
				dr.setPassportNumber(dir.getPassportNumber());
				dr.setPlaceOfBirth(dir.getPlaceOfBirth());
				dr.setPostalAddressNumber(dir.getPostalAddressNumber());
				dr.setPostalCode(dir.getPostalCode());
				dr.setSalutation(Salutation.Captain);
				dr.setSurName(dir.getSurName());
				dr.setTown(dir.getTown());
				
				dirservice.createDirector(dr);
				rb.setCode(Messages.SUCCESS_CODE);
				rb.setDescription(Messages.save);
				rb.setObject(dr);
				
			}else {
				throw new ResourceNotFoundException("Country Not Found");
			}
			
			
			
			
			
//		}catch(Exception ex) {
//			ex.printStackTrace();
//			rb.setCode(Messages.ERROR_CODE);
//			rb.setDescription("fail to save");
//		}
		
		return new ResponseEntity<Object>(rb, HttpStatus.OK);
		
		
	}
}
