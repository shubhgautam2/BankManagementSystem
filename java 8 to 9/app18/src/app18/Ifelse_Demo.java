package app18;
import java.util.*;

public class Ifelse_Demo {

	public static void main(String[] args) {
		int age;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age");
		age=sc.nextInt();
		if (age>=18) {
		System.out.println("Valid Voter");
		}
		else  {
			System.out.println("Invalid voter");
			
		}

	}

}
