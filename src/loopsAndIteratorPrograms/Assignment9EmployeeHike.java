package loopsAndIteratorPrograms;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Assignment9EmployeeHike {

	public static void main(String[] args) {
		Map<String,String> employeeDetails= new LinkedHashMap<>();
		employeeDetails.put("Name","Alice Johnson");
		employeeDetails.put("Base Salary","75000.0");
		employeeDetails.put("Experience","5.1");
		employeeDetails.put("Year-End Rating","4.2");
		
		Map<String,String> employeeDetails1= new LinkedHashMap<>();
		employeeDetails1.put("Name","Bob Smith");
		employeeDetails1.put("Base Salary","68000.0");
		employeeDetails1.put("Experience","3.2");
		employeeDetails1.put("Year-End Rating","3.8");
		
		Map<String,String> employeeDetails2= new LinkedHashMap<>();
		employeeDetails2.put("Name","Carol davis");
		employeeDetails2.put("Base Salary","82000.0");
		employeeDetails2.put("Experience","7.1");
		employeeDetails2.put("Year-End Rating","4.5");
		
		Map<String,String> employeeDetails3= new LinkedHashMap<>();
		employeeDetails3.put("Name","David Brown");
		employeeDetails3.put("Base Salary","90000.0");
		employeeDetails3.put("Experience","10.2");
		employeeDetails3.put("Year-End Rating","2.5");
		
		
		Map<String,String> employeeDetails4= new LinkedHashMap<>();
		employeeDetails4.put("Name","Eva Green");
		employeeDetails4.put("Base Salary","60000.0");
		employeeDetails4.put("Experience","2.4");
		employeeDetails4.put("Year-End Rating","3.5");
		
		
		List<Map<String, String>> employeesData = new ArrayList<Map<String, String>>();
		employeesData.add(employeeDetails);
		employeesData.add(employeeDetails1);
		employeesData.add(employeeDetails2);
		employeesData.add(employeeDetails3);
		employeesData.add(employeeDetails4);
		
		System.out.println(employeesData);
		
		
		for(String value:employeeDetails1)
		{
			
		}
		
		
		
		
		
		
		

	}

}
