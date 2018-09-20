package aircraftMenu;

public class BookTicket extends Main
{
	
	public static void displayBookingMenu()	
	{
		int seatNumber;
		int seatCategory;		
		

		//Asks the user to pick a seat, also checks if the selected seat is occupied
		System.out.println("Select a seat number");		
		seatNumber = Main.askForInt();	
		while(!checkIfSeatEmpty(seatNumber))
		{	
			System.out.println("This seat is occupied. Please select another");
			seatNumber = Main.askForInt();
		}
		
		
		//the user picks the category which decides what kind of discount they get
		System.out.println("Enter category\n1 - Business\n2 - Local\n3 - Leisure");
		seatCategory = Main.askForInt();		
		while(!isCategoryGood(seatCategory))
		{
			seatCategory = Main.askForInt();
		}
		
		
		//Ask user if they wish to confirm the price
		if(confirmPrice(calculatePrice(seatCategory)))
		{
			//Set customers name
			Main.passengerNames[seatNumber] = setCustomerName();
			
			//Set seat as occupied
			Main.seats[seatNumber][0] = 1;
			
			//Set seats category
			Main.seats[seatNumber][1] = calculatePrice(seatCategory); 
			System.out.println("Booking has been made");
		}
		else
		{
			System.out.println("Booking has been cancelled");
		}
		
		//Returns the user to the main menu
		Main.returnToMainMenu();
	}
	
	//gets the customers name to store in the passengerName array
	public static String setCustomerName()
	{		
		System.out.println("Please enter your name");
		return Main.askForString();
	}
	
	
	//confirms if the user wants to purchase a ticket
	public static boolean confirmPrice(int price)
	{
		System.out.println("The price of the seat is " + price + "\nDo you wish to purchase? y/n");
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
	
	//Calculates the price of the seat that was picked
	public static int calculatePrice(int seatCategory)
	{
		int price = 100;
		if(seatCategory == 1)
		{
			price = (int) (price * 1.20);
		}
		if(seatCategory == 3)
		{
			price = (int) (price * 1.10);
		}
		
		return price;
	}
	

	//Checks if the category selection was valid
	public static boolean isCategoryGood(int seatCategory)
	{
		if(seatCategory > 3 || seatCategory < 1)
		{
			System.out.println("Not a valid category");
			return false;
		}
		else
		{			
			return true;
		}
	}
}

