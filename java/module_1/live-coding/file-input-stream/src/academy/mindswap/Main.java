package academy.mindswap;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here

        //System.out.println('\u0928');
        System.out.println("Write a string: ");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String strLine = in.readLine();
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        out.write("Your string is: ");
        out.write(strLine);

        out.flush();
          in.close();
        out.close();

    }
}
