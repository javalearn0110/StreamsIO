package main.java.ru.sibintek.iostreams.input;

import java.io.*;

/**
 * -
 */

public class DataStreamCharsEx {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("sourcefile.txt");
            int i = 0;
            while ((i = fis.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (Exception e) {
            System.out.print(e);
        }
    }
}
