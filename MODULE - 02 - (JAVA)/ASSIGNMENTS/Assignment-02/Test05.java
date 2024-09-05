import java.util.Scanner;
public class Test05
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Welcome to Area Calculator:\n1-CIRCLE :\n2-SQUARE\n3-RECTANGLE\n4-TRIANGLE");
		
		int ch = sc.nextInt();
		
		switch(ch){
					case 1:
							System.out.println("Enter radius for calculating area of Circle:");
							double r=sc.nextDouble();
							double pi=3.14;
							double area;
							area=pi*(r*r);
							System.out.println("Area of Circle:"+area);
							
							
							break;

					case 2:	System.out.println("Enter Side for calculating area of Square:");
							double s=sc.nextDouble();
							 area=s*s;
							System.out.println("Area of Square:"+area);
					
							break;

					case 3: System.out.println("Enter Length and width for calculating area of Rectangle:");
							double l=sc.nextDouble();
							double w=sc.nextDouble();
							 area=l*w;
							System.out.println("Area of Rectanlge:"+area);
					
							break;

					case 4:
							System.out.println("Enter base and height for calculating area of Trangle:");
							double base=sc.nextDouble();
							double height=sc.nextDouble();
							 area=0.5*height*base;
							System.out.println("Area of Trangle:"+area);
							break;

												
					default:System.out.println("Invalid Entry");
							break;
	
					}
	
	}




}