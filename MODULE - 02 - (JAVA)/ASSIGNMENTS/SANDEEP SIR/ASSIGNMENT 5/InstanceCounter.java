//Assignment : 5_1

//1.Design and implement a class named InstanceCounter to track and count the number of instances created from this class.

class InstanceCounter
{
	private static int count=0;	//Static variable to keep count	
	
	public InstanceCounter()
	{
		count++;
	}
	public static int getCount()
	{
		return count;	
	}
}
	class main1
	{
		public static void main(String args[])
		{
			new InstanceCounter();	//First Instance
			new InstanceCounter();	//Second Instance
			new InstanceCounter();  //Third Instance
		
			System.out.println("Total instances created : "+InstanceCounter.getCount());
		}
		
	}

