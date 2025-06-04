package loopsAndIteratorPrograms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Assignment9EmployeeHike {

	public static void main(String[] args) {
		String[] employees = { "Alice Johnson", "Bob smith", "Carol davis", "Davis Brown", "Eva Green" };

		Double[] emp1Data = { 75000.0, 5.0, 4.2 };
		Double[] emp2Data = { 68000.0, 5.0, 3.8 };
		Double[] emp3Data = { 82000.0, 7.0, 4.5 };
		Double[] emp4Data = { 90000.0, 10.0, 2.0 };
		Double[] emp5Data = { 60000.0, 2.0, 3.5 };

		Map<String, Double[]> empData = new HashMap<>();
		empData.put(employees[0], emp1Data);
		empData.put(employees[1], emp2Data);
		empData.put(employees[2], emp3Data);
		empData.put(employees[3], emp4Data);
		empData.put(employees[4], emp5Data);

		Map<String, Double> hikeMap = new HashMap<>();

		for (String emp : employees) {
			Double[] data = empData.get(emp);

			double baseSalary = data[0];
			double experience = data[1];
			double rating = data[2];

			double variablePayPercentage;
			double bonus;
			double reward = 0;

			if (rating >= 4.0) {
				variablePayPercentage = 15;
				bonus = 1500;
			}

			else if (rating >= 3) {
				variablePayPercentage = 10;
				bonus = 1200;
			}

			else {
				variablePayPercentage = 3;
				bonus = 300;
			}

			if (experience > 5) {
				reward = 5000;

			}

			double hike = (baseSalary * variablePayPercentage / 100) + bonus + reward;
			double hikePercentage = (hike / baseSalary) * 100;

			hikeMap.put(emp, hikePercentage);
		}
		System.out.println("Employee Hike details : ");
		System.out.println(hikeMap);

		{

		}

	}

}
