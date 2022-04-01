package gec;

public class loansystem {

	public static void main(String[] args) {
		/* DESIGN
		 * PROBLEM STATEMENT: A java code that accepts user's savings, loan balance, loan amount and loan type and prints out loan interest
		 * and installment amount
		 * VARIABLES:
		 * double savings (input)
		 * double loanBalance (input)
		 * double loanAmount (input)
		 * integer loanType (input)
		 * double amount (output)
		 * double interest (output)
		 * double installmentAmount (output)
		 * double in
		 *
		 */
		package classStuff;

		import java.util.Scanner;

		public class LoanSystem {

		public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		System.out.println("How much is in your savings balance:");
		double savings = input.nextDouble();
		System.out.println("How much do you owe from previous loan");
		double loanBalance = input.nextDouble();
		System.out.println("What type of loan are you applying for? 5 or 10:");
		int loanType = input.nextInt();
		System.out.println("How much loan do you want to take:");
		double loanAmount = input.nextDouble();

		double amount, interest, installmentAmount;
		int installmentTime;

		if (loanType == 5) {
		if (loanAmount > (savings * 250/100)) {
		System.out.println("You are not applicable for this loan as there is not enough in your savings");
		}
		else {
		installmentTime = 10;
		interest = loanAmount * 5/100;
		amount = interest + loanAmount + loanBalance;
		installmentAmount = amount/installmentTime;
		System.out.println("You will get an interest of 5% which gives an interest of " + interest + "NGN");
		System.out.println("You are to pay NGN" + installmentAmount + " in " + installmentTime + " monthly installments");
		}
		}
		else if (loanType == 10) {
		if (loanAmount > (savings * 150/100)) {
		System.out.println("You are not applicable for this loan type as there is not enough in your savings");
		}
		else {
		installmentTime = 20;
		interest = loanAmount * 10/100 ;
		amount = interest + loanAmount + loanBalance;
		installmentAmount = amount/installmentTime;
		System.out.println("You will get an interest of 10% which gives an interest of " + interest + "NGN");
		System.out.println("You are to pay NGN" + installmentAmount + " in " + installmentTime + " monthly installments");
		}
		}
		else {
		System.out.println("Please choose a valid loan type");
		}

		}

		}

	 

	}

}
