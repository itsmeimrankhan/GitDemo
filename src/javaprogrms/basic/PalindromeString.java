package javaprogrms.basic;

import java.util.*;

public class PalindromeString 
{
	public static void main(String[] args) 
	{
		String a,b="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string: ");
		
		a=sc.nextLine();
		int n=a.length();
		
		for(int i=n-1;i>=0;i--)
		{
			b=b+a.charAt(i);
		}
		if(a.equalsIgnoreCase(b))
		{
			System.out.println("Palindrome ");
		}
		else
			System.out.println("Not a Palindrome ");
	}
}

