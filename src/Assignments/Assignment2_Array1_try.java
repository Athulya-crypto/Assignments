package Assignments;

public class Assignment2_Array1_try {
	

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			//Creating1-D array Semester
	String []semester= {"sem1","sem2","sem3","sem4","sem5"};
	// Creating 2-D array
	String []subjects= {"Subject1","Subject2","Subject3","Subject4","Subject5","Subject6"};
	String[][] semsterSubjects= {semester,subjects};


	String [] status= {"Status1","Status2","Status3","Status4","Status5","Status6"};
	String[][] semesterStatus= {semester,status};


	/*
	Program to print Print Semester 2 Subject 4 and Subject 5 names.

	*/

	String [] sem2Subj= {"Mathematics II","Mechanics","Environmental Sciece","Basic Electronics","Engineering Physics","Engineering Graphics"};
	String [] sem2Status= {"Pass(82)","Pass(77)","Pass(93)","Fail(19)","Fail(24)","Pass(90)"};
	String[][] sem2SubStatus= {sem2Subj,sem2Status};
	String[][][]sem2Subjects= {sem2SubStatus,semsterSubjects};
	String[][][]sem2Statuses= {sem2SubStatus,semesterStatus};


	System.out.println("Semester2 Subject4 is "+sem2Subjects[0][0][3]);
	System.out.println("Semester2 Subject5 is "+sem2Subjects[0][0][4]);
	/*
	Print the Status/Marks of Semester 4 Subject 3 and Subject 6.

	*/
	String [] sem4Subj= {"Algorithms","Computer Networks","Database Systems","Microprocessors","Communication Engineering","Software Engineering"};
	String [] sem4Status= {"Pass(91)","Pass(73)","Fail(19)","Pass(80)","Pass(76)","Pass(87)"};
	String[][]sem4SubStatus= {sem4Subj,sem4Status};
	String[][][]sem4Subjects= {sem4SubStatus,semsterSubjects};
	String[][][]sem4Statuses= {sem4SubStatus,semesterStatus};

	System.out.println("The Status/Marks of Semester4 Subject3 is "+sem4Statuses[0][1][2]);
	System.out.println("The Status/Marks of Semester4 Subject6 is "+sem4Statuses[0][1][5]);


		}

	}

	