package javaprogrms.interview;

public interface DuplicateElementArray 
{
	public static void main(String[] args) 
	{
		String[] strArray= {"Java","JavaScript","Java","C","Perl","Perl"};
		
		for(int i=0;i<strArray.length-1;i++)
		{
			for(int j=i+1;j<strArray.length;j++)
			{
				if(strArray[i].equals(strArray[j]) && (i!=j))
				{
					System.out.println(strArray[j]);
				}
			}
		}
	}
}
