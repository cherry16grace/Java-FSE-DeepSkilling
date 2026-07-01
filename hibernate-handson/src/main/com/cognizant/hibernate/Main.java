package com.cognizant.hibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.cognizant.hibernate.model.Employee;
import com.cognizant.hibernate.util.HibernateUtil;

public class Main {

    public static void main(String[] args) {

        Session session =
                HibernateUtil.getSessionFactory().openSession();

        Transaction transaction =
                session.beginTransaction();

        Employee employee =
                new Employee(101, "John", 50000);

        session.save(employee);

        transaction.commit();

        session.close();

        System.out.println("Employee Saved Successfully");

    }

}