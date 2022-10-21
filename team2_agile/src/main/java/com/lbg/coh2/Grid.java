package com.lbg.coh2;

import java.util.Random;

public class Grid
{
	private int treasure_x;
	private int treasure_y;
	private int gridSize = 10;
	private int current_x;
	private int current_y;
	
	public Grid()
	{
		setStartPos();
		setTreasurePos();
	}
	
	public int getTreasure_x() {
		return treasure_x;
	}

	public void setTreasure_x(int treasure_x) {
		this.treasure_x = treasure_x;
	}

	public int getTreasure_y() {
		return treasure_y;
	}

	public void setTreasure_y(int treasure_y) {
		this.treasure_y = treasure_y;
	}

	public int getGridSize() {
		return gridSize;
	}

	public void setGridSize(int gridSize) {
		this.gridSize = gridSize;
	}

	public int getCurrent_x() {
		return current_x;
	}

	public void setCurrent_x(int current_x) {
		this.current_x = current_x;
	}

	public int getCurrent_y() {
		return current_y;
	}

	public void setCurrent_y(int current_y) {
		this.current_y = current_y;
	}
	
	public void setStartPos()
	{
		Random rand = new Random();
		int i = rand.nextInt(1);
		if ( i == 1)
		{
			int x = rand.nextInt(gridSize);
			setCurrent_x(x);
			setCurrent_y(0);
		}
		if ( i == 0)
		{
			int y = rand.nextInt(gridSize);
			setCurrent_x(0);
			setCurrent_y(y);
		}	
	}
	
	public void setTreasurePos()
	{
		Random rand = new Random();
		int x = rand.nextInt(gridSize);
		int y = rand.nextInt(gridSize);
		setTreasure_x(x);
		setTreasure_y(y);	
	}
	
}