package app20;
import java.util.*;
public class IfElseIf {

	public static void main(String[] args) {
		int marks;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter Your marks");
		marks= sc.nextInt();
		
		if (marks>90) {
			System.out.println("University Topper");
			
		}
		else if(marks>=80) {
			System.out.println("Class Topper");
			
		}
		else if(marks<70 && marks>=60) {
			System.out.println("Fist Divsion");
		}
		else {
			System.out.println("Second");
		}
	}
	
	
}
