package javaprogrms.StringProgrms;

public class DuplicateCharcters 
{
	public static void main(String[] args) 
  {
		String str="imran khan imran";
		int count=0;
		char[] inp=str.toCharArray();
		System.out.println("Duplicate characters in a string: ");
		
		for(int i=0;i<str.length();i++)
		{
			for(int j=i+1;j<str.length();j++)
			{
				if(inp[i]==inp[j])
				{
					System.out.print(inp[j]);
					count++;
					break;
				}
			}
		}	
	}
}
