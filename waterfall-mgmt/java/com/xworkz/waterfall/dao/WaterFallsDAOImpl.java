package com.xworkz.waterfall.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.xworkz.waterfall.entity.WaterFallsEntity;
import com.xworkz.waterfall.util.SFUtil;

public class WaterFallsDAOImpl implements waterFallsDAO {
	private SessionFactory factory = SFUtil.getFactory();

	@Override
	public void create(WaterFallsEntity entity) {
		System.out.println("invoked create");
		System.out.println("entity" + entity);
		try (Session session = factory.openSession()) {
			Transaction transaction = session.beginTransaction();
			session.save(entity);
			transaction.commit();

		}

	}

	@Override
	public WaterFallsEntity getById(int id) {
		WaterFallsEntity waterFallsEntity;

		try (Session session = factory.openSession()) {
			Transaction transaction = session.beginTransaction();
			waterFallsEntity = session.get(WaterFallsEntity.class, 1);
			transaction.commit();

			return waterFallsEntity;
		}
	}

	@Override
	public void updateHeightAndDepthById(int id, double height, double depth) {
		try (Session session = factory.openSession()) {
			Transaction transaction = session.beginTransaction();
			WaterFallsEntity entity = session.get(WaterFallsEntity.class, 1);
			if (entity != null) {
				entity.setHeight(height);
				entity.setDepth(depth);
				session.update(entity);
				transaction.commit();
			} else {
				System.out.println("can't update");
			}
		}

	}

	@Override
	public void deleteById(int id) {
		try (Session session = factory.openSession()) {
			Transaction transaction = session.beginTransaction();
			WaterFallsEntity entity = session.get(WaterFallsEntity.class, 1);
			if (entity != null) {
				System.out.println("can delete");
				entity.setWid(id);
				session.update(entity);
				transaction.commit();
			} else {
				System.out.println("can't update");

			}
		}
	}
}