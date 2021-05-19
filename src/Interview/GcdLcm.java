package Interview;

import java.util.*;

public class GcdLcm 
{
	static int gcd(int x,int y)
	{
		int r=0,a,b;
		
		a=(x>y)?x:y;
		b=(x<y)?x:y;
		
		r=b;
		
		while(a%b!=0)
		{
			r=a%b;
			a=b;
			b=r;
		}
		return r;
	}
	
	static int lcm(int x,int y)
	{
		int a;
		
		a=(x>y)?x:y;
		
		while(true)
		{
			if(a%x==0 && a%y==0)
				
				return a;
				++a;
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the two numbers: ");
		
		int x=sc.nextInt();
		int y=sc.nextInt();
		
		System.out.println("The gcd of the number is: "+gcd(x,y));
		System.out.println("The lcm of the number is: "+lcm(x,y));
		
		sc.close();
	}
}