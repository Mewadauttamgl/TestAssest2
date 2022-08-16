package com.java.jpa.find;
import javax.persistence.*;

import com.java.jpa.employee.Employee;
import java.util.List;
public class Assest2 {

	public static void main(String[] args) {
		
		 EntityManagerFactory emf=Persistence.createEntityManagerFactory("Employee_details");

		    EntityManager em=emf.createEntityManager();
		    em.getTransaction().begin();

		    Employee e1=new Employee();

		   e1.setEmpno(101);
		   e1.setName("Uttam");
		   e1.setDesignation("SDE");
		   e1.setSalary(100000);
		   Employee e2=new Employee();
		   

		   e2.setEmpno(102);
		   e2.setName("Shiavm");
		   e2.setDesignation("SDE");
		   e2.setSalary(100000);
 		Employee e3=new Employee();
        	  e3.setEmpno(103);
       	  	  e3.setName("Binod");
        	 e3.setDesignation("SDE");
         	e3.setSalary(10001);

		    em.persist(e1);

		    em.persist(e2);

		    em.persist(e3);

		    em.getTransaction().commit();
		    
		   
		    Query q= em.createQuery("from Employee");

		    List <Employee> list= q.getResultList();

		    for(Employee se:list)

		    {

		     System.out.println(se.getName()+" "+se.getEmpno()+" "+" "+se.getDesignation()+" " +se.getSalary());

		    }

	}

}