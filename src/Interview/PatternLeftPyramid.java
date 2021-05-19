package Interview;

import java.util.*;

public class PatternLeftPyramid 
{
	public static void main(String[] args)
   {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		int k=1;
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(k);
				
				if(j<i)
				{
					System.out.print("*");
				}
				k++;
			}
			System.out.println();
		}
		int p=n;
		k=k-n;
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=p;j++)
			{
				System.out.print(k);
				k++;
				
				if(j<p)
				{
					System.out.print("*");
				}
			}
			p--;
			k=k-(2*p+1);
			System.out.println();
		}
   }
}