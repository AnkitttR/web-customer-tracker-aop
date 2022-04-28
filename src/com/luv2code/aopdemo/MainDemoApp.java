package com.luv2code.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.luv2code.aopdemo.dao.AccountDAO;
import com.luv2code.aopdemo.dao.MembershipDAO;

public class MainDemoApp {

	public static void main(String[] args) {
		
		//read spring config java class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
		
		//get the bean from spring container
		AccountDAO theAccountDAO = context.getBean("accountDAO", AccountDAO.class);
									//Hey context give me the bean from AccountDAO class
		
		// get membership bean from spring container
		MembershipDAO theMembershipDAO = context.getBean("membershipDAO", MembershipDAO.class);
		
		//call the business method
		theAccountDAO.addAccount(); //AccountDAO class ke under addAccount method hai, lekin usko
		          //access karne ke liye AccountDAO class ke variable theAccountDAO ka use karenge
		
		//call the membership business method
		theMembershipDAO.addAccount();
		
		
		
		//close the context
		context.close();
	}

}
