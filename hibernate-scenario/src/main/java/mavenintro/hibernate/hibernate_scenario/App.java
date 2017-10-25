package mavenintro.hibernate.hibernate_scenario;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
Student std = new Student();
std.setId(12);
std.setName("Raj");
std.setCourse("Java");
std.setMarks("30");
std.setDate(new Date());
  /*
   * std object is in transient state
   * 
   * 
   * 
   * 	  */
		  
    	Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
@SuppressWarnings("deprecation")
SessionFactory sf = cfg.buildSessionFactory();
Session s = sf.openSession();
Transaction tx = s.beginTransaction();

   s.save(std);//save the student object-> Persistent state
  // Student std = (Student) s.get(Student.class, 2);
//two methods to get data from database 1) get and the other is load


tx.commit();//commit the transaction->  the object moves to database
  //  s.evict();//from here std object is eligible for garbage collection
    s.close();
    sf.close();
    
    }
}
