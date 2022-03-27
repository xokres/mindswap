package academy.mindswap.static_inner_class;

public class OuterClass {

    private static int outerClassInstances;
    private String name;

    public OuterClass(String name) {
        this.name = name;
        outerClassInstances++;
    }

    public void outerClassMethod() {
        // STATIC MEMBERS CAN BE REFERENCED WITHIN A NON-STATIC CONTEXT
        System.out.println(outerClassInstances); // WHETHER THE STATIC MEMBER IS A PROPERTY
        StaticInnerClass staticInnerClass = new StaticInnerClass(); // OR A STATIC INNER CLASS

        staticInnerClass.innerClassMethod(); // NON-STATIC MEMBERS OF A STATIC INNER CLASS CAN BE ACCESSED AS LONG AS WE HAVE AN INSTANCE OF THAT TYPE
        System.out.println(staticInnerClass.innerClassName); // EVEN IF THEY ARE PRIVATE
    }

    public static void outerClassStaticMethod() {
        // System.out.println(name); // FROM A STATIC CONTEXT, WE CAN NEVER ACCESS NON-STATIC MEMBERS

        System.out.println(outerClassInstances); // BUT WE CAN ACCESS STATIC MEMBERS, WHETHER THEY ARE PROPERTIES
        StaticInnerClass.innerClassStaticMethod(); // OR INNER CLASSES / INNER CLASSES STATIC MEMBERS
        System.out.println(StaticInnerClass.num); // EVEN IF THEY ARE PRIVATE
    }

    private static class StaticInnerClass {

        private static int num;
        private String innerClassName;

        public void innerClassMethod() {
            int num2 = 10;
            outerClassStaticMethod(); // STATIC INNER CLASSES HAVE ACCESS TO EVERY MEMBER OF THE OUTSIDE CLASS, AS LONG AS IT'S ALSO STATIC
            System.out.println(outerClassInstances);

            // System.out.println(name); // FROM A STATIC CONTEXT, WE CAN NEVER ACCESS NON-STATIC MEMBERS
        }

        public static void innerClassStaticMethod() {
            outerClassStaticMethod();
        }
    }
}
