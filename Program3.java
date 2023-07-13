package day1;
//Prime number: the number which is divisible by 1 and itself
class Program3
{
	public static void main(String[] args)
	{
		int num=5;
		
		int count=0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				count++;	
			}
		}
		if(count==2)
		{
			System.out.print("Prime Number");
		}
		else
		{
			System.out.print("Not Prime Number");
		}
	}
}
