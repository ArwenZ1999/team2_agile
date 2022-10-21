package com.lbg.coh2;

import java.util.Random;

public class Grid
{
	private int start_y = 0;
	private int treasure_x;
	private int treasure_y;
	private int gridSize;
	private int current_x;
	private int current_y;
	
	private int start_x = 0;
	public int getStart_x() {
		return start_x;
	}

	public void setStart_x(int start_x) {
		this.start_x = start_x;
	}

	public int getStart_y() {
		return start_y;
	}

	public void setStart_y(int start_y) {
		this.start_y = start_y;
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
	
	public int startPosition()
	{
		Random rand = new Random();
		int i = rand.nextInt(1);
		if (i == 0)
			startposition_x();
		if (i == 1)
			startposition_y();
	}
	
	public int startposition_x()
	{
		Random rand = new Random();
		start_x = rand.nextInt(gridSize);
		return start_x;
	}
	public int startposition_y()
	{
		Random rand = new Random();
		start_y = rand.nextInt(gridSize);
		return start_y;
	}
}
