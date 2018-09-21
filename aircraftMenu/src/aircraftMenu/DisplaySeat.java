package aircraftMenu;

public class DisplaySeat extends Main
{
	public static void displaySeatMenu()	
	{		
		//Generates a list of all the seats in the aircraft, plus who has booked them. and for how much
		System.out.println("Displaying all seats");
		
		for(int i = 0; i < Main.seats.length; i++)
		{
			if(Main.seats[i][1] == 0)
			{
				System.out.println("Seat " + i + " is empty");
			}
			else
			{
				System.out.println("Seat "+ i +" is booked by "+ Main.passengerNames[i] + " for £" + Main.seats[i][1]);
				
			}
		}
		Main.returnToMainMenu();
	}
}
