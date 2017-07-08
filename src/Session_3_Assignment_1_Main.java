import java.util.Scanner;
public class Session_3_Assignment_1_Main {
	
	/*
	 * Write a program in java to differentiate between instance variables and class variables. And also show the scope of each.
     * Hint: - Class variables are those variables which are declared as static.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//The Instance variable 
		Sub_class instance_1 = new Sub_class(10,12);
		instance_1.show_numbers();
		
		Sub_class instance_2 = new Sub_class(23,13);
		instance_2.show_numbers();
		
		Sub_class instance_3 = new Sub_class(425,7654);
		instance_3.show_numbers();
		
		Sub_class instance_4 = new Sub_class(135,261);
		instance_4.show_numbers();
		instance_4.show_instanceNumber();

	}

}

class Base_class
{
	protected int number_1 , number_2 ; 
	Scanner sc = new Scanner(System.in);
	
	/*public void get_number()
	{
		System.out.println("Enter two numbers ");
		number_1 = sc.nextInt();
		number_2 = sc.nextInt();
	}*/
	
	protected void show_numbers()
	{
		System.out.println("The Addtion two instance variables is " +Sub_class.Total_instance + " Addtion : " +(number_1 + number_2));
		System.out.println("");
	}
}
class Sub_class extends Base_class
{
	//
	static int Total_instance = 0 ; 
	
	Sub_class(int number_1 , int number_2)
	{
		//The Local variable/Instance variable works for Particular object 
		this.number_1 = number_1;
		this.number_2 = number_2;
		//Increment the Class Variable 
		Total_instance++;
	}
	
	void show_instanceNumber()
	{
		//Increments the class variable common for all instances 
		System.out.println("The Total Number of instance created for Sub Class: " +Total_instance);
	}
}


/*

Output : 

The Addtion two instance variables is 1 Addtion : 22

The Addtion two instance variables is 2 Addtion : 36

The Addtion two instance variables is 3 Addtion : 8079

The Addtion two instance variables is 4 Addtion : 396

The Total Number of instance created for Sub Class: 4





*/