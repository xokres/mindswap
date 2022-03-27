package academy.mindswap;

public class Visibility {

    static volatile int num = 0;

    public static void main(String[] args) {

        Thread t1 = new Thread(new Runnable() {
            public void run() {
                int temp = 0;
                while (true) {
                    if (temp != num) {

                        temp = num;
                        System.out.println("reader: value of num = " + temp);

                    }
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 5; i++) {
                    num++;
                    System.out.println("writer: value of num = " + num);
                    try {
                        Thread.sleep(1000);
                    }  catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.exit(0);
            }
        });

        t1.start();
        t2.start();


    }
}
