package com.lbg.coh2;

import java.util.Scanner;
import java.io.IOException;

public class UserInput 
{
	
	public String prompt()
	{
		try
		{
			Scanner scan = new Scanner(System.in);
			System.out.println("Please enter North, East, South, or West");
	
			
			String direction = scan.nextLine();
			if (direction.equals("North") || direction.equals("West")  || direction.equals("South")
					|| direction.equals("East"))
			{
				return direction;
			}
			else
				prompt();
		}
		catch (Exception e) {
			System.out.println(e);
		}
		
		return "";
	}
}
