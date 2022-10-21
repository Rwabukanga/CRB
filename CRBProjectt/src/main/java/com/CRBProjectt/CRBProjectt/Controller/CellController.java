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

import com.CRBProjectt.CRBProjectt.InnerDomain.InnerCell;
import com.CRBProjectt.CRBProjectt.Service.CellService;
import com.CRBProjectt.CRBProjectt.Service.SectorService;
import com.CRBProjectt.CRBProjectt.Utility.Messages;
import com.CRBProjectt.CRBProjectt.Utility.ResponseBean;
import com.CRBProjectt.CRBProjectt.domain.Cell;
import com.CRBProjectt.CRBProjectt.domain.Sector;

@Controller
@CrossOrigin
@RequestMapping(value="/cell")
public class CellController {
	
	@Autowired
	private CellService cellservice;
	
	@Autowired
	private SectorService sectorservice;
	
	
	
	@CrossOrigin
	@RequestMapping(value="/savecell", method=RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE )
	public ResponseEntity<Object> createCell(HttpServletRequest request, @RequestBody InnerCell cell){
		
		ResponseBean rb = new ResponseBean();
		
		try {
			
			Optional<Sector> sector= sectorservice.findByid(cell.getSectorid());
			
			Sector s = sector.get();
			
			if(s==null) {
				rb.setCode(Messages.ERROR_CODE);
				rb.setDescription("failed to find it");
			}else {
				Cell c = new Cell();
				c.setName(cell.getName());
				c.setSectorid(s);
				cellservice.createCell(c);
				
				rb.setCode(Messages.SUCCESS_CODE);
				rb.setDescription(Messages.save);
				rb.setObject(c);
			}
			
			
		}catch(Exception ex) {
			ex.printStackTrace();
			rb.setCode(Messages.ERROR_CODE);
			rb.setDescription("fail to save");
		}
		
		return new ResponseEntity<Object>(rb, HttpStatus.OK);
		
		
	}
	
	
	

}
