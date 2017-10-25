package mavenintro.hibernate.Employee;

import org.dom4j.dom.DOMNodeHelper.EmptyNodeList;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;
import java.util.Map;

public class EmployeeSave {
	
	
	Configuration cfx = new Configuration().configure("Employee.hbm.xml");
	SessionFactory sf = cfx.buildSessionFactory();
	Session s = sf.openSession();
	Transaction tx = s.beginTransaction();
	
	
	//Update HQL Statement
//	String UpdEmpName = "update Employee set EmpNmae='Raskesh' where empNmae=prasad";
//	Query query = s.createQuery(UpdEmpName);
//               int result = query.executeUpdate();
               
	//select qw
               
//               String selectEmpname = "From Employee where empid='3";
//               Query query1 = s.createQuery(selectEmpname);
//               Employee e1 = (Employee) query1.uniqueResult();
	
	//all records\
	
	String Allemp = "From Employee";
	Query q2 = s.createQuery(Allemp);
	List<Employee> a = q2.list();
	
	String empNamesal = "select empNmae, Salary from Employee";
	Query q3 = s.createQuery(empNamesal);
	List<Object> objlist = q3.list();
for(Object obj:objlist) {
	
	Object[] objarray = (Object[]) obj;
	
	System.out.println(objarray[1]);
	
	
	String ename = "select max(Salary) from Employee ";
	Query q4 = s.createQuery(ename);
	double d = (Double) q4.uniqueResult();
	
	

}

