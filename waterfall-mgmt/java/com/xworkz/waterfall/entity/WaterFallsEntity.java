package com.xworkz.waterfall.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@NoArgsConstructor
@Entity
@Table(name = "WATER_FALLS")

public class WaterFallsEntity {

	@Id
	@Column(name = "WID")
	private int wid;
	@Column(name = "NAME")

	private String name;
	@Column(name = "LOCATION")

	private String location;
	@Column(name = "HEIGHT")

	private double height;
	@Column(name = "DEPTH")

	private double depth;
	@Column(name = "ELECTRICITYGENERATED")

	private boolean electricityGenerated;
	@Column(name = "SOURCERIVER")

	private String sourceRiver;
	@Column(name = "ENTRYFEES")

	private int entryFees;
	@Column(name = "DESTINATION")

	private String destination;
	@Column(name = "RATING")

	private double rating;
	@Column(name = "NOOFDEATH")

	private int noOfDeaths;
	@Column(name = "NOOFVISITORS")

	private int noOfVisistors;

}
