package academy.mindswap.animals;

import academy.mindswap.Printer;

public class Dog extends Animal {

    private String breed;

    public Dog(String name, String breed) {
        super(name);
        this.breed = breed;

    }

    @Override
    public void makeNoise(){
        System.out.println("Woof");
    }

    public void runAfterMailman(){
      printStr("I'm running after the mailman");
    }

    public void printStr(String message){
        Printer.print(message);
    }




}
