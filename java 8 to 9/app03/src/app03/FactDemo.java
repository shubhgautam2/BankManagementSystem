package app03;
import java.util.*;

public class FactDemo {

	public static void main(String[] args) {
		int temp,num, fact=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		num=sc.nextInt();
		temp=num;
	while(num>=1) {
		fact=fact*num; //fact*=num;
		num--;
	}
	System.out.println("Factorial of"+temp+" is"+fact);
	
	}

}
