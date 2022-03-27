package academy.mindswap;

import java.io.Closeable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {

    private FileInputStream in;
    private FileOutputStream out;

    public void start(String fileToCopy, String copiedFile) {

        byte[] buffer = new byte[1024];

        try {

            in = new FileInputStream(fileToCopy);
            out = new FileOutputStream(copiedFile);

            int bytesRead;

            while ((bytesRead = in.read(buffer)) != -1) {
                System.out.println("Bytes read: " + bytesRead);
                out.write(buffer, 0, bytesRead);
            }

        } catch (IOException ex) {
            System.err.println(ex.getMessage());
            closeStream(in);
            closeStream(out);
            System.exit(1);

        } catch (NullPointerException ex) {
            System.err.println("Files can't be null found");
            closeStream(in);
            closeStream(out);
            System.exit(2);
        }
        finally {
            closeStream(in);
            closeStream(out);

        }
    }

    private void closeStream(Closeable stream) {
        try {
            stream.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NullPointerException e) {
            return;
        }
    }
}
