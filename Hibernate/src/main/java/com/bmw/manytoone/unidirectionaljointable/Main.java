package com.bmw.manytoone.unidirectionaljointable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		Configuration configuration=new Configuration();
		configuration.configure("hibernate12.cfg.xml")
		.addAnnotatedClass(Employee12.class)
		.addAnnotatedClass(Address12.class);
		SessionFactory factory=configuration.buildSessionFactory();
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		
		Address12 address12=new Address12();
		address12.setCity("Pune");
		address12.setState("Maharastra");
		
		Address12  address122=new Address12();
		address122.setCity("Bangalore");
		address122.setState("Karantaka");
		
		Employee12 employee12=new Employee12();
		employee12.setEmpName("Ethan Hunt");
		address12.setEmployee12(employee12);
		address122.setEmployee12(employee12);
		
		session.save(address12);
		session.save(address122);
		session.save(employee12);
		transaction.commit();
		session.close();
		factory.close();
		System.out.println("End Of Transaction");

	}

}
