//3-BMI

import java.util.Scanner;
public class BmiTracker
{
		double weight,height;
		
		public void acceptRecort()
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("ENTER WEIGHT(IN KG)	:	");	
			weight=sc.nextDouble();
			System.out.println("ENTER HEIGHT ( IN CM)	:	");
			height=sc.nextDouble();
		
		}
		
		public double calculateBMI()
		{
			return weight/(height*weight);
		
		}
		
		public String classifyBmi()
		{
			double bmi=calculateBMI();
			if(bmi<18.5) return "UNDERWEIGHT";
			else if(bmi<24.9) return "NORMAL WEIGHT";
			else if(bmi<29.9) return "OVERWEIGHT";
			else return "OBESE";
		
		}
		
		
		public void printRecord()
		{
			double bmi=calculateBMI();
			String classification = classifyBmi();
			System.out.println("bmi	:	"+bmi);
			System.out.println("CLASSIFICATION	:	"+classification);
		
		}
		
		public static void main(String args[])
		{
			BmiTracker b1=new BmiTracker();
			b1.acceptRecort();
			b1.printRecord();
		
		}





}