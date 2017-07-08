
public class Session_3_Assignment_2_Main {
	
	/*
	 * Write a program in Java to show the use of super and this keyword with a constructor, methods, variables
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Inheritance_child in = new Inheritance_child(1234,"Naresh");
		in.showChild();
		System.out.println(" " );
		
		Inheritance_child in1 = new Inheritance_child(13345,"Ajay");
		in1.showChild();
		System.out.println(" " );
		
		Inheritance_child in2 = new Inheritance_child(57543,"Vijay");
		in2.showChild();
		System.out.println(" " );
		
		Inheritance_child in3 = new Inheritance_child(94567,"Namratha");
		in3.showChild();
		System.out.println(" " );

	}

}

class Inheritance_Parent
{
	int roll_No ; 
	String student_Name ;
	
	public void showBase()
	{
		System.out.println("Student Standard : Eighth Class");
		System.out.println("Institution Name : St.Joseph English School");
	}
	
}

class Inheritance_child extends Inheritance_Parent
{
	
	Inheritance_child(int roll_No , String student_Name)
	{
		//Here this Keyword used to access the Class Variable in Parent class 
		this.roll_No = roll_No;
		this.student_Name = student_Name;
		
	}
	
	void showChild()
	{
		//Here Super keyword you used get the value that are assigned with.
		System.out.println("Student's Roll No : " +super.roll_No);
		System.out.println("   Student's Name : " +super.student_Name);
		super.showBase(); 
		
	}
	
}


/*
 * Output
 * 
 * Student's Roll No : 1234
   Student's Name : Naresh
Student Standard : Eighth Class
Institution Name : St.Joseph English School
 
Student's Roll No : 13345
   Student's Name : Ajay
Student Standard : Eighth Class
Institution Name : St.Joseph English School
 
Student's Roll No : 57543
   Student's Name : Vijay
Student Standard : Eighth Class
Institution Name : St.Joseph English School
 
Student's Roll No : 94567
   Student's Name : Namratha
Student Standard : Eighth Class
Institution Name : St.Joseph English School
 * 
 * 
 */
