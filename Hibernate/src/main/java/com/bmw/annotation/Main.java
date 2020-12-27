package com.bmw.annotation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) throws ParseException {
		Configuration configuration=new Configuration();
		configuration.configure().addAnnotatedClass(Employee1.class);
		
		SessionFactory factory=configuration.buildSessionFactory();
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		Employee1 employee=new Employee1();
		employee.setFirstName("James");
		employee.setLastName("Wales");
		employee.setAge(39);
		employee.setIsPostGraduate(false);
		SimpleDateFormat dateFormat=new SimpleDateFormat("YYYY-MM-DD");
		Date dateOfJoining=dateFormat.parse("2020-09-27");
		employee.setDateOfJoining(dateOfJoining);
		employee.setSalary(1450000);
		
		Employee1 employee1=new Employee1();
		employee1.setFirstName("Jimmy");
		employee1.setLastName("Jackson");
		employee1.setAge(23);
		employee1.setIsPostGraduate(false);
		SimpleDateFormat dateFormat1=new SimpleDateFormat("YYYY-MM-DD");
		Date dateOfJoining1=dateFormat1.parse("2020-11-18");
		employee1.setDateOfJoining(dateOfJoining1);
		employee1.setSalary(1650000);
		
		session.save(employee);
		session.save(employee1);
		transaction.commit();
		session.close();
		factory.close();
		System.out.println("End of Transaction");

	}

}
