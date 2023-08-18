//Perfect Square : Product of an integer(3) is multiplied by itself(3) =9
import java.util.Scanner;

class Program12
{
	public static void main(String[] args)
	{
		Scanner inp=new Scanner(System.in);
		
		System.out.println("Enter the Number : ");
		int num=inp.nextInt();
		
		boolean isperfectsquare=false;
		
		for(int i=1;i*i<=num;i++)
		{
			if(i*i==num)
			{
				isperfectsquare=true;
				break;
			}
			
			
		}
		
		if(isperfectsquare)
		{
			System.out.println("Perfect Square");
			
			
		}
		else
		{
			System.out.println("Not Perfect Square");
		}
		
		
		
	}
	
}