package main.java.ru.sibintek.iostreams.output;

import java.io.*;

/**
 * -
 */
public class FileOutputStreamEx {
    public static void main(String args[]) {
        try {
            FileOutputStream fout = new FileOutputStream("sourcefile.txt");
            fout.write(90);
            fout.close();
            System.out.print("Success");
        } catch (Exception e) {
            System.out.print(e);
        }
    }
}
