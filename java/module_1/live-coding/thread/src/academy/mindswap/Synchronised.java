package academy.mindswap;

public class Synchronised {
    public static Object a = new Object();


    public static void main(String[] args) throws InterruptedException {

        SynchronizedCounter counter = new SynchronizedCounter();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {

                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    counter.increment();
                  //  System.out.println("Incrementing counter: " + counter.value());
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    counter.decrement();
                //    System.out.println("Decrementing counter: " + counter.value());
                }
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Counter value: " + counter.value());



    }


    public static class SynchronizedCounter {
        private  int c = 0;
        private  Object o = new Object();

        public synchronized void increment() {

            System.out.println("increment: " + ++c);
        }

        public synchronized void decrement() {
            System.out.println("decrement: " +  --c);
        }

        public synchronized int value() {
            return c;
        }

        public void addValue(int value) {
            synchronized(this) {
                c += value;
            }
            synchronized (Synchronised.class) {
                o.toString();
            }
        }

    }

}
