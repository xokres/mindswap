package academy.mindswap;
import java.io.*;


public class Buffered {
    public static void main(String[] args) {
        BufferedReader bufferedReader2 = null;
        BufferedWriter bufferedWriter = null;


        try {

            String file ="";

             bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
// System.out.println("Enter a file to read: ");

            bufferedWriter.write("Enter a file to read: \n");
            bufferedWriter.write("And don't be an... \n");
            bufferedWriter.write("just do it \n");
            bufferedWriter.flush();

            bufferedReader2 = new BufferedReader(new InputStreamReader(System.in));
            file = bufferedReader2.readLine();//blocking method


            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));//"resources/input.txt"
            String line;
            String result = "";

            while((line = bufferedReader.readLine())!=null){
                result += line + "\n";
            }

            System.out.println(result);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bufferedWriter.close();
                bufferedReader2.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }




    }
}
