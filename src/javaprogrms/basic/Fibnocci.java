package javaprogrms.basic;

public class Fibnocci 
{
	public static void main(String[] args) 
	{
		int a=0;
		int b=1;
		System.out.println(a+ " " +b);
		int c=a+b;
		
		for(int i=3;i<=10;i++)
		{
			c=a+b;
			a=b;
			b=c;
			System.out.print(c+ " ");
		}
	}
}
