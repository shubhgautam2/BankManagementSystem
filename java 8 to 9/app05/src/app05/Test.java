package app05;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter your age");
		int age=sc.nextInt();
		String result=(age>=18)?"valid voter":"invalid voter";
			System.out.println(result);
		
		

	}

}