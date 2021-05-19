package javaprogrms.basic;

public class Factorial 
{
	public static void main(String[] args)
 {
		int n=5,i=1;
		long fact=1;
		
		while(i<=n)
		{
			fact=fact*i;
			i++;
		}
		System.out.println("Factorial of n: "+fact);
 }
}