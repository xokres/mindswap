package academy.mindswap;

public class Worker implements Runnable {

    private String name;
    private int dailyNumberOfPieces;

    public Worker(String name, int dailyNumberOfPieces) {
        this.name = name;
        this.dailyNumberOfPieces = dailyNumberOfPieces;
    }

    @Override
    public void run() {
        for (int i = 0; i < dailyNumberOfPieces; i++) {
            System.out.println(name + " is working on my project");

          //  try {
          //      Thread.sleep(0);

         //   }catch (InterruptedException e) {
         //       System.out.println("Thread interrupted i was sleeping");
         //       e.printStackTrace();
        //    }

        }
        System.out.println(name + " says: I'm tired and I wanna go sleep");
    }
}
