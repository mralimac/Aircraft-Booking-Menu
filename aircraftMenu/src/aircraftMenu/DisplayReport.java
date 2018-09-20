package aircraftMenu;

public class DisplayReport extends Main
{
	static int totalPrice = 0;
	
	public static void displayReportMenu()
	{
		//Calculates the total price and displays the separate seat prices 
		System.out.println("Displaying total takings");
		for(int i = 0; i < Main.seats.length; i++)
		{
			outputPrice(Main.seats[i][1]);					
		}
		System.out.println("Total Price: £" + totalPrice);
		Main.returnToMainMenu();
	}
	
	public static void outputPrice(int price)
	{
		System.out.println("Seat booked for: £" + price);
		totalPrice = totalPrice + price;
	}
}
