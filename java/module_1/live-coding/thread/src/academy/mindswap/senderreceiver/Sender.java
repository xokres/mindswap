package academy.mindswap.senderreceiver;

import java.util.concurrent.ThreadLocalRandom;

public class Sender implements Runnable {

    private Data data;
    public Sender(Data data) {
        this.data = data;
    }
    @Override
    public void run() {
        String[] packets = {"First packet", "Second packet", "Third packet", "Fourth packet", "End of transmission"};

        for (String packet : packets) {
            System.out.println("before Sending packet: " + packet);
            data.send(packet);
            System.out.println("after Sending packet: " + packet);
            try {
                Thread.sleep(ThreadLocalRandom.current().nextInt(1000, 2000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
