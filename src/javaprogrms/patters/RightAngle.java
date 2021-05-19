package javaprogrms.patters;

public class RightAngle 
{
	public static void main(String[] args)
	{
		for(int rows=5;rows>0;rows--)
		{
			for(int cols=1;cols<=rows;cols++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}