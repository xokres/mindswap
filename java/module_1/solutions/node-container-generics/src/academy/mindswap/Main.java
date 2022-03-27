package academy.mindswap;

public class Main {

    public static void main(String[] args) {
        NodeContainer<String> nc = new NodeContainer<>();

        nc.add("Hello");
        nc.add("World");
        nc.add("!");
       // nc.add(1);
        for (String s : nc) {
            System.out.println(s);
        }
    }
}
