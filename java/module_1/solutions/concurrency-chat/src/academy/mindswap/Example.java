package academy.mindswap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadLocalRandom;

public class Example {
    public static void main(String[] args) throws InterruptedException {
        List<Integer> a = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        ExecutorService executor = Executors.newSingleThreadExecutor();

        for (int i = 0; i <10; i++) {
           // new Thread(new Sum(a)).start();
            executor.submit(new Sum(a, i));
        }
        System.out.println("Main thread is over");
    }

    public static class Sum implements Runnable{
        private List<Integer> a;
        private int i;

        public Sum(List<Integer> a, int i) {
            this.a = a;
            this.i = i;
        }

        public void run() {
            int sum = 0;
            for (int i = 0; i < a.size(); i++) {

                sum += a.get(i);
               // a.set(i, sum);
               ;
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(a + " " + sum + " " +  Thread.currentThread().getName() + i);
        }
    }
}
