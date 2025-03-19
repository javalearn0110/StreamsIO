package main.java.ru.sibintek.iostreams.output;

import java.io.*;

/**
 * -
 */
public class FileOutputStreams {
    public static void main(String[] args) {
        try {
            FileOutputStream fout = new FileOutputStream("sourcefile.txt");
            String s = "TEST STRING";
            byte[] b = s.getBytes();
            fout.write(b);
            fout.close();
            System.out.print("Success");
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }
}
