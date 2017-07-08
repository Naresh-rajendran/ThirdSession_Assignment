import java.util.Scanner;
public class Array_Assignment_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Array_Min_Max a = new Array_Min_Max();
		a.getArrayValues();
		a.findMax_MinValues();
		a.putArrayValues();

	}

}
class Array_Min_Max
{
	int[] arr;
	int temp = 0;
	
	Array_Min_Max()
	{
		arr = new int[10];
	}
	
	Scanner input = new Scanner(System.in);
	
	void getArrayValues()
	{
		System.out.println("Enter 10 Values for Array ");
		for (int i = 0 ; i < arr.length ; i++)
		{
			arr[i] = input.nextInt();
		}
	}
	void putArrayValues()
	{
		System.out.println("The Sorted Values of the array");
		for (int i = 0 ; i < arr.length ; i++)
		{
			System.out.print(" "+arr[i]);
		}
		System.out.println(" ");
	}
	void findMax_MinValues()
	{
		
		for(int i=0 ; i < arr.length-1 ; i++)
		{	
			for(int j=0 ; j < arr.length-1 ; j++)
			{
				if(arr[j] > arr[j+1] )
				{ 					
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp ; 
					
				}
			}
			
		}
		
		System.out.println("Max Number in Array : " +arr[arr.length-1]);
		System.out.println("Min Number in Array : " +arr[0]);
		System.out.println(" ");
	}
}