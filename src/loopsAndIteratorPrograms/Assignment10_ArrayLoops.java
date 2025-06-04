package loopsAndIteratorPrograms;

public class Assignment10_ArrayLoops {

	public static void main(String[] args) {
		int[] arr = { 12, 34, 11, 36, 87, 98, 93 };
		int i = 0;
		int j;

		int g = arr.length - 1; // array length -1

		// printing the largest number in the array
		for (i = 0; i < g; i++) {
			for (j = 0; j < i; j++) {
				if (arr[j] > arr[j + 1] && arr[i] > arr[i + 1]) {
					System.out.println(arr[i]);

				}

			}
		}
	}
}
