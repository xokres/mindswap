package academy.mindswap;


public class Main {

    public static void main(String[] args) {
        DynamicObjectArray<String> dynamicObjectArray = new DynamicObjectArray<>();

        System.out.println("Current length: " + dynamicObjectArray.getLength());

        // ADD INTEGER
        // dynamicObjectArray.add(2);

        // ADD ELEMENTS
        dynamicObjectArray.add("one");
        dynamicObjectArray.add("two");

        // GETTING THE VALUE IN INDEX 1
        String result = dynamicObjectArray.get(1);
        System.out.println(result);

        // GROW ARRAY (now should have length == 4)
        dynamicObjectArray.add("three");

        System.out.println("Current length: " + dynamicObjectArray.getLength());

        dynamicObjectArray.add("four");

        // GROW ARRAY (now should have length == 8)
        dynamicObjectArray.add("five");

        System.out.println("Current length: " + dynamicObjectArray.getLength());

        dynamicObjectArray.add("six"); // six elements created

        // REMOVE ELEMENTS
        dynamicObjectArray.remove(0); // five elements created

        // SHRINK ARRAY (now should have length 4)
        dynamicObjectArray.remove(1); // four elements created (half the length)

        System.out.println("Current length: " + dynamicObjectArray.getLength());

        // PRINT ELEMENTS (should print "three", "four", "five", and "six")
        dynamicObjectArray.printElements();
    }
}
