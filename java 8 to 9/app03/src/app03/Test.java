package app03;
import java.util.*;
public class Test {

	public static void main(String[] args) {
        int[] [] arr=new int[3][2];
        //array initilizaion
        
        arr[0][0]=10;
        arr[0][1]=20;
        
        arr[1][0]=20;
        arr[1][1]=10;
        
        arr[2][0]=10;
        arr[2][1]=70;
         
        for(int i=0;i<3;i++){
        	for(int j=0;j<2;j++){
        		System.out.println(arr[i][j]+" ");		
        	}
        	System.out.println();
        	
        }

	}

}
