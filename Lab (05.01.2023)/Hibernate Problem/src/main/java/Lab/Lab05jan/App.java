package Lab.Lab05jan;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App { // mail app class
	public static void main(String[] args) { // main method
		// build SeassionFactory -from cfg object it takes jdbc info.and jdbc connection
		SessionFactory s = new Configuration().configure().buildSessionFactory();
		// opens an connection with db and session object perform CRUD
		Session ses = s.openSession();
		// operation performed in db,save permanent
		Transaction t = ses.beginTransaction();

		// create object of persistance class Employee
		Employee e = new Employee();
		// use object to enter data in table setter method
		e.setEmp_id(111);
		e.setEmp_FirstName("Niladri");
		e.setEmp_LastName("Chowdhury");
		e.setEmp_Email("nil@hotmail.com");
		e.setEmp_Add("Chinsurah");
		e.setEmp_salary(10000.50);
		// session object is used to save the persistance onject
		ses.save(e);

		// create object of persistance class Employee
		Employee e1 = new Employee();
		// use object to enter data in table setter method
		e1.setEmp_id(112);
		e1.setEmp_FirstName("Nisha");
		e1.setEmp_LastName("Sutradhar");
		e1.setEmp_Email("nisha@hotmail.com");
		e1.setEmp_Add("Asansol");
		e1.setEmp_salary(15000.50);
		// session object is used to save the persistance onject
		ses.save(e1);

		// create object of persistance class Employee
		Employee e2 = new Employee();
		// use object to enter data in table setter method
		e2.setEmp_id(113);
		e2.setEmp_FirstName("Abhishek");
		e2.setEmp_LastName("Maity");
		e2.setEmp_Email("avi@hotmail.com");
		e2.setEmp_Add("Midnapur");
		e2.setEmp_salary(20000.50);
		// session object is used to save the persistance onject
		ses.save(e2);

		// create object of persistance class Employee
		Employee e3 = new Employee();
		// use object to enter data in table setter method
		e3.setEmp_id(114);
		e3.setEmp_FirstName("Misbha");
		e3.setEmp_LastName("Chowdhury");
		e3.setEmp_Email("misbha@hotmail.com");
		e3.setEmp_Add("Durgapur");
		e3.setEmp_salary(13000.60);
		// session object is used to save the persistance onject
		ses.save(e3);

		// create object of persistance class Employee
		Employee e4 = new Employee();
		// use object to enter data in table setter method
		e4.setEmp_id(115);
		e4.setEmp_FirstName("Atif");
		e4.setEmp_LastName("Ansary");
		e4.setEmp_Email("atif@hotmail.com");
		e4.setEmp_Add("Shelong");
		e4.setEmp_salary(25000.50);
		// session object is used to save the persistance onject
		ses.save(e4);

		// transaction object to commit changes
		t.commit();
		// close the session
		ses.close();
	}
}
