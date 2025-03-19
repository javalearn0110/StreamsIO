package main.java.ru.sibintek.iostreams.readers;

import java.io.*;

public class BufferedReaderReadLine {
    public static void main(String[] args) {
        String src = "F:\\JavaProjects\\StreamsIO\\multiline.txt";

        try (FileReader in = new FileReader(src);
             BufferedReader reader = new BufferedReader(in)) {
            while (reader.ready()) {
                String line = reader.readLine();
                System.out.println(line);
            }
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }
}
