package academy.mindswap;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        NodeContainer itSeemsAlmostLikeADynamicArray = new NodeContainer();


        List a = new ArrayList();

        itSeemsAlmostLikeADynamicArray.add("Hello");
        itSeemsAlmostLikeADynamicArray.add("World");
        itSeemsAlmostLikeADynamicArray.add("!");
        System.out.println(itSeemsAlmostLikeADynamicArray.size());
        System.out.println(itSeemsAlmostLikeADynamicArray.get(0));
        itSeemsAlmostLikeADynamicArray.remove("Hello");
        System.out.println(itSeemsAlmostLikeADynamicArray.size());
        System.out.println(itSeemsAlmostLikeADynamicArray.get(0));
        System.out.println(itSeemsAlmostLikeADynamicArray.indexOf("!"));
    }



}

