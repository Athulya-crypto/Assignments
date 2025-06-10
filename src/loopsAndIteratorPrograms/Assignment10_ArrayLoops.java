package loopsAndIteratorPrograms;

public class Assignment10_ArrayLoops {

	public static void main(String[] args) {
		
		int[] arr = { 12, 34, 11, 36, 87, 98, 93 };
		int i = 0;
		int j=0;
		int temp=0;

		 // array length -1

		// printing the largest number in the array
		for (i = 0; i <arr.length; i++) {
			for (j = i+1; j <arr.length; j++) {
				if(arr[i]<arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;

				}

			}
			
		
		}
		System.out.println("Largest number is: "+ arr[0]);
		System.out.println("Second largest number is: "+ arr[1]);
		System.out.println("Third largest number is: "+ arr[2]);
	}
}
