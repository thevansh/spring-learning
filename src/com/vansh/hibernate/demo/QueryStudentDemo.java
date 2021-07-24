package com.vansh.hibernate.demo;

import com.vansh.hibernate.demo.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;


public class QueryStudentDemo {
    public static void main(String[] args) {


        SessionFactory factory=new Configuration()
                                .configure("hibernate.cfg.xml")
                                .addAnnotatedClass(Student.class)
                                .buildSessionFactory();

        Session session=factory.getCurrentSession();

        try{
            session.beginTransaction();

            List<Student> theStudents=session.createQuery("from Student").list();
            getStudents(theStudents);

            theStudents=session.createQuery("from Student where lastName='Jain'").list();
            getStudents(theStudents);
            
            session.getTransaction().commit();
            System.out.println("Done");
        }
        finally {
            factory.close();
        }

    }

    private static void getStudents(List<Student> theStudents) {
        for(Student student: theStudents)
        System.out.println(student);
    }
}
