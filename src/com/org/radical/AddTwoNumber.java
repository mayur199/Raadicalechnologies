package com.org.radical;

import java.util.Scanner;

public class AddTwoNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int a = sc.nextInt();
		System.out.println("Enter the second number: ");
		int b = sc.nextInt();
		
		int sum = a + b;
		System.out.println("The Sum of "+ a +" and " + b + " is : "+ sum);

	}

}
