package com.bmw.onetomany.bidirectionaljointable;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		Configuration configuration=new Configuration();
		configuration.configure("hibernate10.cfg.xml")
		.addAnnotatedClass(Employee10.class)
		.addAnnotatedClass(Address10.class);
		SessionFactory factory=configuration.buildSessionFactory();
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		
		Address10 address10=new Address10();
		address10.setCity("Pune");
		address10.setState("Maharastra");
		
		
		Address10 address102=new Address10();
		address102.setCity("Bangalore");
		address102.setState("Karnataka");
		
		List<Address10> addresses=new ArrayList<Address10>();
		addresses.add(address10);
		addresses.add(address102);
		
		Employee10 employee10=new Employee10();
		employee10.setEmpName("Jack Ryan");
		employee10.setAddresses(addresses);
		address10.setEmployee10(employee10);
		address102.setEmployee10(employee10);
		
		session.save(address10);
		session.save(address102);
		session.save(employee10);
		
		transaction.commit();
		session.close();
		factory.close();
		System.out.println("End of Transaction");
		
		

	}

}
