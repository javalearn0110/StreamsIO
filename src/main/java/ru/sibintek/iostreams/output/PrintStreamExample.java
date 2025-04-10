package main.java.ru.sibintek.iostreams.output;


import java.io.*;

public class PrintStreamExample {

    public static void main(String[] args) {

        String text = "Привет мир!"; // строка для записи
        try (FileOutputStream fos = new FileOutputStream("F:\\JavaProjects\\StreamsIO\\printstream.txt");
             PrintStream printStream = new PrintStream(fos)) {
            printStream.println(text);
            System.out.println("Запись в файл произведена");
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }
}