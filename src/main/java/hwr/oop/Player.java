package hwr.oop;

public class Player {
    //points
    //lap
    //numberOfTokens
    int points;
    boolean active;
    int numberOfTokens;
    String playerName;

    public Player(String playerName, int points, boolean active, int numberOfTokens){
        this.playerName = playerName;
        this.points = points;
        this.active = active;
        this.numberOfTokens = numberOfTokens;


    }

}
