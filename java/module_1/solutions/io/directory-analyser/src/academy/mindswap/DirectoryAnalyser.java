package academy.mindswap;

import java.io.*;

public class DirectoryAnalyser {

    private BufferedReader consoleReader;
    private BufferedWriter writer;

    public void createStreams() throws IOException {
        consoleReader = new BufferedReader(new InputStreamReader(System.in));
        writer = new BufferedWriter(new FileWriter("resources/list.txt"));
    }

    public void writeDownFiles() throws IOException {
        if (checkNullableStreams()){
            System.out.println(Messages.NO_STREAMS);
            return;
        }

        File directory = askForDirectory();
        System.out.println(Messages.LISTING_MESSAGE);

        for (File directoryFile : directory.listFiles()) {
            writer.write(directoryFile.getName());
            writer.newLine();
            writer.flush();
        }
    }

    public void checkFilePresence() throws IOException {
        if (checkNullableStreams()){
            System.out.println(Messages.NO_STREAMS);
            return;
        }

        String userInput = getUserInput(Messages.FILE_QUESTION);

        if (new File(userInput).exists()) {
            System.out.println(Messages.FILE_EXISTS);
            return;
        }

        System.out.println(Messages.FILE_DOES_NOT_EXIST);
    }

    public void createFile() throws IOException {
        if (checkNullableStreams()){
            System.out.println(Messages.NO_STREAMS);
            return;
        }

        File directory = askForDirectory();

        String secondUserInput = getUserInput(Messages.FILE_CREATION_QUESTION);

        boolean newFile = new File(directory.getPath() + "/" + secondUserInput).createNewFile();

        System.out.println(newFile ? Messages.FILE_CREATED : Messages.FILE_NOT_CREATED);
    }

    private File askForDirectory() throws IOException {
        String userInput = getUserInput(Messages.DIRECTORY_QUESTION);
        File dir = new File(userInput);
        return checkIfNotDirectory(dir) ? askForDirectory() : dir;
    }

    private String getUserInput(String message) throws IOException {
        System.out.println(message);
        return consoleReader.readLine();
    }

    private boolean checkIfNotDirectory(File file) {
        if (!file.isDirectory()) {
            System.out.println(Messages.NOT_DIRECTORY_MESSAGE);
            return true;
        }
        return false;
    }

    public void closeStreams() throws IOException {

        if (consoleReader != null) {
            consoleReader.close();
        }

        if (writer != null) {
            writer.close();
        }
    }

    private boolean checkNullableStreams() {
        return writer == null || consoleReader == null;
    }
}
