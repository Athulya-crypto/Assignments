package collections;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Assignment5_HashMap {
	public static void main(String[] args) {
		
		List<String> studentDetails=new ArrayList<String>();
		studentDetails.add("John Doe");
		studentDetails.add("Twenty");
		studentDetails.add("Male");
		studentDetails.add("SBA12345");
		studentDetails.add("A++");
		studentDetails.add("Computer Science");
		studentDetails.add("A3.8");
		studentDetails.add("john@exam");
		studentDetails.add("SDF6543210");
		studentDetails.add("123 Elm st");
		
		//System.out.println(studentDetails);
		List<String>studentDetails1 =new ArrayList<String>();
		studentDetails.add("Jane Smith");
		studentDetails.add("Twenty one");
		studentDetails.add("Female");
		studentDetails.add("SBA12346");
		studentDetails.add("B+");
		studentDetails.add("MatheMatics");
		studentDetails.add("A3.5");
		studentDetails.add("jane@exam");
		studentDetails.add("REW6543211");
		studentDetails.add("456 oak st");
//System.out.println(studentDetails);
		
		//List<String>studentDetails2 =new ArrayList<String>();
		studentDetails.add("Jane Smith");
		studentDetails.add("Twenty one");
		studentDetails.add("Female");
		studentDetails.add("SBA12346");
		studentDetails.add("B+");
		studentDetails.add("MatheMatics");
		studentDetails.add("A3.5");
		studentDetails.add("jane@exam");
		studentDetails.add("REW6543211");
		studentDetails.add("456 oak st");
		//System.out.println(studentDetails);
// print value on table Employee Details
		List<String>employeeDetails =new ArrayList<String>();
		employeeDetails.add("E001");
		employeeDetails.add("Alice Green");
		employeeDetails.add("Thirty");
		employeeDetails.add("Female");
		employeeDetails.add("Engineering");
		employeeDetails.add("Software Engineer");
		employeeDetails.add("75K Pounds");
		employeeDetails.add("alice@example.com");
		employeeDetails.add("SDF6543210");


		employeeDetails.add("E002");
		employeeDetails.add("Bob Johnson");
		employeeDetails.add("Thirty Five");
		employeeDetails.add("Male");
		employeeDetails.add("Marketing");
		employeeDetails.add("Marketing Manger");
		employeeDetails.add("85K Pounds");
		employeeDetails.add("bob@example.com");
		employeeDetails.add("REW6543211");
		
		employeeDetails.add("E003");
		employeeDetails.add("Carol White");
		employeeDetails.add("Twenty Eight");
		employeeDetails.add("Female");
		employeeDetails.add("Sales");
		employeeDetails.add("Sales Executive");
		employeeDetails.add("65K Pounds");
		employeeDetails.add("carol@example.com");
		employeeDetails.add("TYR6543212");
		
// print value on table Product Details
		List<String>productDetails =new ArrayList<String>();
		
		productDetails.add("P001");
		productDetails.add("Laptop");
		productDetails.add("Electronics");
		productDetails.add("12K pounds");
		productDetails.add("Not Available");
		productDetails.add("Tech Suppliers");
		productDetails.add("2 Years");
		productDetails.add("4.5 stars");
		productDetails.add("Aug 2023");
		productDetails.add("Aug 2028");
		
		
		productDetails.add("P002");
		productDetails.add("Deskchair");
		productDetails.add("Furniture");
		productDetails.add("150K pounds");
		productDetails.add("Two");
		productDetails.add("Office Depot");
		productDetails.add("1 Years");
		productDetails.add("4 stars");
		productDetails.add("Sep 2024");
		productDetails.add("N/A");
		
		
		productDetails.add("P003");
		productDetails.add("Coffee maker");
		productDetails.add("Kitchen");
		productDetails.add("75 pounds");
		productDetails.add("Two Hundred");
		productDetails.add("Kitchen World");
		productDetails.add("6 Months");
		productDetails.add("4.2 stars");
		productDetails.add("Jan 2025");
		productDetails.add("Jan 2027");
		
		
		
		//System.out.print(details);
		Map<Integer ,List<String> >details=new HashMap<Integer,List<String>>();
		details.put(1, studentDetails);
		details.put(2,employeeDetails );
		details.put(3,productDetails);
		
		System.out.println(details.get(3));
	
		
		
//Map<Integer ,List<Map<String,String> >>details1=new HashMap<Integer ,List<Map<String,String> >>();
//		Map<Integer ,List<String> >details1=new HashMap<Integer,List<String>>();
//		details1.put(3, productDetails);
//		System.out.println(details1.get(3));

		


}
}