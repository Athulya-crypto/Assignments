package operatorsInJava;

public class Assignment6_Operators {

	public static void main(String[] args) {
		String []stuentName= {"Suresh","Mahesh","Naresh"};
		int [] marks= {75, 80, 82};

		marks[0]= marks[0]+10;
		marks[1]= marks[1]+10;
		marks[2]= marks[2]+10;
		
		System.out.println("Updated Marks : ");
		System.out.println(stuentName[0]+":"+marks[0]);
		System.out.println(stuentName[1]+":"+marks[1]);
		System.out.println(stuentName[2]+":"+marks[2]);
		double averageMarks= (marks[0]+marks[1]+marks[2])/3;
		System.out.println("Average Marks:"+averageMarks);
		
		
		
		
		


	}

}
