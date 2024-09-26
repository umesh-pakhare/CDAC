//3. Factorial
//Problem: Write a Java program to compute the factorial of a given number.


import java.util.Scanner;

class FactorialNumber
{
	public static void main(String args[])
	{
		int number,fact=1,i;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number	:	");
				
		number=sc.nextInt();
	
	for(i=1;i<=number;i++)
	{
		fact=fact*i;
	
	}
		
	System.out.println("Factorial of "+"("+number+")	:	"+fact);	
	
	}



}
