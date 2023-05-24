package com.harshal.method;

public class Method_GetterSetter {

	int id;
	String name;                           /// Methods using Getter & Setter
	String email;
	int rollNo;
	String address;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAddress() {
		return address;
	}

	public static void main(String[] args) {

		Method_GetterSetter mt = new Method_GetterSetter();         // Instantiation an Object

		mt.setId(1001);
		// mt.setId(999);
		// mt.setId(555);
		mt.setName("Harshal Mahale");
		mt.setEmail("harshamahale02@gmail.com");
		mt.setRollNo(25);
		mt.setAddress("Jalgaon");

		System.out.println("Student ID : " + mt.getId());
		System.out.println("Student Name : " + mt.name);
		System.out.println("Student Email ID : " + mt.getEmail());
		System.out.println("Student Roll Number : " + mt.getRollNo());
		System.out.println("Student Address :" + mt.getAddress());

	}
}
