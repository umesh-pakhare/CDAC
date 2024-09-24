import java.util.Scanner;

class TollBoothRevnueManager
{
//================FIELDS - STORING TOLLL RATES=============== 
		
		private double carTollRate;
		private double truckTollRate;
		private double motorcycleTollRate;
		
//=================FIELDS - VEHICLE COUNTS====================
	
		private int carCount;
		private int truckCount;
		private int motorcycleCount;
		
//=================SETTER METHODS FOR RATES====================
		public void setCarTollRate(double carTollRate)
		{
			this.carTollRate=carTollRate;
		}
		public void settruckTollRate(double truckTollRate)
		{
			this.truckTollRate=truckTollRate;
		}
		public void setmotorcycleTollRate(double motorcycleTollRate)
		{
			this.motorcycleTollRate=motorcycleTollRate;
		}
//=================GETTER METHODS FOR RATES====================	
		public double getcarTollRate()
		{
			return carTollRate;
		}
		public double gettruckTollRate()
		{
			return truckTollRate;
		}
		public double getmotorcycleTollRate()
		{
			return motorcycleTollRate;
		}
//============================================================

		public void setcarCount(int carCount)
		{
			this.carCount=carCount;
		}
		public void settruckCount(int truckCount)
		{
			this.truckCount=truckCount;
		}
		public void setmotorcycleCount(int motorcycleCount)
		{
			this.motorcycleCount=motorcycleCount;
		}
//============================================================
		public int getcarCount()
		{
			return carCount;
		}
		public int gettruckCount()
		{
			return truckCount;
		}
		public int getmotorcycleCount()
		{
			return motorcycleCount;
		}
//=============================================================
		//Method to accept record(vechicle count and rates)
	
		public void acceptRecord()
		{
			Scanner sc = new Scanner (System.in);
			//first accept prices of diffrent vehicles
			
			System.out.print("ENTER THE RATE FOR CAR	:	");
			setCarTollRate(sc.nextDouble());
			
			System.out.print("ENTER THE RATE FOR MOTORCYCLE	:	");
			setmotorcycleTollRate(sc.nextDouble());
			
			System.out.print("ENTER THE RATE FOR TRUCK	:	");
			settruckTollRate(sc.nextDouble());
			
			System.out.print("ENTER THE NUMBER OF CARS PASSED	:	");
			setcarCount(sc.nextInt());
			
			System.out.print("ENTER THE NUMBER OF THE MOTORCYCLES PASSED	:	");
			setmotorcycleCount(sc.nextInt());
			
			System.out.print("ENTER THE NUMBER OF THE TRUCKS PASSED	:	");
			settruckCount(sc.nextInt());
			sc.close();
			
			//=============================================================
		}
		
		//=========METHODS TO CALCULATE THE TOTAL REVENUE============= 
		
			public double caculateTotalRevenue()
			{
				double carRevenue=getcarTollRate()*getcarCount();
				double motorcycleRevenue=getmotorcycleTollRate()*getmotorcycleCount();
				double truckRevenue=gettruckTollRate()*gettruckCount(); 
				
				return carRevenue+motorcycleRevenue+truckRevenue;		
			}	
			
		//========METHODS TO CALCULATE TOTAL NUMBER OF VEHICLES========
			public int calculateTotalVehicles()
			{
				return getcarCount()+getmotorcycleCount()+gettruckCount();
				
			}
			
			//===METHODS TO PRINT TOTAL NUMBER OF VEHICLES AND REVENUE ===
			
			public void printRecord()
			{
				int totalVehicles=calculateTotalVehicles();
				double totalRevenue=caculateTotalRevenue();
				
				System.out.println("TOTAL VEHICLES PASSES	:	"+totalVehicles);
				System.out.println("TOTAL REVENUECOLLECTED	:	"+totalRevenue);
			}
			
			//=====================MAIN METHOD============================
			
				public static void main(String args[])
				{
					TollBoothRevnueManager	tbr=new TollBoothRevnueManager();
					
					//ACCEPT USER INPUT-TOLL RATES/VEHICLE COUNTS
					
					tbr.acceptRecord();
					
					//DISPLAY THE TOTAL NUMBER OF VEHICLES AND TOTAL REVENUE
					
					tbr.printRecord();
				}
				
}
		
	
	
	
	
	
		




