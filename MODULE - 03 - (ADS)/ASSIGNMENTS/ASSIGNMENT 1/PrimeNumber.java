

//2. Prime Number
//Problem: Write a Java program to check if a given number is prime.

import java.util.Scanner;

class PrimeNumber
{
	public static void main(String args[])
	{
		
		int number,i,count=0;
		
		System.out.print("Enter number	:	");
		Scanner sc = new Scanner (System.in);
		number = sc.nextInt();
		
		for(i=1;i<=number;i++)
		{
			if(number%i==0)
			{
				count++;
			}
		
		}
			if(count==2)
			{
				System.out.println(number+"	:	Is Prime Number");
			}
			
			else
			{
				System.out.println(number+"	:	Is Not Prime Number");
			}
	
	
	
	
	}


}