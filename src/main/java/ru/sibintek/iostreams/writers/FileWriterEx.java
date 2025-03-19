package main.java.ru.sibintek.iostreams.writers;

import java.io.*;

/**
 * -
 */
public class FileWriterEx {
    public static void main(String args[]) {
        try {
            FileWriter fw = new FileWriter("targetfile.txt");
            String S = "TEST TEXT";
            fw.write(S);
            fw.close();
            System.out.print("Success");
        } catch (Exception e) {
            System.out.print(e);
        }
    }
}
