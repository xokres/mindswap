package academy.mindswap;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Queue<Integer> integerQueue2 = new LinkedList<>();
        integerQueue2.add(10);
        integerQueue2.add(5);
        integerQueue2.add(12);

        System.out.println("Linked list");
        System.out.println(integerQueue2.poll());
        Iterator it2 = integerQueue2.iterator();
        while (it2.hasNext() != false) {
            System.out.print(it2.next() + " ");
        }


        Queue<Integer> integerQueue = new PriorityQueue<>();
        integerQueue.add(10);
        integerQueue.add(5);
        integerQueue.add(12);

        System.out.println("\n\nPriority Queue");
        System.out.println(integerQueue.remove());

        Iterator it = integerQueue.iterator();

        while (it.hasNext() != false) {
            System.out.print(it.next() + " ");
        }


        //return 0;
        Queue<Integer> stringQueue = new PriorityQueue<>(Integer::compare);
        /*stringQueue.add("a");

        stringQueue.add("b");
        stringQueue.add("c");
        stringQueue.add("i");
        stringQueue.add("ee");
        stringQueue.add("f");
        stringQueue.add("dd");
        stringQueue.add("f");*/

        stringQueue.add(10);
        stringQueue.add(5);
        stringQueue.add(12);
        stringQueue.add(1);
        stringQueue.add(2);

        System.out.println("\n\nPriority Queue");
       // System.out.println(stringQueue.remove());

       /* Iterator its = stringQueue.iterator();

        while (its.hasNext() != false) {
            System.out.print(its.next() + " ");
        }*/

        for (Integer integer : stringQueue) {
            System.out.print(integer + " ");
        }




        System.out.println("\n\nPriority Queue remove");
        System.out.println(stringQueue.peek());
        System.out.println(stringQueue.remove());
        System.out.println(stringQueue.remove());
        System.out.println(stringQueue.remove());
        System.out.println(stringQueue.remove());



    }
}
