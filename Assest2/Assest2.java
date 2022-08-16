package com.java.jpa.find;
import javax.persistence.*;
import com.java.jpa.employeee.*;
import java.util.List;
public class Assest2 {

	public static void main(String[] args) {
		
		 EntityManagerFactory emf=Persistence.createEntityManagerFactory("Employee_details");

		    EntityManager em=emf.createEntityManager();
		    em.getTransaction().begin();

		    Employee e1=new Employee();

		   e1.setE_id(101);
		   e1.setE_name("Gaurav");
		   e1.setE_desig("Developer");
		   e1.setE_sal(100000);
		   Employee e2=new Employee();
		   e2.setE_id(102);
		   e2.setE_name("vaibhav");
		   e2.setE_desig("Desiner");
		   e2.setE_sal(90000);
		   Employee e3=new Employee();
		   e3.setE_id(103);
		   e3.setE_name("Kumar");
		   e3.setE_desig("Developer");
		   e3.setE_sal(900000);
		   em.persist(e1);

		    em.persist(e2);

		    em.persist(e3);

		    em.getTransaction().commit();
		    
		   
		    Query q= em.createQuery("from Employee");

		    List <Employee> list= q.getResultList();

		    for(Employee se:list)

		    {

		     System.out.println(se.getE_id()+" "+se.getE_name()+" "+" "+se.getE_desig()+" " +se.getE_sal());

		    }

	}

}