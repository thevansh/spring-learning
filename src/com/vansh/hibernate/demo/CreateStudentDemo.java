package com.vansh.hibernate.demo;

import com.vansh.hibernate.demo.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class CreateStudentDemo {
    public static void main(String[] args) {


        SessionFactory factory=new Configuration()
                                .configure("hibernate.cfg.xml")
                                .addAnnotatedClass(Student.class)
                                .buildSessionFactory();

        Session session=factory.getCurrentSession();

        try{
            Student student = new Student("Vansh","Jain","vansh@g.c");
            session.beginTransaction();
            session.save(student);
            session.getTransaction().commit();
            System.out.println("Done");
        }
        finally {
            factory.close();
        }

    }
}
