package com.bmw.onetomany.unidirectionaljointable;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
	public static void main(String[] args) {
		Configuration configuration=new Configuration();
		configuration.configure("hibernate7.cfg.xml")
		.addAnnotatedClass(Employee7.class)
		.addAnnotatedClass(Address7.class);
		SessionFactory factory=configuration.buildSessionFactory();
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		
		Address7 address7=new Address7();
		address7.setCity("Pune");
		address7.setState("Maharastra");
		
		Address7 address72=new Address7();
		address72.setCity("Mumbai");
		address72.setState("Maharastra");
		
		Employee7 employee7=new Employee7();
		employee7.setEmpName("Jack Ryan");
		List<Address7> address7s=new ArrayList<Address7>();
		address7s.add(address7);
		address7s.add(address72);
		employee7.setAddresses(address7s);
		
		session.save(address7);
		session.save(address72);
		session.save(employee7);
		
		transaction.commit();
		session.close();
		factory.close();
		System.out.println("End of Transaction");
		
	}

}
