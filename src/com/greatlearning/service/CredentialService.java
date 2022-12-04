package com.greatlearning.service;

import java.util.Random;

import com.greatlearning.interfaces.CredentialsInterface;
import com.greatlearning.model.Employee;

public class CredentialService implements CredentialsInterface {
	private String userEmail;
	private String userPassword;
	Employee emp=new Employee();
	
	public void generatePassword()
    {
        
        String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String smallLetters = "abcdefghijklmnopqrstuvwxyz";
        String numericals = "0123456789";
        String specialChar = "!@#$%^&*_=+-/.?<>)";
        String values = capitalLetters + smallLetters + numericals + specialChar;
  
        // Using random method
        Random ramdomObj = new Random();
        int len=8;
        String password="";
        char[] passChar = new char[len];
        passChar[0]=smallLetters.charAt(ramdomObj.nextInt(smallLetters.length()));
        passChar[1]=capitalLetters.charAt(ramdomObj.nextInt(capitalLetters.length()));
        passChar[2]=numericals.charAt(ramdomObj.nextInt(numericals.length()));
        passChar[3]=specialChar.charAt(ramdomObj.nextInt(specialChar.length()));
        
        password=password+passChar[0]+passChar[1]+passChar[2]+passChar[3];
  
        for (int i = 4; i < len; i++)
        {
        	passChar[i] =
              values.charAt(ramdomObj.nextInt(values.length()));
        	password=password+passChar[i];
        }
        userPassword=password;
    }
	
	public void generateEmailAddress() {
		userEmail=emp.getFirstName().toLowerCase()+emp.getLastName().toLowerCase()+"@"+emp.getDepartment().toLowerCase()+"."+emp.getCompany().toLowerCase()+".com";
	}
	
	public void showCredentials() {
		System.out.println("Dear "+emp.getFirstName()+" your generated credentials are as follows");
		System.out.println("Email --> "+userEmail);
		System.out.println("Password --> "+userPassword);
	}
}
