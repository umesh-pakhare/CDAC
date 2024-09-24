import java.util.Scanner;

class LoanAmortizationCalculator
{
	//============PRIVATE FIELDS FOR PRICIPAL, ANUAL INTEREST RATE, AND LOAN TERM
		private double principal;
		private double annualInterestRate;
		private int loanTerm;
		
	//===========SETTER METHODS============================
		public void setPrincipal(double principal)
		{
			this.principal=principal;
		}
		public void setAnnualInterestRate(double annualInterestRate)
		{	
			this.annualInterestRate=annualInterestRate;			
		}
		public void setLoanTerm(int loanTerm)
		{
			this.loanTerm=loanTerm;
		}
	//==============GETTER METHODS==========================
		
		public double getPrincipal()
		{
			return principal;
		}
		public double getAnnualInterestRate()
		{
			return annualInterestRate;
		}
		public int getLongTerm()
		{
			return loanTerm;
		}
	
	//======================ACCEPT RECORD=====================
	
		public void acceptRecord()
		{
			Scanner sc=new Scanner(System.in);
			
			System.out.println("ENTER THE PRINCIPAL AMOUNT	:	");
			setprincipal(sc.nextDouble());
			System.out.println("ENTER THE ANUAL INTEREST RATE	:	");
			setannualInterestRate(sc.nextDouble());
			System.out.println("ENTER THE LOAN TERM (IN YEARS)	:	");
			setLoanTerm(sc.nextInt());
			sc.close();

		}
	
	//======================METHOD TO CALCULATE MONTHLY PAYMENT=====================
		public double calculateMonthlyPayment()
		{
			//CONVERT ANNUAL INTEREST RATE TO MONTLY INTEREST RATE
			double monthlyInterestRate=getannualInterestRate()/12/100;
			
			//CALCULATE THE NUMBER OF MONTHS FOR THE LOAN
			int numberOfMonths=getLoanTerm()*12;
			
			//APPLY THE MORTAGE FORMULA TO CALCULATE MONTHLY PAYMENT
			double monthlyPayment = getprincipal()*(monthlyInterestRate*Math.pow(1+monthlyInterestRate,numberOfMonths))/(Math.pow(1+monthlyInterestRate,numberOfMonths)-1);
			return monthlyPayment;
		
		}
	//======================METHOD TO CALCULATE MONTHLY PAYMENT=====================
		public void printRecord(double monthlyPayment)
		{
			int numberOfMonths=getLoanTerm() * 12;
			double totalPayment=monthlyPayment*numberOfMonths;
			
			System.out.printf("MONTHLY PAYMENT	:	"+monthlyPayment);
			System.out.printf("TOTAL AMOUNT PAID OVER LIFE OF THE LOAN 	:	"+totalPayment);
			
		}
		
	//=============================MAIN METHOD============================
		
		public static void main(String args[])
		{
			//INSTANCE OF LoanAmortizationCalculator
			LoanAmortizationCalculator lac= new LoanAmortizationCalculator();
			
			//ACCEPT USER INPUT
			lac.acceptRecord();
			
			//CALCULATE MONTHLY PAYMENT
			double monthlyPayment=lac.calculateMonthlyPayment();
			
			//DISPLAY MONTHLY PAYMENT AND TOTAL PAYMENT
			lac.printRecord(monthlyPayment);
		
		
		}


}