package com.xworkz.waterfall.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Entity
@Table(name="STATE")

public class StateEntity {

	@Id
	@Column(name = "ID")
	private int id;
	@Column(name = "NAME")
	private String name;
	@Column(name = "LANGUAGE")
	private String language;
	@Column(name = "POPULATION")
	private double population;
	@Column(name = "NO_OF_DISTRICTS")
	private int noOfDistricts;

}
