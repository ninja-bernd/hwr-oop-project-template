package hwr.oop;

import java.io.IOException;
import java.util.stream.IntStream;

public class Main{
    public static void main(String[] args) throws IOException {

        //Object get_coordinates;
        //get_coordinates();

        /*
        String list list = new list[];
        list[].initGamefield;
        */
        Gamefield gamefield = new Gamefield();
        System.out.println(gamefield);
        Player player1 = new Player("Test", 2, 1, 9);
        Player player2 = new Player("Test2", 0, 0, 9);

        Game game = new Game(gamefield, player1, player2 );
        game.initGame();


    }
}
