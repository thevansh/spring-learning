package com.vansh.hibernate.demo;

import com.vansh.hibernate.demo.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class DeleteStudentDemo {
    public static void main(String[] args) {


        SessionFactory factory=new Configuration()
                                .configure("hibernate.cfg.xml")
                                .addAnnotatedClass(Student.class)
                                .buildSessionFactory();

        Session session=factory.getCurrentSession();

        try{
            session.beginTransaction();
            int studentId=6;
            Student student=session.get(Student.class,studentId);
            session.delete(student);
            session.getTransaction().commit();




            session=factory.getCurrentSession();
            session.beginTransaction();

            session.createQuery("delete from Student where id=9").executeUpdate();
            session.getTransaction().commit();

        }
        finally {
            factory.close();
        }

    }
}
