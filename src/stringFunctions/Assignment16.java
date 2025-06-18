package stringFunctions;

public class Assignment16 {

	public static void main(String[] args) {
		String paragraph = "Java is a popular programming language. Java is used for web development, mobile applications, and more.";
		
//		Divide into multiple words 
		
		String [] words= paragraph.split(" ");
		System.out.println("Total number of words in the sentence: "+words.length);

	}

}
