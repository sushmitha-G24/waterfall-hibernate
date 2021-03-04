package com.xworkz.waterfall.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.xworkz.waterfall.entity.StateEntity;
import com.xworkz.waterfall.util.SFUtil;

public class StateDAOImpl implements StateDAO {
	private SessionFactory factory = SFUtil.getFactory();

	public StateDAOImpl() {

	}

	@Override
	public void create(StateEntity entity) {
		System.out.println("invoked create");
		System.out.println("entity" + entity);
		try (Session session = factory.openSession()) {
			Transaction transaction = session.beginTransaction();
			session.save(entity);
			// transaction.commit();

		}

	}

	@Override
	public void create(List<StateEntity> stateEntity) {
		System.out.println("craeted list of satate entities");
		Transaction trasaction = null;
		try {
			Session session = factory.openSession();
			trasaction = session.beginTransaction();
			for (StateEntity stateEntity2 : stateEntity) {
				// session.flush();
				session.save(stateEntity2);
			}

			trasaction.commit();

		} catch (HibernateException e) {
			e.printStackTrace();
			trasaction.rollback();

		}

	}

}