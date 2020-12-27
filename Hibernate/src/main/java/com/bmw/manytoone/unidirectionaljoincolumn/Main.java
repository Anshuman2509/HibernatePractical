package com.bmw.manytoone.unidirectionaljoincolumn;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		Configuration configuration=new Configuration();
		configuration.configure("hibernate11.cfg.xml")
		.addAnnotatedClass(Employee11.class)
		.addAnnotatedClass(Address11.class);
		SessionFactory factory=configuration.buildSessionFactory();
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		
		Address11 address11=new Address11();
		address11.setCity("Pune");
		address11.setState("Maharastra");
		
		Address11 address112=new Address11();
		address112.setCity("Bangalore");
		address112.setState("Karnataka");
		
		Employee11 employee11=new Employee11();
		employee11.setEmpName("Jack Ryan");
		address11.setEmployee11(employee11);
		address112.setEmployee11(employee11);
		
		session.save(employee11);
		session.save(address11);
		session.save(address112);
		
		
		
		transaction.commit();
		session.close();
		factory.close();
		System.out.println("End Of Transaction");

	}

}
