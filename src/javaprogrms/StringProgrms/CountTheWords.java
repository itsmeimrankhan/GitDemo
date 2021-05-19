package javaprogrms.StringProgrms;

public class CountTheWords 
{
	public static void main(String[] args) 
  {
		String str="my name is imran khan";
		String words[]=str.trim().split(" ");
		System.out.println("number of words in a string: "+words.length);
		System.out.println("words: ");
		
		for(int i=0;i<words.length;i++)
		{
			System.out.println(words[i]);
		}
  }
}
