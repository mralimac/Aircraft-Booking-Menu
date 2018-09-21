package aircraftMenu;

import java.awt.Color;
import java.awt.GraphicsConfiguration;


import javax.swing.JFrame;

public class GraphicInterface 
{
	static JFrame frame;
	static GraphicsConfiguration gc;
	
	public void createFrameWindow()
	{
		frame = new JFrame(gc);
		frame.setTitle("Aircraft Booking System");
		frame.setSize(400,800);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.getContentPane().setBackground(Color.gray);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void mainMenuGraphicInterface()
	{
		String[] buttons = new String[5];
		buttons[0] = "bookingButton";
		buttons[1] = "displaySeatButton";
		buttons[2] = "cancelButton";
		buttons[3] = "displayReportButton";
		buttons[4] = "exitButton";
		
		for(int i = 0; i < 5; i++)
		{
			
			
			//createButton();
		}
	}
	
	
	public void createButton()
	{
		
	}
	
	
	public void createTextbox()
	{
		
	}
	
	
	public void createLabel()
	{
		
	}
	
}
