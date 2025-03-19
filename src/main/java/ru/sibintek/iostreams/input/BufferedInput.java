package main.java.ru.sibintek.iostreams.input;

import java.io.*;

/**
 * -
 */

public class BufferedInput {
    public static void main(String args[]) {
        try {
            FileInputStream fis = new FileInputStream("sourcefile.txt");
            BufferedInputStream bis = new BufferedInputStream(fis);
            int i = 0;
            while ((i = bis.read()) != -1) {
                System.out.print((char) i);
            }
            bis.close();
            fis.close();
        } catch (Exception e) {
            System.out.print(e);
        }
    }
}
