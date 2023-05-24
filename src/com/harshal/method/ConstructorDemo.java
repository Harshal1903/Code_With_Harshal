package com.harshal.method;

public class ConstructorDemo {
    // Getter Setter Methods
	int empId;
	String empName;
	float empSalary;
	String Address;
	long mobileNo;

	// Default Constructor
	public ConstructorDemo() {
		empId = 90;
		empName = "Madhav";
		empSalary = 40000.50f;
		Address = "Mumbai";
		mobileNo = 987465123;
	}

	// Parameterized Constructor                                  // 1. Override
	public ConstructorDemo(String name) {
		this.empName = name;
	}

	public ConstructorDemo(int id, String name) {                 // 2. Override
		this.empId = id;
		this.empName = name;
	}

	public ConstructorDemo(int id, String name, float salary, String Address, long ContactNo) { 
		this.empId = id;
		this.empName = name;
		this.empSalary = salary;                                 // 3. Override
		this.Address = Address;
		this.mobileNo = ContactNo;
	}

	// Getter Setter Methods
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public float getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(float empSalary) {
		this.empSalary = empSalary;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public static void main(String[] args) {

		ConstructorDemo method = new ConstructorDemo();                 // for Default Constructor
		// ConstructorDemo method = new ConstructorDemo("Rajiv");       //For Parameterized Constructor
		// ConstructorDemo method = new ConstructorDemo(8888, "Vaibhav");
		// ConstructorDemo method = new ConstructorDemo(7777, "Mayur", 90000.0f, "Pune",
		// 9635824710L);

		System.out.println(method.getEmpId());
		System.out.println(method.getEmpName());
		System.out.println(method.getEmpSalary());
		System.out.println(method.getAddress());
		System.out.println(method.getMobileNo());

	}
}
