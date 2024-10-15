package com.hibernate;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App 
{
  

	public static void main( String[] args )
    {
		em emm1 = new em();
		emm1.setName("rahul");
		em emm2 = new em();
		emm2.setName("dinesh");
		
		Task t1 =new Task();
		t1.setTask("bidding");
		
		Task t2 =new Task();
		t2.setTask("dev");
		
	
		List<Task> tasklist = new ArrayList<>();
		
		tasklist.add(t1);
		tasklist.add(t2);
	
		List<em> emlist = new ArrayList<em>();
		emlist.add(emm1);
		emlist.add(emm2);
		
		
		
		emm1.setTasks(tasklist);
	    t1.setEmp(emlist);
		
          SessionFactory ses = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
    Session s = ses.openSession();
    Transaction tx = s.beginTransaction();
    s.persist(emm1);
    s.persist(emm2);
    s.persist(t1);
    s.persist(t2);

    tx.commit();
    s.close();
    ses.close();
    	
    }
}
