package academy.mindswap.senderreceiver;

public class Data {

    private String packet;

    //True if receiver should wait
    //False if sender should wait
    private  boolean transfer = true;


    public  synchronized String receive() {
       while (transfer) {
           try {
               wait();
           }
           catch (InterruptedException e) {
               e.printStackTrace();
           }
       }
       transfer = true;
       String returnPacket = packet;
       notifyAll();
       return returnPacket;

    }

    public synchronized void send(String packet) {
        while (!transfer) {
            try {
                wait();
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        transfer = false;
        this.packet = packet;
        notifyAll();
    }

}
