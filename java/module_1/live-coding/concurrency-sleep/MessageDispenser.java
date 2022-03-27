// EXAMPLE CREATED TO SHOW HOW THREAD SLEEP REALLY WORKS
public class MessageDispenser{

    public void start() {

        String[] messages = {
                "MORNIN'!",
                "HOW YOU DOIN', DEAR STUDENTS?",
                "READY FOR YET ANOTHER INTERESTING LEARNING SESSION?",
                "HOPE SO!",
                "KISSES AND HUGS!"
        };

        for (String message : messages) {

            System.out.println(message);

            try {

                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("I can't believe you woke me up...");
            }
        }
    }
}
