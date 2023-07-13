package day1;
//Prime number present in given number
class Program5
{
	public static void main(String[] args)
	{
		int num=12345;
		
		
		int count1=0;  //once we get prime number , value added in count1
		while(num!=0)
		{
			int last=num%10;
			
			int count=0;
			for(int i=1;i<=last;i++)
			{
				if(last%i==0)
				{
					count++;
				}
			}
			
			if(count==2)
			{
				System.out.println(last+" is prime number ");
				count1++;
			}
			num=num/10;
		}
		
	}
}