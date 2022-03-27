package academy.mindswap;

import academy.mindswap.animals.Animal;
import academy.mindswap.animals.Dog;
import academy.mindswap.animals.Panda;

public class Main {

    public static void main(String[] args) {
	// write your code here
       // Animal animal = new Animal("Name",0);


        Dog dog = new Dog("Dog","Reksio");
        Animal ruffus = new Dog("Animal dog Ruffus","Labrador");
        Animal fido = new Panda("Animal Panda Fido",3);
        Object o = new Dog("Object dog Ruffus","Labrador");
        Object[] animals = {ruffus,fido,o, dog};


       /* ruffus.makeNoise();

        fido.makeNoise();

        System.out.println(fido.toString());
        */

        for(Object animal : animals){
            System.out.println("--------------------------------");
            if(animal instanceof Animal){
                System.out.println(((Animal) animal).getName());
                ((Animal) animal).makeNoise();
            }
            if(animal instanceof Dog){
                ((Dog) animal).runAfterMailman();
            }
            if(animal instanceof Panda){
                System.out.println(((Panda) animal).getName());
                ;
            }
            if(animal instanceof Object){
                System.out.println(((Object) animal).toString());
            }
            System.out.println("++++++++++++++++++++++++++++++++");
        }
    }
}
