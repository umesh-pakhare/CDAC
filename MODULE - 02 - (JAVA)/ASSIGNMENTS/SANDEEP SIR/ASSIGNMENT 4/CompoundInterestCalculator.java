import java.util.Scanner;

public class CompoundInterestCalculator
{
	private double principal;
	private double annualInterestRate;
	private int numberOfCompounds;
	private int years;
	
	
	public void setPrincipal(double principal)
	{this.principal=principal;}
	public void setAnnualInterestRate(double annualInterestRate)
	{this.annualInterestRate=annualInterestRate;}
	public void setNumberOfCompounds(int numberOfCompounds)
	{this.numberOfCompounds=numberOfCompounds;}
	public void setYears(int years)
	{this.years=years;}
	
	public double getPrincipal()
	{return principal;}
	public double getAnnualInterestRate()
	{return annualInterestRate;}
	public double getNumberOfCompounds()
	{return numberOfCompounds;}
	public int getYears()
	{return years;}
	
	public void acceptRecord()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("ENTER THE INITAL INVESTMENT AMOUNT	:	");
		setPrincipal(sc.nextDouble());
		System.out.print("ENTER THE ANNUAL INTEREST RATE	:	");
		setAnnualInterestRate(sc.nextDouble());
		System.out.print("ENTER AMOUNT COMPUNDED	:	");
		setNumberOfCompounds(sc.nextInt());
		System.out.print("ENTER THE INVESTMENT DURATION (IN YEARS)	");
		setYears(sc.nextInt());
		sc.close();
	}
		public double calculateFutureValue()
		{
			double rateAsDecimal = getAnnualInterestRate()/100;
			double futureValue=getPrincipal()*Math.pow((1+rateAsDecimal/getNumberOfCompounds()),getNumberOfCompounds()*getYears());
			return futureValue;
		}
		
		public void printRecord(double futureValue)
		{
			double totalInterest=futureValue-getPrincipal();
			
			System.out.printf("FUTURE VALUE	:	"+futureValue);
			System.out.printf("TOTAL INTEREST EARNED	:	"+totalInterest);
		
		}

	public static void main(String arg[])
	{
			CompoundInterestCalculator	cmp=new CompoundInterestCalculator();
			cmp.acceptRecord();
			double futureValue=cmp.calculateFutureValue();
			cmp.printRecord(futureValue);
			
	
	
	}
	
	
	
	
	
}