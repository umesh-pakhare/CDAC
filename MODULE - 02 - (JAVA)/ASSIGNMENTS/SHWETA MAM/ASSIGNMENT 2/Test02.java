import java.util.Scanner;

public class Test02
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter your weight in kg:");
		double weight = sc.nextDouble();
		System.out.println("Enter your height in meter:");
		double height = sc.nextDouble();
		
		double bmi =  weight/(height*height);
		
		System.out.println("BMI : "+ bmi); 
		 if( bmi<18.5)
		 {
			 System.out.println("Underweight");
		 }
		 
		 else if( bmi >=18.5 && bmi<= 24.9)
		 {
			 System.out.println("Normal");			 
		 }
		 else if( bmi >= 20.0 && bmi <= 29.9)
		 {
			 System.out.println("Overweight");
			 
		 }
		 else
		 {
			 System.out.println("Invalid entry");
		 }
	
	}



}