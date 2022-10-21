package com.lbg.coh2;

public class Game
{
	boolean isGameRunning = true;
	UserInput input = new UserInput();
	Grid grid = new Grid();
	
	public Game()
	{
        System.out.println( grid.getCurrent_x() + ", " + grid.getCurrent_y() );
        System.out.println( grid.getTreasure_x() + ", " + grid.getTreasure_y() );
	}
	
	private boolean checkOutOfBoundsY(int newPosition)
	{
		if(newPosition < 0 ||  newPosition >= grid.getGridSize()) 
			return false;
		
		return true;
	}
	
	private boolean checkOutOfBoundsX(int newPosition)
	{
		if(newPosition < 0 ||  newPosition >= grid.getGridSize()) 
			return false;
		
		return true;
	}
	
	private boolean userHasReachedGoal() 
	{
		if((grid.getCurrent_x() == grid.getTreasure_x()) && (grid.getCurrent_y() == grid.getTreasure_y())) 
			return true;
		
		return false;
	}
	
	private int getDistanceX()
	{
		return Math.abs(grid.getCurrent_x() - grid.getTreasure_x());
	}
	
	private int getDistanceY()
	{
		return Math.abs(grid.getCurrent_y() - grid.getTreasure_y());
	}
	
	private void moveNorth() 
	{
		int newPosition = grid.getCurrent_y()-1;
		boolean check = checkOutOfBoundsY(newPosition);
		if (!check)
		{
			outOfBounds();
		}
		else {
			grid.setCurrent_y(newPosition);
		}
	}
	
	private void moveSouth() 
	{
		int newPosition = grid.getCurrent_y()+1;
		boolean check = checkOutOfBoundsY(newPosition);
		if (!check)
		{
			outOfBounds();
		}
		else {
			grid.setCurrent_y(newPosition);
		}
	}
	
	private void moveEast()
	{
		int newPosition = grid.getCurrent_x()+1;
		boolean check = checkOutOfBoundsX(newPosition);
		if (!check)
		{
			outOfBounds();
		}
		else {
			grid.setCurrent_x(newPosition);
		}
	}
	
	private void moveWest()
	{
		int newPosition = grid.getCurrent_x()-1;
		boolean check = checkOutOfBoundsX(newPosition);
		if (!check)
		{
			outOfBounds();
		}
		else {
			grid.setCurrent_x(newPosition);
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
			
			String direction = input.prompt();

			
			if (direction.equals("North"))
			{
				moveNorth();
			}
			else if (direction.equals("South"))
			{
				moveSouth();
			}
			else if (direction.equals("East"))
			{
				moveEast();
			}
			else if (direction.equals("West"))
			{
				moveWest();
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
