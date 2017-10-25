package hibernate.inheritance;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class IntDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Configuration cfx = new Configuration().configure("Employee.hbm.xml");
		SessionFactory sf = cfx.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		
		CreditCard cc = new CreditCard(1, "12345", "22-33-445-67", "555");
		CreditCard cc1 = new CreditCard(1, "12345", "22-33-445-67", "555");
		CreditCard cc2 = new CreditCard(1, "12345", "22-33-445-67", "555");
		CreditCard cc3 = new CreditCard(1, "12345", "22-33-445-67", "555");
		
		
		
		
		
		
		tx.commit();
		s.close();
	}

}
