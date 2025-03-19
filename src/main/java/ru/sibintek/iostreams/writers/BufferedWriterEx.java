package main.java.ru.sibintek.iostreams.writers;

import java.io.*;

/**
 * -
 */
public class BufferedWriterEx {
    public static void main(String args[]) {
        try {
            FileWriter fw = new FileWriter("targetfile.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            String s = "TEST TEXT";
            bw.write(s);
            bw.close();
            System.out.print("Success");
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }
}
