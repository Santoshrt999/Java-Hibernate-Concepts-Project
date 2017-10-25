package hibernate.association;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToMany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration cfx = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory sf = cfx.buildSessionFactory();
		Session s= sf.openSession();
		Transaction tx = s.beginTransaction();
		
		
		Parts p1 = new Parts(1,"Monitor");
		Parts p2 = new Parts(2,"Keyboard");
		Parts p3 = new Parts(3,"Mouse");
		
		Set<Parts> pSet = new HashSet();
		pSet.add(p1);
		pSet.add(p2);
		pSet.add(p3);
		
	product p = new product(1, "desktop", pSet);
	
		
		
		
		
		
		tx.commit();
		s.close();
		sf.close();
		
		
		
	}

}
