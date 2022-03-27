public class MsLogger {

    public static final int DEBUG = 0;
    public static final int INFO = 1;
    public static final int WARNING = 2;
    public static final int ERROR = 3;
    public static final int FATAL = 4;

    private MsLogger() {
    }

    public static MsLogger getLogger() {
        return new MsLogger();
    }


    public void log(int level, String message) {
        if (level == DEBUG) {
            System.out.println("[DEBUG] " + message);
        } else if (level == INFO) {
            System.out.println("[INFO] " + message);
        } else if (level == WARNING) {
            System.out.println("[WARNING] " + message);
        } else if (level == ERROR) {
            System.out.println("[ERROR] " + message);
        } else if (level == FATAL) {
            System.out.println("[FATAL] " + message);
        }
    }
}
