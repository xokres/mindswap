package academy.mindswap;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        // write your code here

        Set<Integer> syncCollection = Collections.synchronizedSet(new HashSet<>());

        Runnable listOperation = () -> {

            IntStream.range(1, 11).forEach((i) -> {
                try {
                    Thread.sleep(ThreadLocalRandom.current().nextInt(100));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                syncCollection.add(i);
            } );
           // syncCollection.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        };

        Thread thread1 = new Thread(listOperation);
        Thread thread2 = new Thread(listOperation);
        thread1.start();
        thread2.start();
      //  thread1.join();
      //  thread2.join();
        while (thread1.isAlive() || thread2.isAlive()) {
            System.out.println(syncCollection);
        }
        System.out.println(syncCollection);
    }
}
