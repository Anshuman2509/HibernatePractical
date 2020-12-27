 package com.bmw.onetoone.unidirectional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		Configuration configuration=new Configuration();
		configuration.configure("hibernate4.cfg.xml")
		.addAnnotatedClass(Employee4.class)
		.addAnnotatedClass(Address4.class);
		
		SessionFactory factory=configuration.buildSessionFactory();
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		
		Employee4 employee4=new Employee4();
		employee4.setEmpName("Jack Ryan");
		employee4.setDepartment("Mechanical");
		Address4 address4=new Address4();
		address4.setCity("Pune");
		address4.setState("Maharastra");
		employee4.setAddress4(address4);
		
		Employee4 employee42=new Employee4();
		employee42.setEmpName("Ethan Hunt");
		employee42.setDepartment("Electrical");
		Address4 address42=new Address4();
		address42.setCity("Bangalore");
		address42.setState("Karnataka");
		employee42.setAddress4(address42);
		
		session.save(address4);
		session.save(employee4);
		session.save(address42);
		session.save(employee42);
		
		transaction.commit();
		session.close();
		factory.close();
		System.out.println("End of Transaction");

	}

}
