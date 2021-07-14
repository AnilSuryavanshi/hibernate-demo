package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.test.bean.LaptopDemo;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        LaptopDemo obj1 = new LaptopDemo(40550.10, "Lenovo", "Ideapad");
        LaptopDemo obj2 = new LaptopDemo(60125.70, "Dell", "Devil");
        LaptopDemo obj3 = new LaptopDemo(55600.90, "Sony", "VPECH-123");
        
        SessionFactory sessionfactory = new Configuration().configure("/hibernate.cfg.xml").buildSessionFactory();
        
        Session session = sessionfactory.openSession();
        
        Transaction tn = session.beginTransaction();
        
        session.save(obj1);
        session.save(obj2);
        session.save(obj3);
        session.flush();
        tn.commit();
        session.close();
    }
}
