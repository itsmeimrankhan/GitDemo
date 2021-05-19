package javaprogrms.basic;

public class ReverseNumber
{
	public int reverse(int number)
	{
		int reverse=0;
		
		while(number!=0)
		{
			reverse=(reverse*10)+(number%10);
			number=number/10;
		}
		return reverse;
	}
	public static void main(String[] args) 
   {
		ReverseNumber rn=new ReverseNumber();
		System.out.println("Result:"+rn.reverse(1234567890));
	}
}