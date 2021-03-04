package com.xworkz.waterfall;

import com.xworkz.waterfall.dao.WaterFallsDAOImpl;
import com.xworkz.waterfall.dao.waterFallsDAO;

public class DeleteTester {

	public static void main(String[] args) {
		waterFallsDAO dao=new WaterFallsDAOImpl();
		dao.deleteById(1);

	}

}
