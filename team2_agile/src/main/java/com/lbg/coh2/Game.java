package com.lbg.coh2;

public class Game
{
	boolean isGameRunning = true;
	// UserInput input = new UserInput();
	//Grid grid = new Grid();
	
	private boolean checkOutOfBoundsY(int newPosition)
	{
		if(newPosition < 0 ||  newPosition > grid.getGridSizeY()) 
			return false;
		
		return true;
	}
	
	private boolean checkOutOfBoundsX(int newPosition)
	{
		if(newPosition < 0 ||  newPosition > grid.getGridSizeX()) 
			return false;
		
		return true;
	}
	
	private boolean userHasReachedGoal() 
	{
		if((grid.getX == grid.getGoldX()) && (grid.getY() == grid.getGoldY())) 
			return true;
		
		return false;
	}
	
	private int getDistanceX()
	{
		return abs(grid.getX() - grid.getGoldX());
	}
	
	private int getDistanceY()
	{
		return abs(grid.getY() - grid.getGoldY());
	}
	
	private void moveNorth() 
	{
		int newPosition = grid.getY()+1;
		boolean check = checkOutOfBoundsY(newPosition);
		if (!check)
		{
			outOfBounds();
			continue;
		}
		else {
			grid.setY(newPosition);
		}
	}
	
	private void moveSouth() 
	{
		int newPosition = grid.getY()-1;
		boolean check = checkOutOfBoundsY(newPosition);
		if (!check)
		{
			outOfBounds();
			continue;
		}
		else {
			grid.setX(newPosition);
		}
	}
	
	private void moveEast()
	{
		int newPosition = grid.getX()+1;
		boolean check = checkOutOfBoundsX(newPosition);
		if (!check)
		{
			outOfBounds();
			continue;
		}
		else {
			grid.setX(newPosition);
		}
	}
	
	private void moveWest()
	{
		int newPosition = grid.getX()-1;
		boolean check = checkOutOfBoundsX(newPosition);
		if (!check)
		{
			outOfBounds();
			continue;
		}
		else {
			grid.setX(newPosition);
		}
	}
	
	private void outOfBounds()
	{
		System.out.println("Out of Bounds");
	}
	
	public void startGame()
	{
		while(isGameRunning) 
		{
			//String userDirection = input.prompt();
			switch (userDirection) 
			{
				case "North" :
					moveNorth();
					break;
				case "East" :
					moveEast();
					break;
				case "West" :
					moveWest();
					break;
				case "South" :
					moveSouth();
					break;
			}
			
			if(userHasReachedGoal())
			{
				System.out.println("Treasure Found");
				isGameRunning = false;
			}
			else 
			{	
				int finalDistance = getDistanceX() + getDistanceY();
				System.out.println("You are "+ finalDistance + " squares away from gold");
			}
			
		}
	}
}
