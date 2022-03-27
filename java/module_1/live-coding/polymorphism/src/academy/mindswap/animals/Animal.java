package academy.mindswap.animals;

public abstract class Animal extends Object {

    private String name;
    private int age;

    public Animal(){

    }
    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    public Animal(String name){
        this.name = name;
        this.age = 0;
    }

    public void makeNoise(){
        System.out.println("Animal is making noise");
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public void getOlder(){
        age++;
    }

}
