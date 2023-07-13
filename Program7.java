package day1;
//ArmStrong Number 153=1^3+5^3+3^3=153
class Program7
{
	public static void main(String[] agrs)
	{
		int num=153;
		
		int t1=num;
		
		int length=0;
		while(t1!=0)
		{
			t1=t1/10;
			length++;
		}
		
		int t2=num;
		int sum=0;
		while(t2!=0)
		{
			int last=t2%10;
			int product=1;
			
			for(int i=1;i<=length;i++)
			{
				product=product*last;
			}
			sum=sum+product;
			t2=t2/10;
		}
		
		if(num==sum)
		{
			System.out.println("Armstrong Number");
		}
		else
		{
			System.out.println("Not Armstrong Number");
		}
		
	}
	
	
}