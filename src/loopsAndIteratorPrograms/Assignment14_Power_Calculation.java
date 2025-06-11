package loopsAndIteratorPrograms;

public class Assignment14_Power_Calculation {
	
	
	public double powerValue(double x, int n)
	{
		 double power=Math.pow(x,n);
		return power;
	}
	public static void main(String[] args) {
		
		Assignment14_Power_Calculation obj = new Assignment14_Power_Calculation();
		
		//Example 1
		System.out.println("The power value for example1 : "+obj.powerValue(2.00000,10));
		
		//Example 2
		System.out.println("The power value for example2 : "+obj.powerValue(2.10000,3));
		
		//Example 3
		System.out.println("The power value for example3 : "+obj.powerValue(2.00000,-2));
		
		
		
		

	}

}
