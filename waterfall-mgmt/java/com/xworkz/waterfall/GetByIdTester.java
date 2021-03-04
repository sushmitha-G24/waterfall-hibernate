package com.xworkz.waterfall;

import com.xworkz.waterfall.dao.WaterFallsDAOImpl;
import com.xworkz.waterfall.dao.waterFallsDAO;
import com.xworkz.waterfall.entity.WaterFallsEntity;

public class GetByIdTester {

	public static void main(String[] args) {
		
		waterFallsDAO dao=new WaterFallsDAOImpl();
		WaterFallsEntity waterFallsEntity=dao.getById(2);
		System.out.println(waterFallsEntity);

	}

}
