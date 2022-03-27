/**
 * Memory Reads and Writes are slow and expensive operations compared to CPU internal registers.
 * Modern CPUs introduced L1/L2 caches to speed things up.
 * Variables are not always read from or written to memory, but to the cache of the specific CPU the thread is executing on.
 *
 * Volatile variables will never be cached, all reads and writes will go straight to main memory
 * */

public class Test {

    static volatile int num = 0;

    public static void main (String[] args) {

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                int temp = 0;
                while (true) {
                    if (temp != num) {
                        temp = num;

                        System.out.println("reader: value of num = " + num);
                    }
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    num++;
                    //THREAD 1
                    System.out.println("writer: changed value to = " + num);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                System.exit(0);
            }
        });

        thread1.start();
        thread2.start();

        // Reader thread isn't able to detect any changes in num
        // CPU fetches num value from memory the first time and then caches it
        // CPU keeps reading the cached value without realizing it changed
        // solution to this problem is to make the variable volatile
        // by doing this we prohibit the CPU from caching that variable's value
    }
}
