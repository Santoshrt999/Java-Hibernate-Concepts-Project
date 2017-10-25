package mavenintro.hibernate.Employee;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.CreateKeySecondPass;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class EmployeeCriteria {
	public static void main(String[] args) {
	
	Configuration cfx = new Configuration().configure("Employee.hbm.xml");
	SessionFactory sf = cfx.buildSessionFactory();
	Session s = sf.openSession();
	Transaction tx = s.beginTransaction();
	
	//to retrieve all employees from Employee    criteria is HQL 
	Criteria c = s.createCriteria(Employee.class);
	List<Employee> elist = c.list();
	for(Employee E: elist) {
		
		System.out.println(elist);
	}
	
	
	Criteria c1 = s.createCriteria(Employee.class);
	Criterion cr = Restrictions.ge("Salary", 150); //ge implies greater than equal
    c1.add(cr);
    
    List<Employee> elsit1 = c1.list();
   // System.out.println("salary more than " + elist1);
    
    for(Employee e: elsit1) {
    	
    	System.out.println(e);
    	
    	
    }
    //select name,salary from emplyee where dept is course, Python
    Criteria c2 = s.createCriteria(Employee.class);
    Criterion cr1 = Restrictions.eq("empDept","Python");//Restrictions are conditions
    Projection p1 =Projections.property("empNmae");//column name
    Projection p2 =Projections.property("Salary");//column name projections are always column-name
   ProjectionList pl = Projections.projectionList();
   pl.add(p1);
   pl.add(p2);
   c2.add(cr1);
   c2.setProjection(pl);
   
   
  // c2.setProjection("pList");
   
   //projections in p1
   
    
    
    
    
}
}
