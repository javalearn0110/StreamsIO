package main.java.ru.sibintek.iostreams;

import java.io.*;

/**
 *
 */

public class WriteRandom {
    public static void main(String[] args) {
        try {
            File fdfile = new File("sourcefile.txt");
            RandomAccessFile rndFile = new RandomAccessFile(fdfile, "rw");
            rndFile.writeUTF("test text");
            rndFile.writeInt(52);
            rndFile.writeFloat(5.2f);
            rndFile.close();
            System.out.print("Done!");

        } catch (Exception e) {
            System.out.print(e);
        }
    }
}
