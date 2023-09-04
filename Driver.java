package com.greatLearning.main;

import java.util.Scanner;

import com.greatLearning.interfaces.ICredentials;
import com.greatLearning.model.Employee;
import com.greatLearning.service.CredentialServiceImpl;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee = new Employee("Namita", "Gupta");
		ICredentials cs = new CredentialServiceImpl();
		System.out.println("Please Enter the department from the following");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		Scanner sc = new Scanner(System.in);
		int option = sc.nextInt();
		
		String generateEmail = null;
		String generatedPassword = null;
		
				
		switch(option) {
		case 1: {
			generateEmail = cs.generateEmailAddress(employee.getFirstName().toLowerCase(),employee.getLastName(),"tech");
			generatedPassword = cs.generatePassword();
			break;
		}
		case 2:{
			generateEmail = cs.generateEmailAddress(employee.getFirstName().toLowerCase(),employee.getLastName(),"adm");
			generatedPassword = cs.generatePassword();
			break;
		}
		case 3:{
			generateEmail = cs.generateEmailAddress(employee.getFirstName().toLowerCase(),employee.getLastName(),"hr");
			generatedPassword = cs.generatePassword();
			break;
		}
		case 4:{
			generateEmail = cs.generateEmailAddress(employee.getFirstName().toLowerCase(),employee.getLastName(),"lg");
			generatedPassword = cs.generatePassword();
			break;
		}
		default:{
			System.out.println("Please enter valid option");
			
		}
			
		}
		employee.setEmail(generateEmail);
		employee.setPassword(generatedPassword);
		cs.showCredentials(employee);
		sc.close();
		
			
	}

}
