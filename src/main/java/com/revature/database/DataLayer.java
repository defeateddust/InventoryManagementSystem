package com.revature.database;

import java.io.Serializable;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.revature.beans.Category;

public class DataLayer {
	private static Logger log = Logger.getRootLogger();
	DAO dao;
	private Session session;
	
	
	public DataLayer(){
		session=SessionFactoryManager.getInstance().openSession();
		dao = new DAO(session);
	}
	
	public void close(){
		if(session!=null)session.close();
	}
	
	public void createRow(Object obj){
		Transaction trans = session.beginTransaction();
		try{
			dao.insert(obj);
			trans.commit();
		} catch(RuntimeException c){
			log.error("RuntimeException in DataLayer");
			c.printStackTrace();
			trans.rollback();
		}
	}
	
	public void updateRow(Object obj) {
		Transaction trans = session.beginTransaction();
		try{
			dao.update(obj);
			trans.commit();
		} catch(RuntimeException c){
			log.error("RuntimeException in DataLayer");
			c.printStackTrace();
			trans.rollback();
		}
	}
	public Category getCategory(Serializable id){

		Transaction trans = session.beginTransaction();
		return  dao.getCategoryById(id);
		
	}
	
	public void delete(Object obj, Serializable id) {
		Transaction trans = session.beginTransaction();
		try {
			dao.deleteById(obj.getClass(), id);
			trans.commit();
		} catch(RuntimeException c){
			log.error("RuntimeException in DataLayer");
			c.printStackTrace();
			trans.rollback();
		}
	}
	
	public List<Object> selectRestricted(Object obj, String property, Object limiter) {
		return dao.getBy(obj, property, limiter);
	}

	public List<Object> selectAllRows(Object obj, String order) {
		return dao.selectAll(obj, order);
	}
}
