package com.bmw.onetomany.unidirectionaljoincolumn;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		Configuration configuration=new Configuration();
		configuration.configure("hibernate8.cfg.xml")
		.addAnnotatedClass(Employee8.class)
		.addAnnotatedClass(Address8.class);
		
		SessionFactory factory=configuration.buildSessionFactory();
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		
		Address8 address8=new Address8();
		address8.setCity("Pune");
		address8.setState("Maharastra");
		
		Address8 address82=new Address8();
		address82.setCity("Bangalore");
		address82.setState("Karnataka");
		List<Address8> addresses=new ArrayList<Address8>();
		addresses.add(address8);
		addresses.add(address82);
		
		Employee8 employee8=new Employee8();
		employee8.setEmpName("Jack Ryan");
		employee8.setAddresses(addresses);
		
		session.save(address8);
		session.save(address82);
		session.save(employee8);
		
		transaction.commit();
		session.close();
		factory.close();
		System.out.println("End of Transaction");

	}

}
