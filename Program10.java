package day1;
//Neon number
class Program10
{
	public static void main(String[] args)
	{
		int num=9;
		
		int p=num*num;
		
		int sum=0;
		while(p!=0)
		{
			int last=p%10;
			
			sum=sum+last;
			
			p=p/10;
		}
		
		if(sum==num)
		{
			System.out.println("Neon Square");
		}
		else
		{
			System.out.println("Not Perfect Square");
		}
		
		
	}
}
