package com.javaOOPS;

public class TestClass2 
{

	public static void main(String[] args) 
	{	


		Customer customer1 = new Customer();

		Customer customer2 = new Customer();

		customer1.displayCustomerDetails();	

		System.out.println("---------------------------------------------------------------");

		customer2.displayCustomerDetails();	

		System.out.println("------------------------------parameterized constructor---------------------------------");

		Customer customer11 = new Customer(200, "Ajay", "Pune", "aj@gmail.com", 9090908989L);

		Customer customer12 = new Customer(202, "Satish", "Nashik", "satish234@gmail.com", 7878909089L);

		customer11.displayCustomerDetails();	

		System.out.println("---------------------------------------------------------------");

		customer12.displayCustomerDetails();	

	}

}
