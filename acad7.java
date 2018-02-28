package session.task1;
//import java.util.Scanner;

class acad7
{
	//We can overload a method with same return type but parameter list will be 
	//different
     public int sum(int a,int b)
     {
    	 return a+b;
     }
     public int sum(int a,int b,int c)
     {
    	 return a+b;
     }
	public static void main(String[] args)
	{
	 
	    acad7 obj=new acad7();
	    System.out.println("Sum function 2 interger arguments passed: " + obj.sum(5,6));
	    System.out.println("Sum function 3 integer arguments passed: " + obj.sum(5,6,6));
	    

	    
		
	}
}