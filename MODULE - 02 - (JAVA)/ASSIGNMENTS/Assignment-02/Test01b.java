import java.util.Scanner;

public class Test01b
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Welcome to Main method\n");
		System.out.println("Enter your choice :\n 1-To Leap year check \n 2-exit\n");
		int ch=sc.nextInt();
		
		switch(ch)
		{
			case 1:
					System.out.println("\nWelcome to Switch case :\nEnter your year :\n");
					int year = sc.nextInt();
					
					if((year % 4==0 && year %100 !=0)|| year % 400 == 0)
						{
							System.out.println(year +" : Leap Year\n");
						}
					else
						{
							System.out.println(year +" : Not Leap Year\n");
						}
					System.out.println("Switch Scope is over ");
			
					break;
			case 2:
					break;
		
		
		}
	
	}




}