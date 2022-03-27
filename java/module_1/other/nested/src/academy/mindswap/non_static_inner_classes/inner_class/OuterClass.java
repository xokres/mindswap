package academy.mindswap.non_static_inner_classes.inner_class;

public class OuterClass {

    private static int outerClassInstances;
    private String name;

    public OuterClass(String name) {
        this.name = name;
        outerClassInstances++;
    }

    public void outerClassMethod() {
        InnerClass innerClass = new InnerClass(2);
        innerClass.innerClassMethod();

       // innerClassMethod(); // AN INSTANCE OF INNER CLASS IS NEEDED IN ORDER TO INVOKE THIS METHOD
       // InnerClass.innerClassMethod(); // IT IS NOT A STATIC MEMBER, MEANING I CAN'T ACCESS THIS METHOD USING THE CLASS NAME

        System.out.println(outerClassInstances);
    }

    public static void outerClassStaticMethod() {
        System.out.println("Outer Class Static Method");
    }

    private class InnerClass {

        private int num;
        // private static int num2; // NON-STATIC INNER CLASSES CAN'T DECLARE STATIC MEMBERS

        public InnerClass(int num) {
            this.num = num;
        }

        public void innerClassMethod(){
            System.out.println(outerClassInstances); // INNER CLASSES CAN ACCESS EVERY MEMBER OF THE ENCLOSING CLASS
            outerClassStaticMethod(); // WHETHER IT'S STATIC
            outerClassMethod(); // OR NON-STATIC
        }
    }
}
