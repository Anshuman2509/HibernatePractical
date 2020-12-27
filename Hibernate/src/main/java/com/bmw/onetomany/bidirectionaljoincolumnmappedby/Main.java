package com.bmw.onetomany.bidirectionaljoincolumnmappedby;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		Configuration configuration=new Configuration();
		configuration.configure("hibernate9.cfg.xml")
		.addAnnotatedClass(Employee9.class)
		.addAnnotatedClass(Address9.class);
		SessionFactory factory=configuration.buildSessionFactory();
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		
		Address9 address9=new Address9();
		address9.setCity("Bangalore");
		address9.setState("Karnataka");

		Address9 address92=new Address9();
		address92.setCity("Pune");
		address92.setState("Maharastra");
		
		Employee9 employee9=new Employee9();
		employee9.setEmpName("Jack Ryan");
		List<Address9> addresses=new ArrayList<Address9>();
		addresses.add(address9);
		addresses.add(address92);
		
		employee9.setAddress(addresses);
		address9.setEmployee9(employee9);
		address92.setEmployee9(employee9);
		
		session.save(address9);
		session.save(address92);
		session.save(employee9);
		
		transaction.commit();
		session.close();
		factory.close();
		System.out.println("End of Transaction");

	}

}
