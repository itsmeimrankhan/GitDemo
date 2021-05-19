package javaprogrms.StringProgrms;

import java.util.Scanner;

public class PalindromeStringSentence 
{
	public static void main(String[] args) 
	 {
			Scanner sc=new Scanner(System.in);
			String s;
			String w="";
			String rw="";
			int l,i;
			char ch;
			System.out.println("Enter the sentence: ");
			s=sc.nextLine();
			s=s+ " ";
			l=s.length();
			System.out.println("The palindrome words are: ");
			
			for(i=0;i<l;i++)
			{
				ch=s.charAt(i);
				if(ch!=' ')
				{
					w=w+ch;
					rw=ch+rw;
					
				}
				else
				{
					if(w.equalsIgnoreCase(rw))
					{
						System.out.println(w);
					}
					w="";
					rw="";
					
				}
			}
	 }
}

