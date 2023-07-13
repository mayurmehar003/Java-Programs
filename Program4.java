package day1;
//Prime number from 1 to 100
class Program4
{
	public static void main(String[] args)
	{
		
		
		for(int i=1;i<=100;i++)  //for range
		{
			int count=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.print(i+" ");
			}
			
			
		}
		
		
	}
}