package stringFunctions;

public class Assignment17 {

	public static void main(String[] args) {
		int row=5;
		 for(int i=5;i>=1;i--)
		 {
			 for(int j=1;j<i;j++)
			 {
				 System.out.print(" ");
			 }
			 for(int j=0;j<=row-i;j++)
			 {
				 System.out.print("*");
			 }
			 System.out.println();
		 }
	

	}

}
