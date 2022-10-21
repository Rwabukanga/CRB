package com.CRBProjectt.CRBProjectt.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Sector {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name ="name", nullable = false)
	private String name;
	
	@ManyToOne
	@JoinColumn(name="districtid")
	private District districtid;

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

	public District getDistrictid() {
		return districtid;
	}

	public void setDistrictid(District districtid) {
		this.districtid = districtid;
	}

	
	
	
	
}
