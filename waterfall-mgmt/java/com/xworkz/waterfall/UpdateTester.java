package com.xworkz.waterfall;

import com.xworkz.waterfall.dao.WaterFallsDAOImpl;
import com.xworkz.waterfall.dao.waterFallsDAO;
import com.xworkz.waterfall.entity.WaterFallsEntity;

public abstract class UpdateTester {

	public static void main(String[] args) {
		waterFallsDAO dao = new WaterFallsDAOImpl();
		dao.updateHeightAndDepthById(1, 455, 5662);

	}

}
