package com.bridgelaps;

import java.util.Scanner;

public class AddressBook {
		ContactDetails person = new ContactDetails();

	    Scanner sc = new Scanner(System.in);

	    public void addDetails() {

	        System.out.println("Enter First Name : ");
	        person.setFirstName(sc.nextLine());

	        System.out.println("Enter Last Name : ");
	        person.setLastName(sc.nextLine());

	        System.out.println("Enter Address : ");
	        person.setAddress(sc.nextLine());

	        System.out.println("Enter City Name : ");
	        person.setCity(sc.nextLine());

	        System.out.println("Enter State Name : ");
	        person.setState(sc.nextLine());

	        System.out.println("Enter Zip Code : ");
	        person.setZip(sc.nextLine());

	        System.out.println("Enter Phone Number : ");
	        person.setPhoneNumber(sc.nextLine());

	        System.out.println("Enter Email Id : ");
	        person.setEmail(sc.nextLine());

	        System.out.println(person);

	    }

	    public void editDetails() {

	        System.out.println("Enter First Name Of A Person To Edit :  ");
	        String checkName = sc.nextLine();

	        if (checkName.equals(person.firstName)) {
	            addDetails();
	        } else {
	            System.out.println("Please Enter Valid First Name!");
	            editDetails();
	        }
	    }
	    public void deleteDetails() {
	    	System.out.println("Enter first Name of a person to delete: ");
	    	String checkName = sc.nextLine();
	    	if (checkName.equals(person.firstName)) {
	    		person = null;
	    		System.out.println("Details deleted successfully");
	    	} else {
	    		System.out.println("Please enter valid first naame:");
	    	}
	    }
	}
		