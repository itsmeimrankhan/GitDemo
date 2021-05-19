package Interview;

import java.util.*;

public class LargestThreeNumbers 
{
	public static void main(String[] args) 
  {
		int x,y,z;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a three integers: ");
		
		x=sc.nextInt();
		y=sc.nextInt();
		z=sc.nextInt();
		
		if(x>y && x>z)
		{
			System.out.println("First num is lartgest:");
		}
		else if(y>z && y>x)
		{
			System.out.println("Second numb is largest: ");
		}
		else if(z>x && z>y)
		{
			System.out.println("Third num is largest: ");
		}
  }
}