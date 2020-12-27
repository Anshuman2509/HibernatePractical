package com.bmw.onetoone.bidirectional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		Configuration configuration=new Configuration();
		configuration.configure("hibernate5.cfg.xml")
		.addAnnotatedClass(Employee5.class)
		.addAnnotatedClass(Address5.class);
		
		SessionFactory factory=configuration.buildSessionFactory();
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		
		Employee5 employee5=new Employee5();
		employee5.setEmpName("Jack Ryan");
		employee5.setDepartment("Mechanical");
		Address5 address5=new Address5();
		address5.setCity("Pune");
		address5.setState("Maharastra");
		
		address5.setEmployee5(employee5);
		employee5.setAddress5(address5);
		
		
		Employee5 employee52=new Employee5();
		employee52.setEmpName("Ethan Hunt");
		employee52.setDepartment("Electrical");
		Address5 address52=new Address5();
		address52.setCity("Bangalore");
		address52.setState("Karnataka");
		
		address52.setEmployee5(employee52);
		employee52.setAddress5(address52);
		
		session.save(address5);
		session.save(employee5);
		session.save(address52);
		session.save(employee52);
		
		transaction.commit();
		session.close();
		factory.close();
		System.out.println("End of Transaction");

	}

}
