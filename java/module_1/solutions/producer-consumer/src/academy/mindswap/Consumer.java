package academy.mindswap;

import academy.mindswap.container.Container;

public class Consumer implements Runnable {

    private int consumedElements;
    private final Container<Integer> queue;

    public Consumer(Container<Integer> queue, int consumedElements) {
        this.queue = queue;
        this.consumedElements = consumedElements;
    }

    @Override
    public void run() {

        while (consumedElements > 0) {

            synchronized (queue) {
                int elem = queue.poll();
                System.out.println("Thread " + Thread.currentThread().getName() + " consumed element " + elem);

                if (queue.getSize() == 0) {
                    System.out.println(Thread.currentThread().getName() + " left the queue empty");
                }
            }
            --consumedElements;

        /*    try {
                Thread.sleep(100);
            }catch (InterruptedException e){

            }*/
        }
    }
}
