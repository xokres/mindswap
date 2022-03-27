package academy.mindswap;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main2 {

    public static void main(String[] args) {

        System.out.println((char) 83);




        FileInputStream fileToRead =null;

        try {
            fileToRead = new FileInputStream("./src/image.png");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        byte[] buffer = new byte[1024];

/*
        try {
            byte[] allBytes = fileToRead.readAllBytes();
            System.out.println(allBytes.length);
            for (byte b : allBytes){

                    System.out.print((char) b);
                    // System.out.print( b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
*/

        try {

            fileToRead.read(buffer);

            while (fileToRead.read(buffer) != -1){
               // System.out.println("\nentered while");
                for (byte b : buffer){
                    //if(b!=0){
                        System.out.println( b);
                       // System.out.print( b);
                   // }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
