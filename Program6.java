package day1;
import java.util.Scanner;

class Program6
{
	public static void main(String[] args)
	{
		Scanner inp=new Scanner(System.in);
		
		System.out.println("Enter the Range : ");
		int num=inp.nextInt();
		
		
		int n1=0;
		int n2=1;
		System.out.print(n1+" "+n2+" ");
		
		for(int i=1;i<=num;i++)
		{
			int n3=n1+n2;
			System.out.print(n3+" ");
			n1=n2;
			n2=n3;
		}
	}
}