package academy.mindswap;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) {

        FileOutputStream fileToWrite = null;
        byte[] bytesToWrite = "This is what i want to write\n".getBytes();

        try {
            fileToWrite = new FileOutputStream("./src/write.txt");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try {
            fileToWrite.write(bytesToWrite);
            fileToWrite.write(bytesToWrite);
            fileToWrite.write(bytesToWrite);
            fileToWrite.write(bytesToWrite);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            fileToWrite.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
