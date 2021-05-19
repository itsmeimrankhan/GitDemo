package javaprogrms.StringProgrms;

import java.util.*;

public class removevowelsfromthestring 
{
	public static void main(String[] args) 
	{
		String str;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string: ");
		str=sc.nextLine();
		String result=str.replaceAll("[aeiouAEIOU]","");
		System.out.println("After removing vowel:"+result);
	}
}
