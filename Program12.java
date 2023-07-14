package day1;

class Program12
{
	public static void main(String[] args)
	{
		int num=84411;
		
		int temp=num;
		
		int extremesum=0;
		int meansum=0;
		
		while(temp!=0)
		{
			if(temp==num || temp<10)
			{
				extremesum=extremesum+temp%10;
			}
			else
			{
				meansum=meansum+temp%10;
			}
			
			temp=temp/10;
		}
		
		if(extremesum==meansum)
		{
			System.out.println("Xylem Number");
		}
		else{
			System.out.println("Phloem Number");
		}
		
		
		
		
	}
}