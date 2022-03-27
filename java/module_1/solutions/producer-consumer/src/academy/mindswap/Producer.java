package academy.mindswap;

import academy.mindswap.container.Container;

public class Producer implements Runnable {

    private int elementsToProduce;
    private final Container<Integer> queue;

    public Producer(Container<Integer> queue, int elementsToProduce) {
        this.queue = queue;
        this.elementsToProduce = elementsToProduce;
    }

    @Override
    public void run() {

        while (elementsToProduce > 0) {
            int elem = (int) (Math.random() * 9);

            synchronized (queue) {
                queue.offer(elem);
                System.out.println("Thread " + Thread.currentThread().getName() + " added element " + elem);
                if (queue.getSize() == queue.getLimit()) {
                    System.out.println("Thread " + Thread.currentThread().getName() + " left the queue full");
                }
            }
            --elementsToProduce;

         /*   try {
                Thread.sleep(10);
            }catch (InterruptedException e){

            }*/
        }
    }
}
