package academy.mindswap;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

    public static void main(String[] args)   {
	// write your code here

        FileInputStream fileToRead =null;

        try {
            fileToRead = new FileInputStream("./src/image.png");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        try{
            int b=0;
        // System.out.print((char) fileToRead.read());
            // System.out.print((char) fileToRead.read());
        // System.out.print((char) fileToRead.read());
         while ((b  = fileToRead.read()) != -1) {
             System.out.println( b);
         }/**/
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileToRead.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        //System.out.print((char)-1);
       // System.out.println(b);
       // System.out.println((char) b);



    }
}
