package hwr.oop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Game {
    //gamefield, player,
    Gamefield gamefield;
    Player player1;
    Player player2;

    boolean nameSet;
    boolean active;

    Player playerNow;



    //game: runden; 2 spieler(player); gamefield;

    public Game( Gamefield gamefield, Player player1, Player player2){
        this.gamefield = gamefield;
        this.player1 = player1;
        this.player2 = player2;
    }

    public void initGame()throws IOException {
        System.out.println("Willkommen beim Mühle Spiel");
        System.out.println("Wie heißt Spieler1?");
        BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
        player1.playerName = reader1.readLine();
        System.out.println("Spieler1-Name:" + player1.playerName);
        System.out.println("Wie heißt Spieler2?");
        BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));
        player2.playerName = reader2.readLine();

        System.out.println("Spieler1-Name:" + player2.playerName);

    }
    public void lapHandler() {
        if (player1.active) {
            playerNow = player1;
        } else {
            playerNow = player2;
        }
        System.out.println(playerNow + ", du bist an der Reihe!");
        int x;
        int y;
        int z;


        for (Node node : gamefield.nodeArray) {
            if(node.hasPosition(x, y, z)){
                node.setValue(true);
                playerNow.numberOfTokens = playerNow.numberOfTokens - 1;
                player1.active = false;
                player2.active = true;

            }



        }
    public void isMill(){
            for (Node node : gamefield.nodeArray){
                x y z
                (1 2 1)
                (1 2 2)
                (1 2 3)
                //

            }
        }




    }

        /*
        Welcher spieler ist an der reihe (if abfrage)
        if spieler1.active = true;
            spieler 1 ist dran;
            else: spieler 2;
        systemout: spieler2 ist an der reihe


         */
}





