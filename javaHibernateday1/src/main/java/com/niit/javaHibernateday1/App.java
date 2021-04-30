package com.niit.javaHibernateday1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
	 public static void main( String[] args )
	    {
	        System.out.println( "Hello World!" );
	        Student student = new Student(13, "bindu", 3,33);
	        
	        Configuration configuration = new Configuration().configure().addAnnotatedClass(Student.class);
	        
	        SessionFactory sessionFactory = configuration.buildSessionFactory();
	        Session session = sessionFactory.openSession();
	        Transaction transaction = session.beginTransaction();
	        
	       session.save(student);
	       transaction.commit();
	    }
    
}