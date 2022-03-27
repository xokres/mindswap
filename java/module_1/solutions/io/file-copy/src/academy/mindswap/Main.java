package academy.mindswap;

public class Main {

    public static void main(String[] args) {

       // FileCopy fc = new FileCopy();
       // fc.start();
        String fileToCopy = args[0]; //"resources/img.png"
        String destination = args[1]; //"resources/img.png" "resources/img_copy.png"
        new FileCopy()
                .start(fileToCopy, destination);
        //System.exit(5);
        System.err.print("Done");
        System.out.println("Hello World!");

        new FileCopy()
                .start(null, destination);
    }
}
