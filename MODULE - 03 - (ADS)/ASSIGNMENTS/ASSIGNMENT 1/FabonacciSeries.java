//4. Fibonacci Series
//Problem: Write a Java program to print the first n numbers in the Fibonacci series.


import java.util.Scanner;

class FabonacciSeries
{
	public static void main(String args[])
	{
	
		int number,first=0,second=1,next,i;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Enter number	:	");
		
		number=sc.nextInt();
		
		for(i=1;i<=number;i++)
		{
			System.out.println(first+"");
			next=first+second;
			first=second;
			second=next;
		
		}
	
	
	
	}

}