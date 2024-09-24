import java.util.Scanner;
public class DiscountCalculatr
{
	//PRIVATE FIELDS FOR ORIGINAL PRICE AND DISCOUNT RATE
	
	private double originalPrice;
	private double discountRate;
	
	//GETTER AND SETTER
	
	public void setOriginalPrice(double originalPrice)
	{
		this.originalPrice=originalPrice;
	}
	public void setDiscountRate(double discountRate)
	{
		this.discountRate=discountRate;
	}
	
	public double getOriginalPrice()
	{
		return originalPrice;
	}
	public double getDiscountRate()
	{
		return discountRate;
	}

	//===============METHOD TO ACCEPT===============
	public void acceptRecord()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ENTER THE ORIGINAL PRICE OF THE ITEM	:	");
		setOriginalPrice(sc.nextDouble());
		System.out.print("ENTER THE DISCOUNT RATE %	:	");
		setDiscountRate(sc.nextDouble());
		
		sc.close();	
	}
	//===============METHOD TO CALCULATE THE DISCOUNT AMOUNT=============
	public double calculateDiscountAmount()
	{
		return getOriginalPrice()*(getDiscountRate()/100);	
	}
	
	//===============METHOD TO CALCULATE THE FINAL PRICE=================
	  
	  public double calculateFinalPrice()
	  {
	   double discountAmount=calculateDiscountAmount();
	   return getOriginalPrice()-discountAmount;	  
	  }
	  
	  //=============METHOD TO PRINT THE RESULT==========================
	   public void printRecord()
	{
	   double discountAmount=calculateDiscountAmount();
	   double finalPrice=calculateFinalPrice();
		
		System.out.printf("DISCOUNT AMOUNT	:	"+discountAmount);
		System.out.printf("FINAL PRICE 		:	"+finalPrice);
		
	}	
	//============================MAIN METHOD===========================
	public static void main(String args[])
	{
		DiscountCalculatr cal=new DiscountCalculatr();
		cal.acceptRecord();
		cal.printRecord();
	
	}
	
			
		
}


	