package session.task1;
//import java.util.Scanner;

class acad6
{
	//method overloading defined as function with same name have
	//multiple defintions with different return type and parameter list
     public int sum(int a,int b)
     {
    	 return a+b;
     }
     public double sum(double a,double b)
     {
    	 return a+b;
     }
	public static void main(String[] args)
	{
	 
	    acad6 obj=new acad6();
	    System.out.println("Sum function 2 interger arguments passed: " + obj.sum(5,6));
	    System.out.println("Sum function 2 double arguments passed: " + obj.sum(5.0,6.0));
	    

	    
		
	}
}