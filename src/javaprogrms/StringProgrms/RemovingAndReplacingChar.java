package javaprogrms.StringProgrms;

public class RemovingAndReplacingChar 
{
	public static void main(String[] args) 
 {
		String str="imran khan my name is";
		
		System.out.println(str.replaceAll("[m,h]",""));
		
		System.out.println(str.replace('i','z'));
		System.out.println(str.replace('n','x'));
		
		System.out.println(str.replaceAll("i", "replacement"));
		
	}

}
