package collections;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Assignment5_HashMap {
	public static void main(String[] args) {
		
		//Student Details
		Map<String,String> studentDetails=new LinkedHashMap<String,String>();
		studentDetails.put("Name","John Doe");
		studentDetails.put("Age","Twenty");
		studentDetails.put("Gender","Male");
		studentDetails.put("RollNum","SBA12345");
		studentDetails.put("Grade","A++");
		studentDetails.put("Major","Computer Science");
		studentDetails.put("GPA","A3.8");
		studentDetails.put("Eamil","john@exam");
		studentDetails.put("PANNUmber","SDF6543210");
		studentDetails.put("Address","123 Elm st");
		
		
		Map<String,String>studentDetails1 =new LinkedHashMap<String,String>();
		studentDetails1.put("Name","Jane Smith");
		studentDetails1.put("Age","Twenty one");
		studentDetails1.put("Gender","Female");
		studentDetails1.put("RollNum","SBA12346");
		studentDetails1.put("Grade","B+");
		studentDetails1.put("Major","MatheMatics");
		studentDetails1.put("GPA","A3.5");
		studentDetails1.put("Eamil","jane@exam");
		studentDetails1.put("PANNUmber","REW6543211");
		studentDetails1.put("Address","456 oak st");

		
Map<String,String>studentDetails2 =new LinkedHashMap<String,String>();
studentDetails2.put("Name","Mike Brown");
studentDetails2.put("Age","Twenty Two");
studentDetails2.put("Gender","Male");
studentDetails2.put("RollNum","SBA12347");
studentDetails2.put("Grade","A+");
studentDetails2.put("Major","Physics");
studentDetails2.put("GPA","A3.9");
studentDetails2.put("Eamil","mike@exam");
studentDetails2.put("PANNUmber","TYR6543212");
studentDetails2.put("Address","789 pine st");
		 
List<Map<String, String>> studentList = new ArrayList<Map<String, String>>();
studentList.add(studentDetails);
studentList.add(studentDetails1);
studentList.add(studentDetails2);


//Employee Details
Map<String, String> employeeDetails = new LinkedHashMap<String,String>();
employeeDetails.put("Employee ID", "E001");
employeeDetails.put("Name", "Alice Green");
employeeDetails.put("Age", "Thirty");
employeeDetails.put("Gender", "Female");
employeeDetails.put("Department", "Engineering");
employeeDetails.put("Position", "Software Engineer");
employeeDetails.put("Salary", "75K Pounds");
employeeDetails.put("Email", "alice@example.com");
employeeDetails.put("PAN Number", "SDF6543210");

Map<String, String> employeeDetails1= new LinkedHashMap<String,String>();
employeeDetails1.put("Employee ID", "E002");
employeeDetails1.put("Name", "Bob Johnson");
employeeDetails1.put("Age", "Thirty Five");
employeeDetails1.put("Gender", "Male");
employeeDetails1.put("Department", "Marketing");
employeeDetails1.put("Position", "Marketing Manager");
employeeDetails1.put("Salary", "85K Pounds");
employeeDetails1.put("Email", "bob@example.com");
employeeDetails1.put("PAN Number", "REW6543211");

Map<String, String> employeeDetails2 = new LinkedHashMap<String,String>();
employeeDetails2 .put("Employee ID", "E003");
employeeDetails2 .put("Name", "Carol White");
employeeDetails2 .put("Age", "Twenty Eight");
employeeDetails2 .put("Gender", "Female");
employeeDetails2 .put("Department", "Sales");
employeeDetails2 .put("Position", "Sales Executive");
employeeDetails2 .put("Salary", "65K Pounds");
employeeDetails2 .put("Email", "carol@example.com");
employeeDetails2 .put("PAN Number", "TYR6543212");

List<Map<String, String>> employeeList = new ArrayList<Map<String, String>>();
employeeList.add(employeeDetails);
employeeList.add(employeeDetails1);
employeeList.add(employeeDetails2);


	//Product Details
Map<String, String> productDetails = new LinkedHashMap<String,String>();
productDetails.put("Product ID", "P001");
productDetails.put("Name", "Laptop");
productDetails.put("Category", "Electronics");
productDetails.put("Price", "12K Pounds");
productDetails.put("Stock Quantity", "Not Available");
productDetails.put("Supplier", "Tech Supplies");
productDetails.put("Warranty", "2 years");
productDetails.put("Rating", "4.5 Stars");
productDetails.put("Manufacturing Date", "Aug 2023");
productDetails.put("Expiry Date", "Aug 2028");

Map<String, String> productDetails1= new LinkedHashMap<String,String>();
productDetails1.put("Product ID", "P002");
productDetails1.put("Name", "Desk Chair");
productDetails1.put("Category", "Furniture");
productDetails1.put("Price", "150K Pounds");
productDetails1.put("Stock Quantity", "Two");
productDetails1.put("Supplier", "Office Depot");
productDetails1.put("Warranty", "1 year");
productDetails1.put("Rating", "4 Stars");
productDetails1.put("Manufacturing Date", "Sep 2024");
productDetails1.put("Expiry Date", "N/A");

Map<String, String> productDetails2= new LinkedHashMap<String,String>();
productDetails2.put("Product ID", "P003");
productDetails2.put("Name", "Coffee Maker");
productDetails2.put("Category", "Kitchen");
productDetails2.put("Price", "75 Pounds");
productDetails2.put("Stock Quantity", "Two Hundred");
productDetails2.put("Supplier", "KitchenWorld");
productDetails2.put("Warranty", "6 months");
productDetails2.put("Rating", "4.2 Stars");
productDetails2.put("Manufacturing Date", "Jan 2025");
productDetails2.put("Expiry Date", "Jan 2027");

List<Map<String, String>> productList = new ArrayList<Map<String, String>>();
productList.add(productDetails);
productList.add(productDetails1);
productList.add(productDetails2);

//  Map of Student, Employee and Product Data 
Map<String, List<Map<String, String>>> details = new HashMap<>();
details.put("Students", studentList);
details.put("Employees", employeeList);
details.put("Products", productList);

// Print the supplier details
System.out.println("Supplier= "+ details.get("Products").get(1).get("Supplier"));
}

		
}
		
		
		
//		List<String> studentDetails=new ArrayList<String>();
//		studentDetails.add("John Doe");
//		studentDetails.add("Twenty");
//		studentDetails.add("Male");
//		studentDetails.add("SBA12345");
//		studentDetails.add("A++");
//		studentDetails.add("Computer Science");
//		studentDetails.add("A3.8");
//		studentDetails.add("john@exam");
//		studentDetails.add("SDF6543210");
//		studentDetails.add("123 Elm st");
//		
//		//System.out.println(studentDetails);
//		List<String>studentDetails1 =new ArrayList<String>();
//		studentDetails.add("Jane Smith");
//		studentDetails.add("Twenty one");
//		studentDetails.add("Female");
//		studentDetails.add("SBA12346");
//		studentDetails.add("B+");
//		studentDetails.add("MatheMatics");
//		studentDetails.add("A3.5");
//		studentDetails.add("jane@exam");
//		studentDetails.add("REW6543211");
//		studentDetails.add("456 oak st");
//System.out.println(studentDetails);
//		
//		//List<String>studentDetails2 =new ArrayList<String>();
//		studentDetails.add("Jane Smith");
//		studentDetails.add("Twenty one");
//		studentDetails.add("Female");
//		studentDetails.add("SBA12346");
//		studentDetails.add("B+");
//		studentDetails.add("MatheMatics");
//		studentDetails.add("A3.5");
//		studentDetails.add("jane@exam");
//		studentDetails.add("REW6543211");
//		studentDetails.add("456 oak st");
//		//System.out.println(studentDetails);
//print value on table Employee Details
//		List<String>employeeDetails =new ArrayList<String>();
//		employeeDetails.add("E001");
//		employeeDetails.add("Alice Green");
//		employeeDetails.add("Thirty");
//		employeeDetails.add("Female");
//		employeeDetails.add("Engineering");
//		employeeDetails.add("Software Engineer");
//		employeeDetails.add("75K Pounds");
//		employeeDetails.add("alice@example.com");
//		employeeDetails.add("SDF6543210");
//
//
//		employeeDetails.add("E002");
//		employeeDetails.add("Bob Johnson");
//		employeeDetails.add("Thirty Five");
//		employeeDetails.add("Male");
//		employeeDetails.add("Marketing");
//		employeeDetails.add("Marketing Manger");
//		employeeDetails.add("85K Pounds");
//		employeeDetails.add("bob@example.com");
//		employeeDetails.add("REW6543211");
//		
//		employeeDetails.add("E003");
//		employeeDetails.add("Carol White");
//		employeeDetails.add("Twenty Eight");
//		employeeDetails.add("Female");
//		employeeDetails.add("Sales");
//		employeeDetails.add("Sales Executive");
//		employeeDetails.add("65K Pounds");
//		employeeDetails.add("carol@example.com");
//		employeeDetails.add("TYR6543212");
//		
//print value on table Product Details
//		List<String>productDetails =new ArrayList<String>();
//		
//		productDetails.add("P001");
//		productDetails.add("Laptop");
//		productDetails.add("Electronics");
//		productDetails.add("12K pounds");
//		productDetails.add("Not Available");
//		productDetails.add("Tech Suppliers");
//		productDetails.add("2 Years");
//		productDetails.add("4.5 stars");
//		productDetails.add("Aug 2023");
//		productDetails.add("Aug 2028");
//		
//		
//		productDetails.add("P002");
//		productDetails.add("Deskchair");
//		productDetails.add("Furniture");
//		productDetails.add("150K pounds");
//		productDetails.add("Two");
//		productDetails.add("Office Depot");
//		productDetails.add("1 Years");
//		productDetails.add("4 stars");
//		productDetails.add("Sep 2024");
//		productDetails.add("N/A");
//		
//		
//		productDetails.add("P003");
//		productDetails.add("Coffee maker");
//		productDetails.add("Kitchen");
//		productDetails.add("75 pounds");
//		productDetails.add("Two Hundred");
//		productDetails.add("Kitchen World");
//		productDetails.add("6 Months");
//		productDetails.add("4.2 stars");
//		productDetails.add("Jan 2025");
//		productDetails.add("Jan 2027");
//		
//		
//		
//		//System.out.print(details);
//		Map<Integer ,List<String> >details=new HashMap<Integer,List<String>>();
//		details.put(1, studentDetails);
//		details.put(2,employeeDetails );
//		details.put(3,productDetails);
//		
//		System.out.println(details.get(3));
//	
		

		


