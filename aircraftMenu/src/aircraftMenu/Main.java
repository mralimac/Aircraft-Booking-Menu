package aircraftMenu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.util.ArrayList;
//import java.util.List;
import java.util.Scanner;

import javax.swing.SwingUtilities;

public class Main implements ActionListener
{
	
	//List<String> seats = new ArrayList<String>();
	static int[][] seats = new int [14] [2];
	static String[] passengerNames = new String[14];
	static Scanner inputScanner = new Scanner(System.in);	
	
	public static void main(String args[])	
	{
		
		//GUI Experiment - Do Later
//		SwingUtilities.invokeLater(new Runnable() {
//            @Override
//            public void run() {
//                new GraphicInterface().createFrameWindow();
//            }
//        });
		mainMenu();
	}
	
	public static void mainMenu()
	{		
		System.out.println("Please select an option");
		System.out.println("1 - Book Tickets");
		System.out.println("2 - Display Seats");
		System.out.println("3 - Cancel Seat");
		System.out.println("4 - Display Report");
		System.out.println("5 - Exit");
		int menuOption = askForInt();
		switch (menuOption)
		{
			case 1: BookTicket.displayBookingMenu();
			break;
			
			case 2: DisplaySeat.displaySeatMenu();
			break;
			
			case 3: CancelSeat.displayCancelMenu();
			break;
			
			case 4: DisplayReport.displayReportMenu();
			break;
			
			case 5: ExitProgram.exit();
			break;
		}
		
	}	

	public static boolean checkIfSeatEmpty(int seatNumber)
	{
		if(Main.seats[seatNumber][1] == 0)
		{			
			return true;
		}
		else
		{
			return false;
		}
		
	}

	public static int askForInt()
	{
		while(true)
		{
			try
			{
				return Integer.parseInt(inputScanner.next());
			}
			catch(NumberFormatException e)
			{
				System.out.println("This is an incorrect format.\nPlease try again");
			}
		}
	}
	
	public static String askForString()
	{
		while (true)
		{
			return inputScanner.next();			
		}
	}
	
	public static void returnToMainMenu()
	{
		System.out.println("Type anything to return to main menu");
		Main.askForString();
		Main.mainMenu();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		//This is button handler. Work on this
		
	}

}
