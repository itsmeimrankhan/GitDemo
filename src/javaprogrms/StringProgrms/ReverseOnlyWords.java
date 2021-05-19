package javaprogrms.StringProgrms;

import java.util.*;
import java.io.*;

public class ReverseOnlyWords 
{
	public static void main(String[] args)throws IOException 
  {
		System.out.println("Enter a string: ");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		String str=br.readLine();
		String s1=str;
		String[] s2=s1.split(" ");
		
		for(String string: s2)
		{
			StringBuffer sb=new StringBuffer();
			sb.append(string);
			sb.reverse();
			System.out.print(sb);
			System.out.print(" ");
		}
	}
}
