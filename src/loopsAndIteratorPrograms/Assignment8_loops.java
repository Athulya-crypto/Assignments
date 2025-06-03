package loopsAndIteratorPrograms;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Assignment8_loops {
	int value;

	public static void main(String[] args) {

		int creditCount = 0; // count of credit transactions
		int debitCount = 0;  // count of debit transactions
		int totalCredit=0;   // count of total credit transactions
		int totalDedit=0;    // count of total debit transactions
		int  suspiciousTransactions=0;  // count of total suspicious Transactions 
		
		// array to store all debit credit transactions

		int[] transactions = { 50000, -2000, 3000, -15000, -200, -300, 4000, -3000 };
// to get the count of debit /credit transactions
		for (int value : transactions) {
			if (value > 0) {
				
				creditCount++;
				totalCredit+=value;
				;
			} else {
				debitCount++;
				totalDedit+=value;
				

			}
			
			//to get the count of suspiciousTransactions 
			if(Math.abs(value)>10000)
			{
				System.out.println("Suspicious credit/ debit Transaction with Amount");
				suspiciousTransactions+=1;
			}
			
		}
		int totalAmountInBank=totalCredit+totalDedit;
		System.out.println("Total number of credit transactions completed" + creditCount);
		System.out.println("Total number of debit transactions completed" + debitCount);
		System.out.println("Total credited amount: " + totalCredit);
		System.out.println("Total debited amount: " + totalDedit);
		System.out.println("Total amount remaining at bank: " +totalAmountInBank );
		System.out.println("Total number of suspicious transactions: " +suspiciousTransactions );
		
		
	}
}