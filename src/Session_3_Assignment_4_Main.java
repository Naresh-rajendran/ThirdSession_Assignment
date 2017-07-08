import java.util.*;
public class Session_3_Assignment_4_Main {

	/*
	 * Create a class Student which has some private data like name, phone number, roll number, class, use getter and setters to access this private data.
Create a method result which accepts marks in three subjects along with the student roll number and return the result of that student as pass or fails.
Create another class StudentResultProcesing and extend this class from the student class and it will print the result of a student.
Note: - The user has to give the input as student name, phone number, roll number, class along with the marks in three subjects. And the output should contain all the information of the student as his/her name, roll number, class, result.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StudentResultProcesing result = new StudentResultProcesing();
		result.getDetails();
		
		if(result.result(result.getMarkSubject1(), result.getMarkSubject2(),result.getMarkSubject3() ,result.getRollNumber()))
		{
			result.printResult();
			System.out.println("Result of the Student : Passed");
		}
		else
		{
			result.printResult();
			System.out.println("Result of the Student : Failed");
		}
		
		

	}

}
class Student 
{
	private String name = " "; 
	private int roll_number = 0 ; 
	private long  phone_number = 0 ;
	private String class_name = " " ; 
	private int Mark_subject_1 , Mark_subject_2 , Mark_subject_3 ;  
	private double total , Percentage ; 
	

	public String getStudentName()
	{
		return name;
	}
	public long getPhoneNumber()
	{
		return phone_number;
	}
	public int getRollNumber()
	{
		return roll_number ; 
	}
	public String getClassName()
	{
		return class_name;
	}
	public int getMarkSubject1()
	{
		return Mark_subject_1;
	}
	public int getMarkSubject2()
	{
		return Mark_subject_2;
	}
	public int getMarkSubject3()
	{
		return Mark_subject_3;
	}
	public double getTotalMarks()
	{
		return total;
	}
	public double getTotalPercentage()
	{
		return Percentage;
	}
	
	public String setStudentName(String name)
	{
		return this.name = name;
	}
	public long setPhoneNumber(long phone_number)
	{
		return this.phone_number = phone_number;
	}
	public int setRollNumber(int roll_number)
	{
		return this.roll_number = roll_number ; 
	}
	public String setClassName(String class_name)
	{
		return this.class_name = class_name;
	}
	public int setMarkSubject1(int Mark_subject_1)
	{
		return this.Mark_subject_1 = Mark_subject_1;
	}
	public int setMarkSubject2(int Mark_subject_2)
	{
		return this.Mark_subject_2 = Mark_subject_2;
	}
	public int setMarkSubject3(int Mark_subject_3)
	{
		return this.Mark_subject_3 = Mark_subject_3;
	}
	
	boolean result(int Mark_1 , int  Mark_2 , int  Mark_3 , int roll )
	{
		total = Mark_1 + Mark_2 + Mark_3 ; 
		
		Percentage = (total/300) * 100;
		
		if(Mark_1 <= 100 && Mark_2 <=  100 || Mark_3<= 100 )
		{
			if((Mark_1 >= 40) && (Mark_2 >= 40) && (Mark_3 >= 40) )
			{			
				return true;
			}
			else
			{
				return false;
			}
		}
		else 
		{
			System.out.println("Please Enter the Vaild Marks Less than or Equal to 100");
			return false ; 
	    }
		

	}	
}
class StudentResultProcesing extends Student
{
	
	Scanner in = new Scanner(System.in);
	
	void getDetails()
	{
		System.out.println("Enter the Student Name ");
		setStudentName(in.nextLine());
		
		System.out.println("Enter the Roll Number fo the Student");
		setRollNumber(in.nextInt());
		
		System.out.println("Enter the Phone Number of the Student ");
		setPhoneNumber(in.nextLong());
		
		System.out.println("Enter the Class of Student ");
		setClassName(in.next());
		
		System.out.println("Enter three Subjects Marks of the Student");
		setMarkSubject1(in.nextInt());
		setMarkSubject2(in.nextInt());
		setMarkSubject3(in.nextInt());
	}
	void printResult()
	{		
		System.out.println("***********Student Details***********");
		System.out.println("Name of the Student                : " +getStudentName());
		System.out.println("Name of the Student Roll Number    : " +getRollNumber());
		System.out.println("Class of the Student Studying      : " +getClassName());
		System.out.println("Contact Phone Number of student    : " +getPhoneNumber());
		
		System.out.println("***********Student Result Details***********");
		System.out.println("Marks for Subject 1 : " +getMarkSubject1());
		System.out.println("Marks for Subject 2 : " +getMarkSubject2());
		System.out.println("Marks for Subject 3 : " +getMarkSubject3());
		
		System.out.println("Total Marks obtained  : " +getTotalMarks());
		System.out.println("Percentage of Student : " +getTotalPercentage());
	}
	
}


/*
Output: 

Enter the Student Name 
Naresh R
Enter the Roll Number fo the Student
12345
Enter the Phone Number of the Student 
8122872752
Enter the Class of Student 
Tenth 
Enter three Subjects Marks of the Student
87
94
39
***********Student Details***********
Name of the Student                : Naresh R
Name of the Student Roll Number    : 12345
Class of the Student Studying      : Tenth
Contact Phone Number of student    : 8122872752
***********Student Result Details***********
Marks for Subject 1 : 87
Marks for Subject 2 : 94
Marks for Subject 3 : 39
Total Marks obtained  : 220.0
Percentage of Student : 73.33333333333333
Result of the Student : Failed
*/