package com.bmw.embeddable2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		Configuration configuration=new Configuration();
		configuration.configure("hibernate2.cfg.xml").addAnnotatedClass(Employee3.class);
		SessionFactory factory=configuration.buildSessionFactory();
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		
		Employee3 employee2=new Employee3();
		employee2.setEmpName("Jack Ryan");
		Address3 address=new Address3();
		address.setCity("Pune");
		address.setState("Maharastra");
		employee2.setAddress(address);
		
		Employee3 employee22=new Employee3();
		employee22.setEmpName("Ethan Hunt");
		Address3 address2=new Address3();
		address2.setCity("Bangalore");
		address2.setState("Karnataka");
		employee22.setAddress(address2);
		
			
		session.save(employee2);
		session.save(employee22);
		transaction.commit();
		
		session.close();
		factory.close();
		System.out.println("End of Transaction");

	}

}
