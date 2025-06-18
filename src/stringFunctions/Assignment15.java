package stringFunctions;

public class Assignment15 {

	
	
	public static void main(String[] args) {
		String sentence = "Java programming is fun and challenging"; 
		String revereseSentece="";
		
		
		// Count the total number of words in the sentence. 
		String[] word= sentence.split(" ");
		System.out.println("Total number of words in the sentence: "+word.length);
		
		//Print the sentence words in reverse order.
		for(int i=sentence.length()-1;i>=0;i--)
		{
			revereseSentece=revereseSentece+sentence.charAt(i);
		}
		System.out.println(revereseSentece);

		//Convert the first character of each word to uppercase and print original sentence 
		
		for(String words:word)
		{
			System.out.print(Character.toUpperCase(words.charAt(0))+words.substring(1)+" ");
		}
	}

}
