package academy.mindswap;

public class Main {

    public static void main(String[] args) {

        Doll doll = new Doll("Pale","Blonde","Blue","Josefina");
        Doll doll1 = new Doll("Pale","Blonde","Blue","Josefina");
        Doll doll2 = new Doll("Pale","Blonde","Brown","Josefina");

       // doll.unsafeString = "Hello";

        //right way of accessing static variable
        System.out.println(Doll.getNumberOfDollsCreatedWithBlueEyes());

        //shouldn't be accessing instance variable this way
        System.out.println("Number of dolls created doll2: " + doll2.getNumberOfDollsCreated());
        System.out.println("Number of dolls created with blue eyes doll: " +doll.getNumberOfDollsCreatedWithBlueEyes());

        //all access to the same int variable from the Doll class
        System.out.println("Number of dolls created doll1: " + doll1.getNumberOfDollsCreated());
        System.out.println("Number of dolls created with blue eyes doll2: " +doll2.getNumberOfDollsCreatedWithBlueEyes());

    }
}
