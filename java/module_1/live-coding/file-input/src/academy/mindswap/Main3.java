package academy.mindswap;

import java.nio.charset.StandardCharsets;

public class Main3 {
    public static void main(String[] args) {

        byte b = (byte) 128;
        byte b0 = 127;
        byte b1 = (int) 83;
        int i = (byte) 83;
        char c = 'ç';
        byte c1 = (byte) c;
        System.out.println( (byte) c);
        System.out.println( (char) c1);
        String s = "ç";
        byte[] sBytes = s.getBytes(StandardCharsets.UTF_8);

        for (byte b2 : sBytes) {
            System.out.println( b2);
        }

        if(b1 == i){
            System.out.println("b1 == i");
        }

        System.out.println((char) b1);
        System.out.println((byte) i);

      //  System.out.println((char) b);

    }
}
