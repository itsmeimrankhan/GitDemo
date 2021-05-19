package javaprogrms.StringProgrms;

public class DuplicateWords 
{
	public static void main(String[] args)
  {
	 String[] words= {"java","javascript","java","Perl","Perl"};
	 
	 for(int i=0;i<words.length-1;i++)
	 {
		 for(int j=i+1;j<words.length;j++)
		 {
			 if(words[i].equals(words[j]) && (i!=j))
			 {
				 System.out.println(words[j]);
			 }
		 }
	 }
  }
}