package academy.mindswap.static_inner_class;

public class Main {

    public static void main(String[] args) {
        OuterClass.outerClassStaticMethod();
        // new OuterClass("o teu nome").outerClassStaticMethod();

        // IF STATIC INNER CLASS WAS PUBLIC, THIS WOULD BE THE WAY TO CREATE A NEW INSTANCE:
        // OuterClass.StaticInnerClass staticInnerClass = new OuterClass.StaticInnerClass();
        // staticInnerClass.innerClassMethod();
    }
}
