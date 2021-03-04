package com.xworkz.waterfall.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.xworkz.waterfall.sfexception.SFCreationException;

public class SFUtil {

	private static SessionFactory factory;

	public static SessionFactory getFactory() {
		return factory;

	}

	static {
		try {
			Configuration cfg = new Configuration();
			cfg.configure();
			// cfg.addAnnotatedClass(annotatedClass)
			factory = cfg.buildSessionFactory();
			if (factory != null) {
				System.out.println("SFUtil is created sucessfully");

			} else {
				throw new SFCreationException("failed to create SFUtil");

			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}