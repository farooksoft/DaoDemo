package com.stackroute.daodemo.daoimpl;

import java.util.List;

import javax.transaction.Transactional;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.stackroute.daodemo.dao.EmployeeDao;
import com.stackroute.daodemo.model.Employee;

@Repository("employeeDao")
@Transactional
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	public EmployeeDaoImpl(SessionFactory sessionFactory) {
		// TODO Auto-generated constructor stub
		this.sessionFactory = sessionFactory;
	}
	
	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}
	
	@Override
	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		Query query = getCurrentSession().createQuery("from Employee order by postedDate");
		return query.list();
	}

	@Override
	public boolean sendData(Employee employee) {
		// TODO Auto-generated method stub
		employee.setPostedDate();
		getCurrentSession().save(employee);
		return true;
	}


	

}
