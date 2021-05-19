package javaprogrms.patters;

public class OneZeroPattern 
{
	public static void main(String[] args) 
	{
		for(int rows=1;rows<=5;rows++)
		{
			for(int cols=1;cols<=rows;cols++)
			{
				if(cols%2==0)
				{
					System.out.print("0");
				}
				else
				{
					System.out.print("1");
			}
		}
			System.out.println();
		}
	}
}


