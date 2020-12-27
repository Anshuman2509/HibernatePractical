package com.bmw.annotation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class RecordFetchingMain {

	public static void main(String[] args) {
		Configuration configuration=new Configuration();
		configuration.configure().addAnnotatedClass(Employee1.class);
		
		SessionFactory factory=configuration.buildSessionFactory();
		Session session=factory.openSession();
		Employee1 employee1=session.get(Employee1.class, 2);
		System.out.println(employee1);
		
		session.close();
		System.out.println("End of Transaction");

	}

}
