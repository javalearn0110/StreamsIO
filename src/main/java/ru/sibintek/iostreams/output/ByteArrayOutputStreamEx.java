package main.java.ru.sibintek.iostreams.output;

import java.io.*;

/**
 * -
 */
public class ByteArrayOutputStreamEx {
    public static void main(String[] args) {
        try {
            FileOutputStream fout = new FileOutputStream("sourcefile.txt");
            ByteArrayOutputStream bout = new ByteArrayOutputStream();
            bout.write(65);
            bout.writeTo(fout);
            bout.flush();
            System.out.print("Success");
        } catch (Exception e) {
            System.out.print(e);
        }
    }
}
