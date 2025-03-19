package main.java.ru.sibintek.iostreams.readers;

import java.io.*;

/**
 * -
 */

public class CharArrayEx {
    public static void main(String args[]) {
        try {
            char[] array = {'s', 'e', 'p', 'i', 'd', 'a', 'l'};
            CharArrayReader reader = new CharArrayReader(array);
            int i = 0;
            while ((i = reader.read()) != -1) {
                char chr = (char) i;
                System.out.println(chr + " : " + i);
            }

            reader.close();

        } catch (Exception e) {
            System.out.print(e);
        }
    }
}
