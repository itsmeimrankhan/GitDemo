package javaprogrms.interview;

public class DictionaryOrder 
{
	public static void main(String[] args)
  {
		String[] words= {"Imran","Aj","Xoxo","Yei","Tien","Ben","Orin"};
		
		for(int i=0;i<6;i++)
		{
			for(int j=i+1;j<7;j++)
			{
				if(words[i].compareTo(words[j])>0)
				{
					String temp=words[i];
					words[i]=words[j];
					words[j]=temp;
				}
			}
		}
		System.out.println("Dictionary otrder :");
		for(int i=0;i<7;i++)
		{
			System.out.println(words[i]);
		}
	}
}
