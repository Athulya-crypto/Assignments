package Assignments;

public class Assignment2_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


String [][][] data= {
		{//semester-1
			
			 {"Mathematics I","Physics","Chemistry","Computer Programming","Engineering Drawing","Basic Electrical Eng."},
				 {"Pass(78)","Pass(85)","Fail(21)","Pass(74)","Pass(88)", "Pass(79)"}},
		
		{// semester 2
			{"Maths2","Mechanics","Environmental science","Basic electronics","Engineering physics","Engineering graphics"},
			{"Pass(82)","Pass(77)","Pass(93)","Fail(19)","Pass(90)","Pass(87)"}},

		{//Semester-3
			{"Data Structure","Discrete Mathematics","Digital Electronics","Operating Systems","Signals and Systems","Object Oriented Programming"},
				{"Pass(88)","Pass(81)","Pass(76)","Fail(32)","Pass(85)","Pass(78)"}
			},
		
		{  //semester -4
				{"Algorithms","Computer Networks","Database Systems","Microprocessors","Communication Engineering","Software Engineering"},
				{"Pass(91)","Pass(71)","Fail(19)","Pass(80)","Pass(76)","Pass(87)"}
		},
		{//Semester-5
			{"Probability & Status","Machine Learning","Compiler Design","Theory of computation","Embedded systems","Computer Graphics"},
			{"Pass(86)","Pass(88)","Pass(84)","Pass(95)","Pass(73)","Pass(90)"}
		}
		
					
		};

//Print Semester 2 Subject 4 and Subject 5 names.	
System.out.println("Semester 2 Subject 4 name is " + data[1][0][3]);
System.out.println("Semester 2 Subject 5 name is " + data[1][0][4]);
		
	//Print the Status/Marks of Semester 4 Subject 3 and Subject 6.	
System.out.println("The Status/Marks of Semester 4 Subject 3 is "+ data[3][1][2]);
System.out.println("he Status/Marks of Semester 4 Subject 6 is "+data[3][1][5]);

}
}