package com.javaOOPS;

public class Customer 
{

	//fields
	private int customerId;
	private String customerName;
	private String customerAddress;
	private String customerMailId;
	private long customerContactNo;
	
	//constructor
	public Customer()//default/zero- parameterized constructor
	{
		customerId = 120;
		customerName = "Dinesh Patil";
		customerAddress = "Mumbai";
		customerMailId = "dinesh@gmail.com";
		customerContactNo = 9089786756L;
	}
	
	
	
	public Customer(int customerId, String customerName, String customerAddress, String customerMailId,
			long customerContactNo) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerAddress = customerAddress;
		this.customerMailId = customerMailId;
		this.customerContactNo = customerContactNo;
	}



	//method
	public void displayCustomerDetails()
	{
		System.out.println(customerId);
		System.out.println(customerName);
		System.out.println(customerAddress);
		System.out.println(customerMailId);
		System.out.println(customerContactNo);
	}
		
}
