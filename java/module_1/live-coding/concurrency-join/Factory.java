public class Factory {

    public static void main(String[] args) {

        Thread worker = new Thread(new Worker(4,7));
        Thread worker2 = new Thread(new Worker(5,7));

        System.out.println("MANAGER: Here am I, waiting for these guys...");
        worker.start();
        worker2.start();

        try {
            worker.join(); // show what happens without joining threads
            worker2.join();

            System.out.println("MANAGER: Finally I can go home!");
        } catch (InterruptedException e) {
            System.out.println("MANAGER: These $&@# woke me up!!");
        }
    }
}
