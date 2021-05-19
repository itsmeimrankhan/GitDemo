package javaprogrms.basic;

public class EvenOddNumbers 
{
	public static void main(String[] args)
	{
		int limit=50;
		for(int i=0;i<=limit;i++)
		{
			if(i%2==0)
			{
				System.out.println("Even: "+i);
			}
			else
				System.out.println("Odd: "+i);
		}
	}
}
