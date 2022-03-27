package academy.mindswap.animals;

public class Animal {
    private int age;
    private int hungerLevel;
    private String name;

    public Animal(String name) {
        this.name = name;
        hungerLevel = 0;
        age = 0;
    }

    public void eat(String food) {
        if (hungerLevel <= 10) {
            System.out.println("Thanks, but no thanks.");
            return;
        }
        System.out.println("Yum, yum, yum... This is some delicious " + food + "!");
    }

    public void run(int distanceInKm) {
        hungerLevel += distanceInKm;
    }

    public void getOlder() {
        age++;
    }

    public void makeNoise(){

    }

}
