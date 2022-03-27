package academy.mindswap;

public class Factory {

    public static void main(String[] args) throws InterruptedException {

        Thread john = new Thread(new Worker("John",20));
        Thread mary = new Thread(new Worker("Mary",30));


        System.out.println("MANAGER: Here I'm waiting for the workers to finish");
        john.start();
        mary.start();

        Thread.sleep(200);
        try {
            john.join(1000);
            mary.join();
        System.out.println("MANAGER: All the workers are done! I can finally go home");
        } catch (InterruptedException e) {
            System.out.println("MANAGER: I was interrupted!");
        }
    }
}
