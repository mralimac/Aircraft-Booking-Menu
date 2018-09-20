package aircraftMenu;

public class CancelSeat extends Main
{
	public static void displayCancelMenu()
	{
		int seatNumber;
		
		System.out.println("Select a seat number to cancel");	
		//Checks if the seat is occupied. and then allows the user to confirm cancellation or not
		seatNumber = Main.askForInt();	
		while(checkIfSeatEmpty(seatNumber))
		{
			seatNumber = Main.askForInt();
		}
		System.out.println("Do you want to cancel this booking? y/n");
		if(confirmation())
		{
			Main.seats[seatNumber][0] = 0;
			Main.seats[seatNumber][1] = 0;
			Main.passengerNames[seatNumber] = "";
			System.out.println("Booking has been cancelled");
		}
		else
		{
			System.out.println("Booking has been retained");
		}
		Main.returnToMainMenu();
	}
	
	public static boolean confirmation()
	{
		String confirmation = Main.askForString();
		System.out.println(confirmation);
		if(confirmation.equals("y") || confirmation.equals("yes"))
		{
			return true;
		}
		else
		{	
			return false;
		}
	}
}
