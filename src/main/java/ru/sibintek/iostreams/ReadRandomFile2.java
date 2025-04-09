package main.java.ru.sibintek.iostreams;

import java.io.*;

/**
 * -
 */

public class ReadRandomFile2 {
    public static void main(String[] args) {
        try {
            File fdfile = new File("multiline.txt");
            RandomAccessFile rndFile = new RandomAccessFile(fdfile, "r");

            String str = "";
            rndFile.seek(1);


            while ((str = rndFile.readLine()) != null) {
                System.out.println(str);
            }


        } catch (Exception e) {
            System.out.print(e);
        }
    }
}
