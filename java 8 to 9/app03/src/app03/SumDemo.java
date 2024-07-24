package app03;
import java.util.*;
public class SumDemo {

	public static void main(String[] args) {
		int num,sum=0,digit;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		num=sc.nextInt();
		
		while (num>0) {
			digit=num%10; 
			sum=sum+digit;
			num=num/10;
			
		}
		System.out.println("The Sum of digt is"+sum);

	}

}
