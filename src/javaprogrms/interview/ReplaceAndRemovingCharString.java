package javaprogrms.interview;

public class ReplaceAndRemovingCharString
{
	public static void main(String[] args)
  {
		String str="Hi Hello World";
		
		System.out.println(str.replaceAll("[i,e]",""));
		
		System.out.println(str.replace('o','l'));
		
		System.out.println(str.replace('l', 's'));
	}
}
