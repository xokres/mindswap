package academy.mindswap.non_static_inner_classes.local_class;

public class OuterClass {

    private static int instancesCreated;
    private final String finalProp;
    private int num;
    // private LocalClass local; // LOCAL CLASS ONLY EXISTS INSIDE THE METHOD

    public OuterClass(int num) {
        this.num = num;
        finalProp = "kknek";
    }

    public void outerMethod(String arg) {
        System.out.println("Outer Instance Method");
        String message = arg;


        class LocalClass {
            private int num2;

            public void localClassMethod() {
                int num3;
                num3 = 23;
                num3 = 45;
                System.out.println(num); // LOCAL CLASSES HAVE ACCESS TO ALL CLASS MEMBERS, WHETHER THEY ARE NON-STATIC
                System.out.println(instancesCreated); // OR STATIC
                outerStaticMethod();
                System.out.println(num2); // LOCAL CLASS METHODS HAVE ACCESS TO LOCAL CLASS PROPERTIES, JUST LIKE IN A NORMAL CLASS
                System.out.println(finalProp);
                System.out.println(this); // LocalClass Instance

                System.out.println(message); // LOCAL CLASSES CAN ONLY ACCESS THE LOCAL VARIABLES OF THE METHOD WITHIN THEY ARE DECLARED
                // IF THE VARIABLES ARE EXPLICITLY DECLARED FINAL, OR ARE IMPLICITLY FINAL (i.e. EFFECTIVELY FINAL)
            }
        }

        // System.out.println(num2); // LOCAL CLASS PROPERTIES AREN'T DIRECTLY ACCESSIBLE
        LocalClass localClass = new LocalClass();
        localClass.localClassMethod();

        System.out.println(this); // OuterClass Instance
    }

    public static void outerStaticMethod() {
        System.out.println("Outer Class Method");
    }
}
