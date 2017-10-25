package mavenintro.hibernate.Employee;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmployeeHQL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp = new Employee(1, "Siva", "Java", 1500);

		Employee emp1 = new Employee(1, "Sivan", "Javaxxc", 5500);

		Employee emp2 = new Employee(1, "Sivaraj", "Javaee", 1560);

		
		
		
		
		Configuration cfx = new Configuration().configure("Employee.hbm.xml");
		SessionFactory sf = cfx.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		
		//s.save(object)
		
		s.save(emp);
		s.save(emp1);
		s.save(emp2);
		
		tx.commit();
		

	}

}
