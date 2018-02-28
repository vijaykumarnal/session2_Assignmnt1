package session.task1;
import java.util.Scanner;

class acad1
{
	

	public static void main(String[] args)
	{
	 
	    Scanner input=new Scanner(System.in);
	    System.out.print("First number is: ");
		int a=input.nextInt();
		System.out.print("Second number is: ");
		int b=input.nextInt();
		System.out.println("printing Even or Odd numbers: ");
		System.out.println("-----------------------------");
		for(int i=a;i<=b;i++)
		{
			if(i%2==0)
			{
				System.out.println("Even number: " + i);
			}
			else if(i%2==1)
			{
				System.out.println("Odd number: " + i);
			}
		}
		
	}
}