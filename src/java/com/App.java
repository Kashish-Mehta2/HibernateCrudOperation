package com.hibernate.HibernateCrudOperations;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

import com.hibernate.entities.User;

public class App {
    public static void main(String[] args) {
//    	User user1 = new User();
//    	user1.setName("Deepak");
//    	user1.setEmail("deepak@gamil.com");
//    	user1.setPassword("Deepak123");
//    	user1.setGender("Male");
//    	user1.setCity("Chandigarh");
 	
    	
    	User user2 = new User();
    	user2.setName("Amit");
    	user2.setEmail("amit@gamil.com");
    	user2.setPassword("amit123");
    	user2.setGender("Male");
    	user2.setCity("Delhi");
    	
    	
    	Configuration cfg = new Configuration();
    	cfg.configure("com/hibernate/config/hibernate.cfg.xml");
    	
    	SessionFactory sf = cfg.buildSessionFactory();
    	Session s = sf.openSession();
    	Transaction t = s.beginTransaction();
    
    	//-----------Insert operation----------
//    	try{
//    	s.save(user2);
//    	t.commit();
//    	
//    	System.out.println("User Details Added Successfully");
//    	}
//    	catch(Exception e) {
//    		t.rollback();
//    		e.printStackTrace();
//    		
//    		System.out.println("User Details not Added due to some error");
//    	}
    	
    	
    	
    	
    	//------------Select operation-------------
//    	try {
//    	User user =	s.get(User.class,5L);
//    	
//    	if(user != null) {
//    	System.out.println(user.getId());
//    	System.out.println(user.getName());
//    	System.out.println(user.getEmail());
//    	System.out.println(user.getPassword());
//    	System.out.println(user.getGender());
//    	System.out.println(user.getCity());
//    	}
//    	else {
//    		System.out.println("User not found.......");
//    	}}
//    	catch(Exception e){
//    		e.printStackTrace();
//    	}
//    	

    	
    	
    	
//    	---------Update Operation--------
    
//    	user2.setCity("Noida");
//    	try {
//    		s.saveOrUpdate(user2);
//    		t.commit();
//        	
//        	System.out.println("User Details Updated Successfully");
//    	}
//    	catch(Exception e) {
//    		t.rollback();
//    		e.printStackTrace();
//    		
//    		System.out.println("User Details not Added due to some error");
//    	
//    	}
//    
    	
    	//-----------Delete operation-----------
    	
    	try {
    		User user = new User();
    		user.setId(2);
    		
    		s.delete(user);
    		t.commit();
        	
        	System.out.println("User Details Deleted Successfully");
    	}
    	catch(Exception e) {
    		t.rollback();
    		e.printStackTrace();
    		
    		System.out.println("User Details not Deleted due to some error");
    	
    	}
}
}