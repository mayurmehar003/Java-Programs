package day1;
//Strong Number 145=1!+4!+5!=145
class Program8
{
	public static void main(String[] args)
	{
		int num=145;
		
		int t1=num;
		
		int sum=0;
		while(t1!=0)
		{
			int last=t1%10;        //Last digit
			
			int product=1;
			for(int i=1;i<=last;i++)
			{
				product=product*i;       //Prodcut
			}
			
			sum=sum+product;            //sum
			t1=t1/10;
		}
		if(sum==num)
		{
			System.out.println("Strong Number");
		}
		else
		{
			System.out.println("Not Strong Number");
		}
		
	}
	
}