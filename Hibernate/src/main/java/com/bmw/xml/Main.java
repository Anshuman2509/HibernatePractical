package com.bmw.xml;

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
		configuration.configure("hibernate.cfg.xml");
		
		SessionFactory factory=configuration.buildSessionFactory();
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		Employee employee=new Employee();
		employee.setFirstName("Jack");
		employee.setLastName("Ryan");
		employee.setAge(23);
		employee.setIsPostGraduate(false);
		SimpleDateFormat dateFormat=new SimpleDateFormat("YYYY-MM-DD");
		Date dateOfJoining=dateFormat.parse("2020-09-27");
		employee.setDateOfJoining(dateOfJoining);
		employee.setSalary(1450000);
		
		session.save(employee);
		transaction.commit();
		session.close();
		factory.close();
		System.out.println("End of Transaction");

	}

}
