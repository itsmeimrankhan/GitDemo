package javaprogrms.patters;

public class Pyramid
{
	public static void main(String[] args)
	{
		for(int i=0;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=2*i+1;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
