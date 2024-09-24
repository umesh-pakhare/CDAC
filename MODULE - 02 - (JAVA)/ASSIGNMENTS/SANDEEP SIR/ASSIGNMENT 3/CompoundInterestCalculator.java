//2-COMPOUND

import java.util.Scanner;

public class CompoundInterestCalculator
{
	double principal,annualInterestRate,numberOfCompounds,years;
	
	public void acceptRecord()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER INITAL INVESTMENT AMOUNT:");
		principal=sc.nextDouble();
		System.out.println("ENTER ANNUAL INTEREST RATE (IN %):");
		annualInterestRate=sc.nextDouble();
		System.out.println("ENTER NUMBER OF TIMES INTEREST IS COMPOUNDED PER YEAR:");
		numberOfCompounds=sc.nextDouble();
		System.out.println("ENTER INVESTMENT DURATION (IN YEARS):");
		years=sc.nextDouble();
		
	}
	
	public double calculateFutureValue()
	{
		return principal*Math.pow(1+(annualInterestRate/numberOfCompounds/100),numberOfCompounds*years);
		
		
	}
	
	public void printRecord()
	{
		double futureValue=calculateFutureValue();
		double totalInterest=futureValue-principal;
		System.out.printf("FUTURE VALUE:"+futureValue);
		System.out.printf("TOTAL INTEREST EARNED:"+totalInterest);
		
		
	}
	public static void main(String args[])
	{
		CompoundInterestCalculator cal=new CompoundInterestCalculator();
		cal.acceptRecord();
		cal.printRecord();
	
	}


}