package com.spring.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.entity.Customer;


@Repository
public class CustomerDaoImpl implements CustomerDao {
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	@Transactional
	public List<Customer> getmyCustomers() {
		 
		Session mysSession  = sessionFactory.getCurrentSession();
		
		Query<Customer> theQuery = mysSession.createQuery("from Customer order by FirstName");
		
		
		List<Customer> myCustomers = theQuery.getResultList();
		
	
		return myCustomers;
	}

}
