package javaprogrms.interview;

public class CountTheWords 
{
	public static void main(String[] args)
  {
		String str="My Name Is Imran Khan";
		String[] words=str.trim().split(" ");
		System.out.println("Number Of Words in a string :"+words.length);
		System.out.println("Words :");
		for(int i=0;i<words.length;i++)
		{
			System.out.println(words[i]);
		}
	}
}
