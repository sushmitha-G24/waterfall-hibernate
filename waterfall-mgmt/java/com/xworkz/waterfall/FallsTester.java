package com.xworkz.waterfall;

import com.xworkz.waterfall.dao.WaterFallsDAOImpl;
import com.xworkz.waterfall.dao.waterFallsDAO;
import com.xworkz.waterfall.entity.WaterFallsEntity;

public class FallsTester {

	public static void main(String[] args) {
		WaterFallsEntity entity=new WaterFallsEntity();
		
		entity.setWid(1);
		entity.setName("kunckikal falls");
		entity.setLocation("shivamoga");
		entity.setHeight(536);
		entity.setDepth(3454);
		entity.setElectricityGenerated(true);
		entity.setDestination("jogfalls");
		entity.setSourceRiver("tunga");
		entity.setEntryFees(50);
		entity.setNoOfDeaths(6);
		entity.setNoOfVisistors(30000);
		entity.setRating(4.5);
		
		waterFallsDAO dao=new WaterFallsDAOImpl();
		dao.create(entity);
		

	}

}
