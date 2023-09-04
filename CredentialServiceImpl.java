package com.greatLearning.service;

import java.util.Random;

import com.greatLearning.interfaces.ICredentials;
import com.greatLearning.model.Employee;

public class CredentialServiceImpl implements ICredentials{

	@Override
	public String generateEmailAddress(String firstName, String lastName, String department) {
		
		return firstName+lastName+"@"+department+".gl.in";
	}

	
	@Override
	public String generatePassword() {
		
		String capitalLettters ="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters ="abcdefghijklmnopqrstuvwxyz";
		String numbers="0123456789";
		String specialCharacters="!@#$%^&*_=+/.?<>";
		String values = capitalLettters+ smallLetters+ numbers+ specialCharacters;
		System.out.println("values"+ values);
		String password = "";
		Random random = new Random();
		//random.nextInt(80);
		for(int i=0;i<=8; i++) {
			/**
			 *CharAt is used  to get character value
			 *nextInt() is used to get next int value
			 *
			 */
			password+= String.valueOf(values.charAt(random.nextInt(values.length())));
			
		}
		return password;
		
		
	}

	@Override
	public void showCredentials(Employee employee) {
		// TODO Auto-generated method stub
		System.out.println("Dear "+ employee.getFirstName()+ " your generated credentials are as follows ");
		System.out.println("Email\t\t"+ employee.getEmail());
		System.out.println("password\t"+ employee.getPassword());
		
	}

}
