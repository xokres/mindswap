package academy.mindswap;

public class Main {

    public static void main(String[] args) {
        DynamicObjectArray dynamicObjectArray = new DynamicObjectArray();

        System.out.println("Current length: " + dynamicObjectArray.getLength());
        System.out.println("Size of DynamicObjectArray: " + dynamicObjectArray.size());

        // ADD ELEMENTS
        dynamicObjectArray.add("one");
        dynamicObjectArray.add("two");

        // GROW ARRAY (now should have length == 4)
        dynamicObjectArray.add("three");
        int a = 4;
        dynamicObjectArray.add(a);

        System.out.println("Current length: " + dynamicObjectArray.getLength());
        System.out.println("Size of DynamicObjectArray: " + dynamicObjectArray.size());

        dynamicObjectArray.add("four");

        // GROW ARRAY (now should have length == 8)
        dynamicObjectArray.add("five");

        System.out.println("Current length: " + dynamicObjectArray.getLength());
        System.out.println("Size of DynamicObjectArray: " + dynamicObjectArray.size());

        dynamicObjectArray.add("six"); // six elements created

        // REMOVE ELEMENTS
        dynamicObjectArray.remove(0); // five elements removed

        // SHRINK ARRAY (now should have length 4)
        dynamicObjectArray.remove(1); // four elements removed
        dynamicObjectArray.remove(1); // three elements removed (half the length)

        System.out.println("Current length: " + dynamicObjectArray.getLength());
        System.out.println("Size of DynamicObjectArray: " + dynamicObjectArray.size());

        // PRINT ELEMENTS (should print "three", "four", "five", and "six")
        dynamicObjectArray.printElements();


        // GET ELEMENT
        System.out.println("Element at index 0: " + dynamicObjectArray.get(0));

        // SIZE OF ARRAY
        System.out.println("Size of DynamicObjectArray: " + dynamicObjectArray.size());

        dynamicObjectArray.set(0, "zero");
        System.out.println("Element at index 0: " + dynamicObjectArray.get(0));

        System.out.println("DynamicObjectArray: " + dynamicObjectArray);
    }
}
