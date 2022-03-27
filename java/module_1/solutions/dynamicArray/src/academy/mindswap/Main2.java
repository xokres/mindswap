package academy.mindswap;

import java.util.*;
import java.util.stream.Collectors;

public class Main2 {
    public static void main(String[] args) {
        DynamicObjectArray<Integer> integerArray = new DynamicObjectArray<>();
        Set<Integer> num = new HashSet<>();


        num.stream().mapToInt(Integer::intValue).sorted();
        List<String> stringList = new ArrayList<>(Arrays.asList(new StringBuilder()
                .append("alerz")
                .reverse()
                .toString().split(" ",1)));
       Collections.reverse(stringList);
       String.join(" ", stringList);
        List<String> a = new ArrayList<>(Arrays.asList("a", "b", "c"));

        a.stream().collect(Collectors.joining(""));
        String[] b = new String[]{"a", "b", "c"};
        String.join("", b);
        integerArray.add(1);
        integerArray.add(2);
        integerArray.add(3);
        integerArray.add(4);
        integerArray.add(5);
      //  System.out.println(integerArray.size());

        for (int i = 0; i < integerArray.size(); i++) {
            System.out.println(integerArray.get(i));
            integerArray.set(i, integerArray.get(i) + 1);
        }
/*
       for (Object o: integerArray) {
            System.out.println(o);
        }

       Iterator it = integerArray.iterator();

        for (; it.hasNext();) {
            System.out.println(it.next());
        }*/

        DynamicObjectArray<String> stringArray = new DynamicObjectArray<>();

        stringArray.add("Hello");
        stringArray.add("World");
        stringArray.add("!");
     // stringArray.add(3);

        for (Object o: stringArray) {
            System.out.println(o);
        }
    }
}
