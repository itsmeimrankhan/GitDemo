package javaprogrms.basic;

public class PalindromeNumber
{
	public static void main(String[] args)
	{
		int number=1221,rev,temp,total=0;
		temp=number;
		
		while(number>0)
		{
			rev=number%10;
			total=rev+(total*10);
			number=number/10;
		}
		if(total==temp)
		{
			System.out.println("Palindrome Number ");
		}
		else
			System.out.println("Not a Palindrome Number ");
	}
}
