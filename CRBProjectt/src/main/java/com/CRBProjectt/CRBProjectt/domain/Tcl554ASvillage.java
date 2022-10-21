package com.CRBProjectt.CRBProjectt.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Tcl554ASvillage {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	
	private String name;
	
	@ManyToOne
	private Cell cellid;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Cell getCellid() {
		return cellid;
	}

	public void setCellid(Cell cellid) {
		this.cellid = cellid;
	}

	
	
	
	
	
}
