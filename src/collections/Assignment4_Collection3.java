package collections;


import java.util.LinkedList;
import java.util.List;

public class Assignment4_Collection3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Create a list of the top 5 highest-grossing movies of all time and print out the third movie on the list.
		
		List<String> highestGrossingMovie=new LinkedList<>();
		highestGrossingMovie.add("Avatar");
		highestGrossingMovie.add("Avengers: Endgame");
		highestGrossingMovie.add("Avatar: The Way of Water");
		highestGrossingMovie.add("Titanic");
		highestGrossingMovie.add("Guardians of the Galaxy: Volume 3");
		//highestGrossingMovie.remove(2);
		
		System.out.println("The third highest-grossing movie on the list is "+highestGrossingMovie.get(2));
		

	}

}
