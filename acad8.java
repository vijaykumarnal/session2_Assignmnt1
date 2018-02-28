package session.task1;
//import java.util.Scanner;

class acad8
{
	//We can overload a method with same return type but parameter list will be 
	//different
     
	public static void main(String[] args)
	{
	 
	    int[] arr= {5,2,4,3,1};
	    System.out.println("array before sorting: ");
	    System.out.println("---------------------");
	    for(int i=0;i<arr.length;i++)
	    {
	    	System.out.print(arr[i] + " ");
	    }
	    System.out.println();
	     for(int i=0;i<arr.length;i++)
	     {
	    	 for(int j=i+1;j<arr.length;j++)
	    	 {
	    		 if(arr[i]<arr[j])
	    		 {
	    			 int temp=arr[i];
	    			 arr[i]=arr[j];
	    			 arr[j]=temp;
	    		 }
	    	 }
	     }
	     System.out.println("array after sorting: ");
		    System.out.println("---------------------");
		    for(int i=0;i<arr.length;i++)
		    {
		    	System.out.print(arr[i] + " ");
		    }
		
	}
}