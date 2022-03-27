public class Main {

    public static void main(String[] args) {
        int min = 1;
        int max = 10;

       // Game game = new Game(new Player("Peter"), new Player("Martha"));

        Game game = new Game();

        Player p1 = new Player("Peter");
        game.setP1(p1);
        game.setP2(new Player("Martha"));
        game.start(min, max);

        game.start(2,6);

        //game.setP1(new Player("Francisco"));
       // game.start(min, 4);
    }
}
