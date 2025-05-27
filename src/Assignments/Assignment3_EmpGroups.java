package Assignments;

public class Assignment3_EmpGroups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//Creating an object for the class "Employees" for printing the values			
		Assignment3_Employees emp=new Assignment3_Employees();
	String []employeeNames= {emp.employeeName1,emp.employeeName2,emp.employeeName3};
	int [] employeeIDs= {emp.employeeId1,emp.employeeId2,emp.employeeId3};
	System.out.println(employeeNames[0] +":" + employeeIDs[0]);
	System.out.println(employeeNames[1] +":" + employeeIDs[1]);
	System.out.println(employeeNames[2] +":" + employeeIDs[2]);

	}

}
