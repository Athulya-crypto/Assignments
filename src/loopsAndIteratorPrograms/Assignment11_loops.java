package loopsAndIteratorPrograms;

public class Assignment11_loops {

	public static void main(String[] args) {
	int n=5;
		// outer loop to handle upper part
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			
			
		System.out.println();
		}
		
		// outer loop to handle upper part	
		for(int i=4;i>=1;i--)
		
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			
			
		System.out.println();
		}

	}

}
