package com.xworkz.waterfall;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.waterfall.dao.StateDAO;
import com.xworkz.waterfall.dao.StateDAOImpl;
import com.xworkz.waterfall.dao.StateDAOImpl;
import com.xworkz.waterfall.entity.StateEntity;

public class StateTester {

	public static void main(String[] args) {
		StateEntity entity = new StateEntity();
		entity.setId(5);
		entity.setName("karnataka");
		entity.setLanguage("kannada");
		entity.setNoOfDistricts(24);
		entity.setPopulation(40000000.00);

		StateEntity entity2 = new StateEntity();
		entity2.setId(6);
		entity2.setName("andhra");
		entity2.setLanguage("hyderbad");
		entity2.setNoOfDistricts(24);
		entity2.setPopulation(40000000.00);

		List<StateEntity> ent = new ArrayList<StateEntity>();
		ent.add(entity);
		ent.add(entity2);

		StateDAO dao = new StateDAOImpl();
		dao.create(ent);

	}

}
