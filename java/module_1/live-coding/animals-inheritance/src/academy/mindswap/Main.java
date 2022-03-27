package academy.mindswap;


import academy.mindswap.animals.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
/*
        Pig peppa = new Pig("Peppa");
        Elephant el = new Elephant("El");
        Dog beethoven = new Dog("Beethoven","Saint Bernard");
        Tiger joseph = new Tiger("Joseph");

        peppa.makeNoise();
        el.makeNoise();
        beethoven.makeNoise();
        joseph.makeNoise();

        peppa.run(11);
        el.run(12);
        beethoven.run(13);
        joseph.run(4);

        peppa.eat("Bolotas");
        el.eat("Amendoins");
        beethoven.eat("Meat");
        joseph.eat("Peixe");

        beethoven.runAfterMailman();
*/

        Animal peppa2 = new Pig("Peppa");
      //  peppa2.run(11);
      //  peppa2.eat("Bolotas");

        Animal el2 = new Elephant("El");
      //  el2.run(12);
      //  el2.eat("Amendoins");

        Animal beethoven2 = new Dog("Beethoven","Saint Bernard");

      //  beethoven2.run(13);
     //   beethoven2.eat("Meat");
        ((Dog) beethoven2).runAfterMailman();

        Animal[] zoo = {peppa2, el2, beethoven2, new Tiger("Joseph")};

        for (Animal animal : zoo) {
            animal.makeNoise();
            animal.run(12);
            animal.eat("Peixe");
		if(animal instanceOf Dog){
			 ((Dog) animal).runAfterMailman();
		}

        }

    }
}
