package day1;
//Perfect square num=6    1 2 3 4 5 6 =1+2+3 =6
class Program9
{
	public static void main(String[] args)
	{
		int num=6;
		
		int sum=0;
		for(int i=1;i<num;i++)
		{
			if(num%i==0)
			{
			sum=sum+i;
			}
		}
		
		if(sum==num)
		{
			System.out.println("Perfect Square");
		}
		else
		{
			System.out.println("Not Perfect Square");
		}
		
		
		
	}
}
