package main.java.ru.sibintek.iostreams.input;

import java.io.*;

public class FileInputStreamExample {

    public static void main(String[] args) {

        try (FileInputStream fin = new FileInputStream("sourcefile.txt")) {
            int i;
            while ((i = fin.read()) != -1) {

                System.out.print((char) i);
            }
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }
}