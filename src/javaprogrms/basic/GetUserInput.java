package javaprogrms.basic;

import java.util.*;

public class GetUserInput 
{
	public static void main(String[] args)
  {
		String str;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a user name and press enter: ");
		
		str=sc.nextLine();
		
		System.out.println("Your Name: "+str);
		
	}
}
