package operatorsInJava;

public class Assignment7_Conditional_Statements {

	public static void main(String[] args) {
	 String customerName = "John Doe";
	 int creditScore = 720; 
	 double income = 50000.0; 
	 boolean isEmployed = true; 
	 double debtToIncomeRatio = 35.0;
	 
	 
	 
	 if(creditScore>750)
	 {
		 System.out.println("John Doe, your credit score is above 750, loan is approved");
	 }
	 
	 else if (creditScore>=650 && creditScore<=750)
	 {
		 if(income>=50000)
		 {
			 if(isEmployed==true)
			 {
				 if(debtToIncomeRatio<40)
				 {
					 System.out.println("John Doe, your loan is Approved");
				 }
				 else
				 {
					 System.out.println("John Doe, your DTI ratio is 40% or greater the loan is denied.");
				 }
			 }
				 else
				 {
					 System.out.println("John Doe, your loan is rejected, you are unemployeed");
				 }
			 
			
		 }
		 else
		 {
			 System.out.println("John Doe, your loan is rejected, customer’s income must be at least $50,000 ");
		 }
	 }
	 
	 else {
		 System.out.println("John Doe, your credit score is below 650, loan is denied");
	 }
	 }

	}


