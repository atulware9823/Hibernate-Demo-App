package com.brickstone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setSid(1);
        s1.setSname("Atul");
        s1.setTech("Java");

        Configuration config = new Configuration();
        config.addAnnotatedClass(com.brickstone.Student.class);
        config.configure();
        SessionFactory sf = config.buildSessionFactory();
        Session session = sf.openSession();
        Transaction transaction = session.beginTransaction();
        session.persist(s1);
        transaction.commit();
    }
}