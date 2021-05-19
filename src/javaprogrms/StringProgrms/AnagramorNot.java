package javaprogrms.StringProgrms;

import java.util.Arrays;

public class AnagramorNot
{
	public static void main(String[] args) 
	{
		String str1="imran";
		String str2="namri";
		System.out.println("Both strings are anagram: "+anagramCheck(str1,str2));
	}

	public static boolean anagramCheck(String str1, String str2)
	{
		char[] String1=str1.toCharArray();
		char[] String2=str2.toCharArray();
		Arrays.sort(String1);
		Arrays.sort(String2);
		return Arrays.equals(String1,String2);
	}
}
