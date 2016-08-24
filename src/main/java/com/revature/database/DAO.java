package com.revature.database;


import java.io.Serializable;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import com.revature.beans.Category;
import com.revature.beans.Client;


public class DAO {
	private static Logger log = Logger.getRootLogger();
	private Session session;
	public DAO(Session session){
		this.session=session;
	}
	

	public void insert(Object obj) {
		session.saveOrUpdate(obj);
	}
	
	public void update(Object obj) {
		session.merge(obj);
	}
	
	public void deleteById(Class<?> type, Serializable id) {
		Object instance = session.load(type, id);
		if (instance != null)
			session.delete(instance);
	}
	
	@SuppressWarnings("unchecked")
	public List<Object> getBy(Object obj, String property, Object limiter) {
		Criteria cri = session.createCriteria(obj.getClass())
				.add(Restrictions.eq(property, limiter));
		return cri.list();
	}
	public Category getCategoryById( Serializable id){
		
		Category instance = (Category) session.load(Category.class, id);
		
		if (instance != null){	
			System.out.println("log.info('sssssssssssssssssssssssssss')");
			//log.info(session.get(Category.class, id));
			return (Category) session.get(Category.class, id);
		
		}
		else
			return null;
	}
	@SuppressWarnings("unchecked")
	public List<Object> selectAll(Object obj, String order) {
		return session.createCriteria(obj.getClass())
				.addOrder(Order.asc(order)).list();
	}
}
