package javaprogrms.StringProgrms;

public class DictinoryOrderWords 
{
	public static void main(String[] args)
  {
		String words[]= {"Imran","Khan","Amazon","Google","Olx","Zoom"};
		
		for(int i=0;i<5;i++)
		{
			for(int j=i+1;j<6;j++)
			{
				if(words[i].compareTo(words[j])>0)
				{
					String temp=words[i];
					words[i]=words[j];
					words[j]=temp;
				}
			}
		}
		System.out.println("Dictionary Order: ");
		
		for(int i=0;i<6;i++)
		{
			System.out.println(words[i]);
		}
	}
}

