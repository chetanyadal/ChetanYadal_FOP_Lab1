package com.greatlearning.main;

import java.util.Scanner;

import com.greatlearning.model.Employee;
import com.greatlearning.service.CredentialService;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		
		Employee emp=new Employee("Chetan","Yadal");
		System.out.println("Please enter the department from the following");
		System.out.println("1. Techincal");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		int department=sc.nextInt();
		sc.nextLine();
		
		switch(department){
		case 1: emp.setDepartment("Tech");
				break;
		case 2: emp.setDepartment("Adm");
				break;
		case 3: emp.setDepartment("HR");
				break;
		case 4: emp.setDepartment("Lgl");
				break;
		default: System.out.println("Enter valid Department option");
					
		}
		
		CredentialService csr=new CredentialService();
		csr.generateEmailAddress();
		csr.generatePassword();
		csr.showCredentials();
		
	}
	

}
