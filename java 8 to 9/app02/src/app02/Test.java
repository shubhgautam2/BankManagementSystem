package app02;
import java.util.*;

public class Test {

	public static void main(String[] args) {
		int x=0, y=1, temp=0,num;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the upper limit");
		num = sc.nextInt();
		System.out.println(x+ " "+y+" ");
		while(temp<=num) {
		 temp=x+y;
		System.out.println(temp+" ");
		x = y;
		y = temp;		
	}
}

}
