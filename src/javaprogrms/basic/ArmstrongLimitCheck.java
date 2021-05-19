package javaprogrms.basic;

public class ArmstrongLimitCheck 
{
	public static void main(String[] args) 
	{
		int limit=1000,number,temp;
		for(int num=2;num<=limit;num++)
		{
			int total=0;
			number=num;
			while(number!=0)
			{
				temp=number%10;
				total=total+(temp*temp*temp);
				number=number/10;
			}
			if(total==num)
			{
				System.out.println("Armstrong numbers: "+num);
			}
		}
	}
}

