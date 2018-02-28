package session.task1;
import java.util.Scanner;

class acad5
{
	

	public static void main(String[] args)
	{
	 
	    Scanner input=new Scanner(System.in);
	    System.out.print("input: ");
		int a=input.nextInt();
		System.out.println("printing first 10 multiples of: " + a);
		System.out.println("-----------------------------");
		for(int i=1;i<=10;i++)
		{
			System.out.println(a + "x" + i +"=" + (a*i));
		}
		
	}
}