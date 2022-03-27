package academy.mindswap;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        DirectoryAnalyser directoryAnalyser = new DirectoryAnalyser();
        try {
            directoryAnalyser.createStreams();
            directoryAnalyser.writeDownFiles();
            directoryAnalyser.checkFilePresence();
            directoryAnalyser.createFile();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                directoryAnalyser.closeStreams();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
