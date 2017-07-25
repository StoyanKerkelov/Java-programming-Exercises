
public class Student {

	/*1.Define a Student class that contains the following information about
	students::
		* Names,
		* Course,
		* Specialty,
		* University,
		* Email
		* phone number.
			
	2.2. Declare several Student class constructors who have
	different lists of parameters (for the overall information for a given
	Student or part of it). The data for which no input is available
	must initialize with null or 0 respectively.

	3. Add a static counter
	 
	4. Add a method in the Student class that displays complete information about
	The student.
	
	5.Modify the current Student class code so that you encapsulate
	Class data through properties.
	 */
	
	
	// Instance variables
	private String All_Names;
	private int schoolYear;
	private String degree;
	private String university;
	private String email;
	private String phoneNum;
	
	// Static variable
		static int studentCount=0;
		
		
	public Student(String All_Names){
		this(All_Names, 1, "not decided degree", "SoftUni", "not@real.mail", "+359000000000" );
	}
	public Student(String All_Names, int schoolYear){
		this(All_Names, schoolYear, "not decided degree", "SoftUni", "not@real.mail", "+359000000000" );
		}
	
	public Student(String All_Names, int schoolYear, String degree){
		this(All_Names, schoolYear, degree, "SoftUni", "not@real.mail", "+359000000000" );
	}
	
	public Student(String All_Names, int schoolYear, String degree, 
			String university){
		this(All_Names, schoolYear, degree, university, "not@real.mail", "+359000000000" );
	}
	
	public Student(String All_Names, int schoolYear, String degree, 
			String university, String email){
		this(All_Names, schoolYear, degree, university, email, "+359000000000" );
		}
	public Student(String All_Names, int schoolYear, String degree, 
			String university, String email,  String phoneNum) {//full variable constructor
		this.All_Names = All_Names;
		this.schoolYear = schoolYear;
		this.degree = degree;
		this.university = university;
		this.email = email;
		this.phoneNum = phoneNum;
		
		studentCount++;
	}
	
	String getName() {						//getter NAME
		return All_Names;
	}
	void setName(String name) {				//setter NAME
		this.All_Names = name;
	}
	
	int getSchoolYear() {						//getter SCHOOLYEAR
		return schoolYear;
	}
	void setSchoolYear(int schoolYear) {		//setter SCHOOLYEAR
		this.schoolYear = schoolYear;
	}
	
	String getDegree() {				 		//getter DEGREE
		return degree;
	}
	void setDegree(String degree) {			//setter DEGREE
		this.degree = degree;
	}
	
	String getUniversity() {					//getter UNIVERSITY
		return university;
	}
	void setUniversity(String university) {		//setter UNIVERSITY
		this.university = university;
	}
	
	String getEmail() {						//getter EMAIL
		return email;
	}
	void setEmail(String email) {				//setter EMAIL
		this.email = email;
	}
	
	String getPhoneNum() {					//getter PHONENUMBER
		return phoneNum;
	}
	void setPhoneNum(String phoneNum) {	//setter PHONENUMBER
		this.phoneNum = phoneNum;
	}
	
}
