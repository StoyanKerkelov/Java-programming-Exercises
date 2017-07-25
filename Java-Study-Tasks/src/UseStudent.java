import java.util.Objects;
import java.util.Scanner;
	/*Add a static method in the StudentTest class that creates several
	student object and store them in static fields. Create
	a static property of the class to access them. Write a test
	program to display information about them in the console. */

public class UseStudent {
	public static Object array[];
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Write how much students infos do you want to input?");
		int counter = input.nextInt();
		Object array [] = new Object[counter];
		for(int i =0; i< counter; i++){
			array[i] = SetStudent();
		}
		System.out.println("Your input is:\n ");
		for(int i =0; i< counter; i++){
			Object instanceOfStudent = array[i];
			PrintStudent((Student) instanceOfStudent);
		}
	}
	
	public static Student SetStudent(){	//set student fields
		Scanner input = new Scanner(System.in);
		/*String All_Names, int schoolYear, String degree, 
		String university, String email,  String phoneNum*/
		
		//NAME
		System.out.print("Write full name ");
		String name = input.nextLine();
		//SCHOOLYEAR
		System.out.print("Write school year ");
		int schoolyear = input.nextInt();
		input.nextLine();
		//DEGREE
		System.out.print("Write degree ");
		String degree = input.nextLine();
		//UNINVERSITY
		System.out.print("Write university ");
		String university = input.nextLine();
		//EMAIL
		System.out.print("Write email ");
		String email = input.nextLine();
		//PHONENUMBER
		System.out.print("Write phonenumber ");
		String phonenumber = input.nextLine();
		
		return  new Student(name, schoolyear, degree, university, email, phonenumber);
		
	}
	
	public static void PrintStudent(Student InstanceOfStudent){//print student fields
		
		System.out.println("Student data:");
		System.out.println("Student name: " + InstanceOfStudent.getName());	//using getters
		System.out.println("Student school year: " + InstanceOfStudent.getSchoolYear());
		System.out.println("Student degree: " + InstanceOfStudent.getDegree());
		System.out.println("Student university: " + InstanceOfStudent.getUniversity());
		System.out.println("Student email: " + InstanceOfStudent.getEmail());
		System.out.println("Student phonenumber: " + InstanceOfStudent.getPhoneNum());
		System.out.println();
	}
}
