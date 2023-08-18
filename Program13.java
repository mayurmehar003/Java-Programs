//Sunny Nuber : number comes before perfect square
import java.util.Scanner;

class Program13
{
	public static void main(String[] args)
	{
		Scanner inp=new Scanner(System.in);
		
		int num=inp.nextInt();          //8
		
		double sqr=0;
		int d=0;
		
		sqr=Math.sqrt(n+1);            //root of 8+1 =root of 9=3
		
		d=sqr-Math.floor(sqr)         //3- 3.0=0        //Round of the number
		
	
	
         if(d==0.0)
		 {
			 System.out.println("Sunny Number");
		 }
         else
		 {
			 System.out.println("Not Sunny Number");
		 }			 
		
		
	}
}