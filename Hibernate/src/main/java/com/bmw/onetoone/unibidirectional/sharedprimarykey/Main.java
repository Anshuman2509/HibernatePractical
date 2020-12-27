package com.bmw.onetoone.unibidirectional.sharedprimarykey;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		Configuration configuration=new Configuration();
		configuration.configure("hibernate6.cfg.xml")
		.addAnnotatedClass(Employee6.class)
		.addAnnotatedClass(Address6.class);
		
		SessionFactory factory=configuration.buildSessionFactory();
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		
		Employee6 employee6=new Employee6();
		employee6.setEmpName("Jack Ryan");
		employee6.setDepartment("Mechanical");
		
		Address6 address6=new Address6();
		address6.setCity("Pune");
		address6.setState("Maharastra");
		
		Employee6 employee62=new Employee6();
		employee62.setEmpName("Ethan Hunt");
		employee62.setDepartment("Finance");
		
		Address6 address62=new Address6();
		address62.setCity("Bangalore");
		address62.setState("Bangalore");
		
		session.save(employee6);
		session.save(employee62);
		transaction.commit();
		
		//Again set the address primary key after persisting the employee
		address6.setAddId(employee6.getEmpId());
		employee6.setAddress6(address6);
		
		address62.setAddId(employee62.getEmpId());
		employee62.setAddress6(address62);
		
		session.beginTransaction();
		session.save(address6);
		session.save(employee6);
		session.save(address62);
		session.save(employee62);
		transaction.commit();
		
		session.close();
		factory.close();
		System.out.println("End of Transaction");

	}

}
