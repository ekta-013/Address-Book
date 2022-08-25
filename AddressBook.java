package com.bridgelaps;


public class AddressBook {
	public void addDetails() {

		ContactDetails person = new ContactDetails();

        person.setFirstName("Ekta");
        person.setLastName("Mohite");
        person.setAddress("Takka Colony,Panvel");
        person.setCity("Panvel");
        person.setState("Maharashtra");
        person.setZip("410206");
        person.setPhoneNumber("7887690540");
        person.setEmail("ektamo0123@gmail.com");

        System.out.println(person);
    }
}
