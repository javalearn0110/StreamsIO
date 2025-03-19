package main.java.ru.sibintek.iostreams.output;

import java.io.*;

public class WriteFile {

    public static void main(String[] args) {

        String text = "Hello world!"; // строка для записи
        try (FileOutputStream fos = new FileOutputStream("notes.txt")) {
            // перевод строки в байты
            byte[] buffer = text.getBytes();

            fos.write(buffer, 0, buffer.length);
            System.out.println("The file has been written");
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }
}