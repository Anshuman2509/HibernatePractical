package com.bmw.manytomany.unidirectional;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		Configuration configuration=new Configuration();
		configuration.configure("hibernate13.cfg.xml")
		.addAnnotatedClass(Person.class)
		.addAnnotatedClass(Mobile.class);
		SessionFactory factory=configuration.buildSessionFactory();
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		
		Person person=new Person();
		person.setName("Jack Ryan");
		
		Person person2=new Person();
		person2.setName("Ethan Hunt");
		
		Mobile mobile=new Mobile();
		mobile.setName("Samsung Galaxy S7");
		Mobile mobile2=new Mobile();
		mobile2.setName("Apple S16");
		
		List<Mobile> mobiles=new ArrayList<Mobile>();
		mobiles.add(mobile);
		mobiles.add(mobile2);
		person.setMobiles(mobiles);
		person2.setMobiles(mobiles);
		
		session.save(mobile);
		session.save(mobile2);
		session.save(person);
		session.save(person2);
		
		
		transaction.commit();
		session.close();
		factory.close();
		System.out.println("End Of Transaction");

	}

}
