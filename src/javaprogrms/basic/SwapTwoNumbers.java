package javaprogrms.basic;

import java.util.*;

public class SwapTwoNumbers 
{
	public static void main(String[] args)
	{
		int x,y,temp;	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter x and y values: ");
		
		x=sc.nextInt();
		y=sc.nextInt();
		
		System.out.println("Before Swapping \n x= "+x+" \n y= "+y);
		
		temp=x; 	// x = x+y;
		x=y;        // y = x-y;
		y=temp;     // x = x-y;
        
		System.out.println("After Swapping \n x= "+x+" \n y= "+y);
	}
}
