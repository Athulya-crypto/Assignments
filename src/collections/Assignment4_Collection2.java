package collections;

import java.util.ArrayList;
import java.util.List;

public class Assignment4_Collection2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<String> cityDetails= new ArrayList<>();
		cityDetails.add("Eiffel Tower");   // Delhi city
		cityDetails.add("Great Wall of China");  
		cityDetails.add("Louvre Museum"); 
		cityDetails.add("Colosseum"); 
		cityDetails.add("Acropolis of Athens"); 
		cityDetails.add("Grand Canyon"); 
		cityDetails.add("Sagrada Familia"); 
		cityDetails.add("Taj Mahal"); 
		cityDetails.add("The Great Pyramid of Giza"); 
		cityDetails.add("Bangkok"); 
				
		
		System.out.println("The tourist attractions in the world: "+cityDetails);
		System.out.println("Size :" +cityDetails.size());
		

	}

}
