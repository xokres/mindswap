package academy.mindswap.non_static_inner_classes.inner_class;

public class Main {
    public static void main(String[] args) {

        OuterClass.outerClassStaticMethod();
        // OuterClass.outerClassMethod();

        // TO ACCESS outerMethod()
        OuterClass outerClass = new OuterClass("my name");
        outerClass.outerClassMethod();

        // IF INNER CLASS WAS PUBLIC, THIS WOULD BE THE WAY TO CREATE A NEW INSTANCE
        //OuterClass.InnerClass innerClass = outerClass.new InnerClass(2);
        //innerClass.innerClassMethod();
    }
}
