package loopsAndIteratorPrograms;

public class Assignment14_Power_Calculation {
	
	double result =1.0;
	double base;
	public double powerValue(double x, int n)
	{

		if (n>0){
			base= x;
			for(int i=0;i<n;i++)
			{
			result*=base;
			}
		}else
		{
			
			base=1.0/base;
			n=-n;
			
			for(int i=0;i<n;i++) 
			{
			result*=base;
		
			}
		}

return result;
	
	}
	public static void main(String[] args) {
		
		Assignment14_Power_Calculation obj = new Assignment14_Power_Calculation();
		// calculating the power value for example 1
		
		System.out.println("The power value of example 1: "+obj.powerValue(2.00000, 10));
		// calculating the power value for example 2
		
				System.out.println("The power value of example 2: "+obj.powerValue(2.10000, 3));
				// calculating the power value for example 3
				
				System.out.println("The power value of example 3: "+obj.powerValue(2.00000,-2));
		
	

	}

}
