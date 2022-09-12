package com.te.assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class User {
	static private String address;
	static private String name;
	static private long cardNo;
	static private int cvv;
	static String prodName;
	static User Product1 = new User("Bottle", 250, "Navy Blue", 25);
	static User Product2 = new User("Redmi 10 Prime Mobile", 25000, "Black", 125);
	static User Product3 = new User("HP Laptop", 35000, "Silver", 25);
	static Scanner sc = new Scanner(System.in);
	static String productName;
	static double productCost;
	static String productColor;
	static int noOfproducts;

	public User(String productName, double productCost, String productColor, int noOfproducts) {
		super();
		this.productName = productName;
		this.productCost = productCost;
		this.productColor = productColor;
		this.noOfproducts = noOfproducts;
	}

	public String toString() {
		return "\nProductName=" + productName + "\nProductCost=" + productCost + "\nProductColor=" + productColor
				+ "\nNoOfproducts=" + noOfproducts;
	}

	public static void getData(int a) {

		switch (a) {
		case 1: {
			System.out.println(Product1 + "\n" + Product2 + "\n" + Product3);
			System.out.println("Press 2 to Search for an item");
			a = sc.nextInt();
			if (a == 2) {
				System.out.println("Enter Product Name : ");
				prodName = sc.next();
				if (prodName.equalsIgnoreCase(Product1.prodName) || prodName.equalsIgnoreCase(Product2.prodName)
						|| prodName.equalsIgnoreCase(Product3.prodName)) {
					System.out.println("Press 1 to buy Product\nPress 2 to search again\nPress 3 to go back to last menu");
					int b=sc.nextInt();
					switch (b) {
					case 1: {
							System.out.print("Enter Name : ");
							name=sc.next();
							System.out.print("Enter Address : ");
							address=sc.next();
							System.out.print("Enter Card Number : ");
							cardNo=sc.nextLong();
							System.out.print("Enter CVV Number : ");
							cvv=sc.nextInt();
							break;
					}
					case 2:{
						getData(a);
						break;
					}
					case 3:{
						System.out.println("Thank you for visiting");
						break;
					}
					default:
						System.out.println("Enter Valid Input");
						getData(a);
					}
					}
				else {
					System.out.println("Product Not Found");
					getData(a);
				}
					
					}
				} 
		case 2:

	{
		if (a == 2) {
			System.out.println("Enter Product Name : ");
			prodName = sc.next();
			if (prodName.equalsIgnoreCase(Product1.prodName) || prodName.equalsIgnoreCase(Product2.prodName)
					|| prodName.equalsIgnoreCase(Product3.prodName)) {
				System.out.println("Press 1 to buy Product\nPress 2 to search again\nPress 3 to go back to last menu");
				int b = sc.nextInt();
				switch (b) {
				case 1: {
					System.out.print("Enter Name : ");
					name = sc.next();
					System.out.print("Enter Address : ");
					address = sc.next();
					System.out.print("Enter Card Number : ");
					cardNo = sc.nextLong();
					System.out.print("Enter CVV Number : ");
					cvv = sc.nextInt();

				}
				}

			}
		}
	}}
}

	public static void main(String[] args) {

		System.out.print("Press 1 For Show all Elements \nPress 2 to Search for an item\n");
		int a = sc.nextInt();
		getData(a);

	}
}
