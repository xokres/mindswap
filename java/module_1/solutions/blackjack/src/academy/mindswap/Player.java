package academy.mindswap;

public class Player {

    private String name;
    private static int playerCounter = 0;
    private int playerAge;


    public Player(String name) {
        this.name = name;
        Player.playerCounter++;
    }

    public String getName() {
        return this.name;
    }




}
