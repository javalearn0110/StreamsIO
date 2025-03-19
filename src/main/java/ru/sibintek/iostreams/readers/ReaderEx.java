package main.java.ru.sibintek.iostreams.readers;

import java.io.*;

/**
 * -
 */

public class ReaderEx {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("sourcefile.txt");
            int data = reader.read();
            while (data != -1) {
                System.out.print((char) data);
                data = reader.read();
            }
            reader.close();
        } catch (Exception e) {
            System.out.print(e);
        }
    }
}
