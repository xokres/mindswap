public class Worker implements Runnable {

    private int id;
    private int dailyNumberOfPiecesToCreate;

    public Worker(int id, int dailyNumberOfPiecesToCreate) {
        this.id = id;
        this.dailyNumberOfPiecesToCreate = dailyNumberOfPiecesToCreate;
    }

    @Override
    public void run() {

        for (int i = 0; i < dailyNumberOfPiecesToCreate; i++) {

            System.out.println("Worker "+ id + ": Here I am, making my daily pieces... Lalalala...");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {

                System.out.println("Damn... I was sleeping, man...");
                e.printStackTrace();
            }
        }

        System.out.println("Worker "+ id + ": I'm tired. Enough for today!");
    }
}
