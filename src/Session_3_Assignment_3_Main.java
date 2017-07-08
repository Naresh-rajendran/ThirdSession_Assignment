
public class Session_3_Assignment_3_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Inheritance_ChildClass input = new Inheritance_ChildClass(12.0, 24.0);
		
	}

}

/*
Create a program to demonstrate Constructor Chaining. Between the same class and between the child and parent class.
 */

class Inheritance_BaseClass
{
	 int x = 0 , y = 0 , z = 0 ; 
	 Inheritance_BaseClass()
	 {
		 System.out.println("Base Class First CONSTRUCTOR ");
		 
	 }
	 Inheritance_BaseClass(int x , int y)
	 {
		 this();
		 this.x = x ;
		 this.y = y;
		 
		 System.out.println("Base Class Second CONSTRUCTOR " +this.x +"," +this.y);
	 }
	 Inheritance_BaseClass(int x , int y , int z)
	 {
		 //this Keyword calls previous constructor calls 
		 this(5, 10);
		 this.x = x;
		 this.y = y;
		 this.z = z;
		 
		 System.out.println("Base Class Third CONSTRUCTOR " +this.x +"," +this.y +"," +this.z);
		 
	 }
	
}

class Inheritance_ChildClass extends Inheritance_BaseClass
{
	double x = 0.0 , y = 0.0 ; 
	Inheritance_ChildClass(double x , double y)
	{
		//This Super calls the Inheritance Base Class and through Constructor Chaining it calls Base class constructor
		super(5,10,12);
		
		this.x = x;
		this.y = y;
		System.out.println("The Child Class Variables assigned through Constructor are " +this.x +"," +this.y);
	}
	
}



/*
 * Output : 
 * Base Class First CONSTRUCTOR 
	Base Class Second CONSTRUCTOR 5,10
	Base Class Third CONSTRUCTOR 5,10,12
	The Child Class Variables assigned through Constructor are 12.0,24.0
 * 
 */
