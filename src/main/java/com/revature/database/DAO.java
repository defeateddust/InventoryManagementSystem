package com.revature.database;


import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;


public class DAO {
	private Session session;
	public DAO(Session session){
		this.session=session;
	}
	
	public void insert(Object obj) {
		session.saveOrUpdate(obj);
	}
	
	public void delete(Object obj) {
		Query delete = session.createQuery("delete from :tableName where id = :objId");
	}
	
	@SuppressWarnings("unchecked")
	public List<Object> getBy(Object obj, String property, Object limiter) {
		Criteria cri = session.createCriteria(obj.getClass())
				.add(Restrictions.eq(property, limiter));
		return cri.list();
	}
	
	@SuppressWarnings("unchecked")
	public List<Object> selectAll(Object obj) {
		return session.createCriteria(obj.getClass()).list();
	}
}
