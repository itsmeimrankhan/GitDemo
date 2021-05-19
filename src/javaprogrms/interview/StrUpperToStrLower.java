package javaprogrms.interview;

import java.util.*;

public class StrUpperToStrLower 
{
	public static void main(String[] args) 
	{
		String strUpper,strLower;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Upper case words: ");
		
		strUpper=sc.nextLine();
		strLower=strUpper.toLowerCase();
		
		System.out.println("Equivalent Lower case words: "+strLower);
		
	}
}
