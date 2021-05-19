package javaprogrms.interview;

public class RemoveWhiteSpaceCharacters 
{
	public static void main(String[] args)
	{
		String str="My Name Is Imran Khan";
		String noSpaceStr=str.replaceAll("\\s","");
		System.out.println(noSpaceStr);
	}
}
