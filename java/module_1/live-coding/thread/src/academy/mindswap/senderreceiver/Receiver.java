package academy.mindswap.senderreceiver;

import java.util.concurrent.ThreadLocalRandom;

public class Receiver implements Runnable {
    private Data load;

    public Receiver(Data load) {
        this.load = load;
    }

    @Override
    public void run() {
        for(String receivedMessage = load.receive(); !receivedMessage.equals("End of transmission"); receivedMessage = load.receive()) {
            System.out.println("Received: " + receivedMessage);
            try {
                Thread.sleep(ThreadLocalRandom.current().nextInt(1000, 2000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
