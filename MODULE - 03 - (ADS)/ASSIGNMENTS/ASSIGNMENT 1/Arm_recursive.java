import java.util.Scanner;


class Arm_recursive
{
	static int sumofnum(int num,int digits)	
	{
		if(num==0) return 0;
		int digit=num%10;
		return (digit*digit*digit)+sumofnum(num/10,digits);
		
	}
	public static boolean isArmstrongNum(int num)
	{
		
		int sum = sumofnum(num,3);
		return sum==num;
		
	}
	
	
	
	
	
	
	
	
	
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		//System.out.println("Enter number:");
		//int num = sc.nextInt();
		int num=153;
		if(isArmstrongNum(num))
		{
			System.out.println("Armstrong");
			
		}
		else
		{
			
			System.out.println("Not Armstrong");
		}

		
	
	}
		

}