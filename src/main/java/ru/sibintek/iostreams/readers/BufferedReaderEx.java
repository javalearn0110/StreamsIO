package main.java.ru.sibintek.iostreams.readers;

import java.io.*;

/**
 * -
 */

public class BufferedReaderEx {
    public static void main(String args[]) {
        try {
            FileReader reader = new FileReader("sourcefile.txt");
            BufferedReader bfr = new BufferedReader(reader);

            int i;
            while ((i = bfr.read()) != -1) {
                System.out.print((char) i);
            }
            bfr.close();
            reader.close();
        } catch (Exception e) {
            System.out.print(e);
        }
    }
}
