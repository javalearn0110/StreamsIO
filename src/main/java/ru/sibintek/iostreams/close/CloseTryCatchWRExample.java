package main.java.ru.sibintek.iostreams.close;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CloseTryCatchWRExample {

    public static void main(String[] args) {

        try (FileInputStream fin = new FileInputStream("sourcefile.txt");
             FileOutputStream fos = new FileOutputStream("targetfile.txt")) {
            int i = -1;
            while ((i = fin.read()) != -1) {

                System.out.print((char) i);
            }
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }
}

