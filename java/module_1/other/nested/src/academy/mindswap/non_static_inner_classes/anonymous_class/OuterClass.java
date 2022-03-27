package academy.mindswap.non_static_inner_classes.anonymous_class;

public class OuterClass {

    private static int instancesCreated;
    private final String finalProp;
    private int num;

    public OuterClass(int num) {
        this.num = num;
        finalProp = "blah";
    }

    // 3 WAYS OF CREATING AN INSTANCE OF MY INTERFACE
    public void outerClassMethod() {

        class MyLocalClassThatImplementsMyInterface implements MyInterface {

            @Override
            public void myMethod() {

            }

            @Override
            public void myMethod2() {

            }
        }

        MyInterface myLocalClassThatImplementsMyInterface = new MyLocalClassThatImplementsMyInterface();
        MyInterface myInterface = new MyLocalClassThatImplementsMyInterface();
        MyInterface myInterface2 = new MyLocalClassThatImplementsMyInterface();
        MyInterface myInterface3 = new MyLocalClassThatImplementsMyInterface();
        MyInterface myInterface4 = new MyLocalClassThatImplementsMyInterface();
        MyInterface myInterface5 = new MyLocalClassThatImplementsMyInterface();
        MyInterface myInterface6 = new MyLocalClassThatImplementsMyInterface(); // REUSABLE LOCAL CLASS

        myLocalClassThatImplementsMyInterface.myMethod();
        myLocalClassThatImplementsMyInterface.myMethod2();
    }

    public void outerClassMethod2() {

        int num = 9;

        MyInterface myInterface = new MyInterface() {

            @Override
            public void myMethod() {
              //  System.out.println(num); // SIMILARLY TO LOCAL CLASSES, ANONYMOUS CLASSES CAN ONLY ACCESS LOCAL VARIABLES IF THEY ARE FINAL OR EFFECTIVELY FINAL
                System.out.println("Blah");
            }

            @Override
            public void myMethod2() {
                System.out.println("Blah x2");
            }
        }; // CAN'T REUSE LOCAL CLASS

        myInterface.myMethod(); // BUT CAN USE THE INSTANCE CREATED
        num = 0;
    }

    public MyAbstractClass outerClassMethod3() {

        MyAbstractClass myAbstractClass = new MyAbstractClass() {
            @Override
            public void abstractClassMethod() {
                System.out.println(2);
            }
        }; // ANONYMOUS CLASSES REQUIRE EITHER AN INTERFACE TO IMPLEMENT OR A CLASS TO EXTEND.

        return myAbstractClass; // WE CAN RETURN THE INSTANCE CREATED, TO BE USED ELSEWHERE
    }

    private class MyClassThatImplementsMyInterface implements MyInterface {

        @Override
        public void myMethod() {
        }

        @Override
        public void myMethod2() {
        }
    }
}
