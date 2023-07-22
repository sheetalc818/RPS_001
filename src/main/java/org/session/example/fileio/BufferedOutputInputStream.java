package org.session.example.fileio;

import java.io.*;

public class BufferedOutputInputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream in = new FileInputStream("src/main/java/org/session/example/fileio/FileOutputInputStream.txt");
        BufferedInputStream bin = new BufferedInputStream(in);

        FileOutputStream out = new FileOutputStream("src/main/java/org/session/example/fileio/FileBuffered.txt");
        BufferedOutputStream bout = new BufferedOutputStream(out);

        int c = 0;
        while ((c = bin.read()) != -1) {
            System.out.print((char) c);
            bout.write(c);
        }
        bin.close();
        in.close();
        bout.close();
        out.close();
    }
}
