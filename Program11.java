//SPY numer     (digital sum==product sum)

package day1;

class Program11
{
	public static void main(String[] args)
	{
		int num=1412;
		
		int t1=num;
		
		int sum=0;
		while(t1!=0)
		{
			int last=t1%10;
			sum=sum+last;
			t1=t1/10;
		}
		
		int t2=num;
		
		int product=1;
		while(t2!=0)
		{
			int last=t2%10;
			product=product*last;
			t2=t2/10;
		}
		
		
		if(sum==product)
		{
			System.out.println("SPY Number");
		}
        else
		{
			 System.out.println("Not A SPY Number");
		}			 
	}
}