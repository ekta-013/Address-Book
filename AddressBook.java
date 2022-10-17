package com.bridgelaps;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
	
		ContactDetails person = new ContactDetails();
		ArrayList<ContactDetails> list = new ArrayList<>();
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

	        list.add(person);
	        System.out.println(person);
	        System.out.println("Contact Added Successfully");

	    }

	    public void editDetails() {
	    	int count = 0;
	    	if (list.isEmpty()) {
	    		System.out.println("There is no contact available");
	    	} else {
	    		System.out.println("Enter first name of a person to edit:");
	    		String editName = sc.nextLine();
	    		for (ContactDetails contact : list){
	    			if ((contact.getFirstName().equals(editName))) {
	    				
	    				System.out.println("Enter new first name: ");
	    				contact.setFirstName(sc.nextLine());
	    				
	    				System.out.println("Enter new last name: ");
	    				contact.setLastName(sc.nextLine());
	    				
	    				System.out.println("Enter new address: ");
	    				contact.setAddress(sc.nextLine());
	    				
	    				System.out.println("Enter new city name: ");
	    				contact.setCity(sc.nextLine());
	    				
	    				System.out.println("Enter new state name: ");
	    				contact.setState(sc.nextLine());
	    				
	    				System.out.println("Enter new zip code: ");
	    				contact.setZip(sc.nextLine());
	    				
	    				System.out.println("Enter New Phone Number : ");
	                    contact.setPhoneNumber(sc.nextLine());

	                    System.out.println("Enter New Email Id : ");
	                    contact.setEmail(sc.nextLine());
	    				
	                    System.out.println(contact);
	                    System.out.println("Contact edited successfully");
	                    count++;
	                    break;
	    			}
	    		}
	    		if (count == 0) {
	    			System.out.println("Please enter valid First name: ");
	    			
	    		}
	    	}
	    }
	    
	    public void deleteDetails() {
	    	int count = 0;
	    	if (list.isEmpty()) {
	    		System.out.println("There is  no contact availabe");
	    	} else {
	    		System.out.println("Enter first name of the person to delete: ");
	    		String deleteName = sc.nextLine();
	            for (ContactDetails contact : list) {
	                if (contact.getFirstName().equals(deleteName)) {
	                    list.remove(contact);
	                    System.out.println("Contact Deleted Successfully");
	                    count++;
	                    break;
	    	}
	    }	
		if (count == 0) {
			System.out.println("Please enter valis first name!");
		}
	}	
}
	    public void showDetails() {
	    	System.out.println("Number of contacts stored:" + list.size());
	    	if (list.isEmpty()) {
	    		System.out.println("There is no contacts available");
	    	} else {
	    		for (ContactDetails contactDetails : list) {
	    			System.out.println(contactDetails);
	   		}
	   	}
    }
}