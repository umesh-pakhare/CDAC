// 4. Discount Calculation for Retail Sales

import java.util.Scanner;

	public class DiscountCalculator
	{
		double originalPrice,discountRate;
		
		public void acceptRecord()
		{
			Scanner sc=new Scanner(System.in);
			System.out.print("ENTER THE ORIGINAL PRICE OF THE ITEM:");
			originalPrice=sc.nextDouble();
			System.out.print("ENTER THE DISCOUNT PERCENTAGE:");
			discountRate=sc.nextDouble();
		
		}
		
		public double calculateDiscount()
		{
			return originalPrice*(discountRate/100);
		}
		
		public void printRecord()
		{
			double discountAmount=calculateDiscount();
			double finalPrice=originalPrice-discountAmount;
			System.out.printf("DISCOUNT AMOUNT:"+discountAmount);
			System.out.println("FINAL PRICE :"+finalPrice);
		
		}
		
		public static void main(String args[])
		{
			DiscountCalculator dis=new DiscountCalculator();
			dis.acceptRecord();
			dis.printRecord();
		
		}
		
	
	}