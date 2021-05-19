package javaprogrms.StringProgrms;

import java.util.*;

public class FrequencyWordsUsingHashMap
{
	public static void main(String[] args) 
 {
		String s="i know java i know core java i know java basics";
		String a[]=s.split(" ");
		
		Map<String,Integer> words=new HashMap<>();
		for(String str:a)
		{
			if(words.containsKey(str))
			{
				words.put(str, 1 + words.get(str));
			}
			else
			{
				words.put(str,1);
			}
		}
		System.out.println(words);	
	}
}
