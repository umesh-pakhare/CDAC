// 1. Armstrong Number
//Problem: Write a Java program to check if a given number is an Armstrong number.

import java.util.Scanner;


class Armstrong
{

	public static void main(String args[])
	{	
		
		int  number,reminder,cube,temp,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number	:	");
		
		number = sc.nextInt();
		
		temp=number;
		while(number>0)
		{
			reminder=number%10;
			cube=reminder*reminder*reminder;
			sum=sum+cube;
			
			number=number/10;
		
		}
		
		number=temp;
		
		if(number==sum)
		{
			System.out.println(number+"		:	Is Armstrong Number");
		
		}
		
		else
		{
			System.out.println(number+"		:	Not Armstrong Number");
			
		}
	
	
	
	
	
	}


}
