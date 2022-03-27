public class Player {

    private String name;

    public Player(String name) {
        this.name = name;
    }

    public int pickNumber(int min, int max) {
        return RandomGenerator.generateRandomNumber(min, max);
    }

    public String getName() {
        return name;
    }
}
