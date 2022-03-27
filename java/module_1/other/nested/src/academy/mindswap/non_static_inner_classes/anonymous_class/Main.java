package academy.mindswap.non_static_inner_classes.anonymous_class;

public class Main {

    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass(2);

        MyAbstractClass abstractClass = outerClass.outerClassMethod3();
        abstractClass.abstractClassMethod();
    }
}
