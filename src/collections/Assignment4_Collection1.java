package collections;

import java.util.ArrayList;
import java.util.List;

public class Assignment4_Collection1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//Lists with area of top 5 largest cities. Print the total area of the 3rd and 4th cities combined
		List<Double> cityDetails= new ArrayList<>();
		cityDetails.add(484.0);   // Delhi city
		cityDetails.add(741.0);     //Bengaluru
		cityDetails.add(682.0);      //Visakhapatnam
		cityDetails.add(650.0);      //Hyderabad 
		cityDetails.add(631.0);      //Lucknow
		
		Double combinedArea=cityDetails.get(2)+cityDetails.get(3);
		System.out.println("The total area of the 3rd and 4th cities combined is:" +combinedArea);
		
	}

}
