import java.util.Scanner;
public class Array_Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Array_List  a = new Array_List();
		a.getArray_Values();
		a.putArray_Values();
		a.sum_Number();

	}

}
class Array_List
{
	int[] arr ; 
	int Even_sum = 0 , Odd_Sum = 0; 
	Scanner input = new Scanner(System.in);
	
    Array_List()
    {
    	arr = new int[10];
    	
    }
    
    void getArray_Values()
    {
    	System.out.println("Please enter 10 values of array...");
    	for (int i = 0 ; i<arr.length ; i++)
    	{
    	    arr[i] = input.nextInt();	
    	}
    }
	
    void putArray_Values()
    {
    	 System.out.println("You have entered the values of array...");
    		for (int i = 0 ; i<arr.length ; i++)
    		{
    		    System.out.print(" "+arr[i]);	
    		}
    	System.out.println("");
    }
   
    void sum_Number()
    {
    	System.out.println("");
    	for(int i=0; i<arr.length;i++)
    	{
    		if(arr[i]%2==0)
    		{
    			Even_sum = Even_sum + arr[i] ;
    		}
    		else
    		{
    			Odd_Sum = Odd_Sum + arr[i];
    		}
    	}
    	System.out.println("Sum of Even Number : "+Even_sum );
    	System.out.println("Sum of  Odd Number : "+Odd_Sum );
    	
    }
	
}