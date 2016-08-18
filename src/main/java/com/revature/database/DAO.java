package com.revature.database;


import java.util.List;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

@Repository("dao")
public class DAO {
	private Session session;
	public DAO(){
		super();
	}
	public DAO(Session session){
		this.session=session;
	}
	public void insert(Object obj){
		
		session.save(obj);
	}
	public List<Object> selectAll(Object obj) {
		return session.createCriteria(obj.getClass()).list();
	}
}
