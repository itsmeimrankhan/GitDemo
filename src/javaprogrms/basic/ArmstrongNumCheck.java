package javaprogrms.basic;

public class ArmstrongNumCheck
{
	public static void main(String[] args) 
	{
		int num=371,number,temp,total=0;
		number=num;
		while(number!=0)
		{
			temp=number%10;
			total=total+(temp*temp*temp);
			number=number/10;
		}
		if(total==num)
		{
			System.out.println("Armstrong number "+num);
		}
		else
			System.out.println("Not an armstrong number "+num);
	}
}

