package com.revature.database;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Component;

@Component("sfm")
public class SessionFactoryManager {
		private static SessionFactory sf;
		
		private SessionFactoryManager(){}
		
		public static synchronized SessionFactory getInstance(){
		if(sf==null){
			sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		}
		return sf;	
		}
	}

