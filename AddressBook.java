package com.bridgelaps;

import java.util.Scanner;

public class AddressBook {
	public void addDetails() {

		ContactDetails person = new ContactDetails();

		Scanner sc = new Scanner(System.in);

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
}
