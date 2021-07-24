package com.vansh.hibernate.demo;

import com.vansh.hibernate.demo.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class ReadStudentDemo {
    public static void main(String[] args) {


        SessionFactory factory=new Configuration()
                                .configure("hibernate.cfg.xml")
                                .addAnnotatedClass(Student.class)
                                .buildSessionFactory();

        Session session=factory.getCurrentSession();

        try{
            Student student = new Student("Ram","Pal","ram@g.c");
            session.beginTransaction();
            session.save(student);
            session.getTransaction().commit();
            System.out.println("Creation Done");

            System.out.println(student.getId());

            session=factory.getCurrentSession();
            session.beginTransaction();
            Student myStudent=session.get(Student.class,student.getId());
            System.out.println("Read data "+myStudent);

            session.getTransaction().commit();

        }
        finally {
            factory.close();
        }

    }
}
