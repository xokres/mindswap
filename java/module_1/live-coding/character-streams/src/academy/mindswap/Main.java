package academy.mindswap;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class Main {

    public static void main(String[] args) {

    String s ="";
    char[] a = {'\u0928','\u092E','\u094D'};
    byte d = (byte) a[0];
    String s1 =new String(a);
   //     System.out.println(s1);
   //     System.out.println(Character.valueOf(a[0]).charValue());



    int bytesRead;
        FileReader fileReader = null;
        FileWriter fileWriter = null;
        int c = 0;
        try {
            fileReader = new FileReader("resources/input.txt");
            fileWriter = new FileWriter("resources/output.txt");
            char[] buffer = new char[1024];


            while ((bytesRead = fileReader.read(buffer)) != -1) {
                fileWriter.write(buffer, 0, bytesRead);
                if(c==0){
                    fileWriter.flush();
                }
                c++;
            }
            fileWriter.flush();
            System.exit(1);

            fileWriter.write(a);


        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileReader.close();
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
