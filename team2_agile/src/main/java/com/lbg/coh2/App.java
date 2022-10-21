package com.lbg.coh2;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello! We have hidden some treaure in a 10x10 grid! Go be a pirate and find it!" );

        Game game = new Game();
        game.startGame();
    }
}
