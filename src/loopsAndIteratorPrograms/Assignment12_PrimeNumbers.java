package loopsAndIteratorPrograms;

public class Assignment12_PrimeNumbers {

	public static void main(String[] args) {
		int n=29;
		boolean flag = false ;
		for (int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				flag=true;
				break;		
		
		}
			else
			{
				flag=false;
			}
	
			
		}
	if(flag==true)
	{
		System.out.println("It is a prime number");
	}
	else
	{
		System.out.println("It is not a prime number");
	}
		

	}

}
