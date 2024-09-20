package main;


import beans.Employee;
import beans.Person;
import beans.Student;
import hibernateconfig.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {

        SessionFactory sessionFactory=HibernateUtil.getSessionFactory();
        System.out.println(sessionFactory);
        Session session=sessionFactory.openSession();
        Transaction transaction = null;
        try {
           transaction= session.beginTransaction();

           /* Employee employee=new Employee();
            employee.setJob("Teacher");
            employee.setSal(300);
            employee.setName("Saket Kumar Keshri");*/

            Person p=new Person();
            p.setName("saket ");

            Employee emp=new Employee();
            emp.setName("keshri");
            emp.setJob("developer");
            emp.setSal(23.78);

            Student std=new Student();
            std.setCourse("Mca");
            std.setName("kumar");
            std.setFees(34.5f);

            session.persist(p);
            session.persist(emp);
            session.persist(std);
            transaction.commit();
        }catch (HibernateException e){
            transaction.rollback();
            e.printStackTrace();
        }finally {
            session.close();
        }


    }
}
