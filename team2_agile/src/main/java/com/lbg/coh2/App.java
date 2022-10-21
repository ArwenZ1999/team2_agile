package com.lbg.coh2;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Grid grid = new Grid();
        System.out.println( grid.getCurrent_x() + ", " + grid.getCurrent_y() );
        System.out.println( grid.getTreasure_x() + ", " + grid.getTreasure_y() );
        
    }
}
