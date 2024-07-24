package app15;
import java.util.*;

public class OverRiding {

	public static void main(String[] args)
	{
		System.out.println("Enter your age");
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		String s=age>18? "eligible vote ": "Not eligible voter";
		System.out.println(s);
			
	}

}
