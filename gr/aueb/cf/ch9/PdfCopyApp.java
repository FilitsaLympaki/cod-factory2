package gr.aueb.cf.ch9;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class PdfCopyApp {

    public static void main(String[] args) {
        int b;
        int counter = 0;
        long start;
        long end;
        double elapsedTime;

        try (FileInputStream fis = new FileInputStream("C:\\Users\\tlymp\\Documents\\CF-JAVA_notes\\dummy.pdf");
             FileOutputStream fos = new FileOutputStream("C:/Users/tlymp/Documents/CF-JAVA_notes\\dummy-new.pdf")) {

            start = System.currentTimeMillis();
            while ((b = fis.read()) != -1) {
                fos.write(b);
                counter++;
            }
            end = System.currentTimeMillis();
            elapsedTime = (end - start) / 1000.0;

            System.out.printf("Το αρχείο με μέγεθος %.1fKB (%d bytes) αντιγράφηκε επιτυχώς\n", (counter/1024.0), counter);
            System.out.println("Elapsed time: " + elapsedTime + " seconds");

        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}