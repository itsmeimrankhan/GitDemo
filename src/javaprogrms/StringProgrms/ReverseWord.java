package javaprogrms.StringProgrms;

public class ReverseWord 
{
	public static void main(String[] args)
  {
		String str="I Am Imran Khan";
		String[] split=str.split(" ");
		String result="";
		
		for(int i=split.length-1;i>=0;i--)
		{
			result+=(split[i]+" ");
		}
		System.out.println(result.toString());
	}
}
