package com.bridgelaps;

public class ContactDetails {
	String firstName;
	 String lastName;
	 String address;
	 String city;
	 String state;
	 String zip;
	 String phoneNumber;
     String email;
     
     
    public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
	
	public String getLastName() {
		return lastName;
	}
	
	 public void setLastName(String lastName) {
	        this.lastName = lastName;
   }
	 
	public String getAddress() {
		return address;
	}
	
	 public void setAddress(String address) {
	        this.address = address;
    }

	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
        this.city = city;
    }

	public String getState() {
		return state;
	}
	
	 public void setState(String state) {
	        this.state = state;
	    }

	public String getZip() {
		return zip;
	}
	
	public void setZip(String zip) {
        this.zip = zip;
    }

	public String getPhoneNumber() {
		return phoneNumber;
	}
	 
    public void setPhoneNumber(String PhoneNumber) {
        this.phoneNumber = PhoneNumber;
    }

    public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "ContactDetails{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip='" + zip + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

}