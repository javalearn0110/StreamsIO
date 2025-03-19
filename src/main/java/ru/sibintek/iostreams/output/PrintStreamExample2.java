package main.java.ru.sibintek.iostreams.output;

import java.io.*;

public class PrintStreamExample2 {

    public static void main(String[] args) {

        try (PrintStream printStream = new PrintStream("print2.txt")) {
            printStream.print("Hello World!");
            printStream.println("Welcome to Java!");

            printStream.printf("Name: %s Age: %d \n", "Tom", 34);

            String message = "PrintStream";
            byte[] message_toBytes = message.getBytes();
            printStream.write(message_toBytes);

            System.out.println("The file has been written");
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }
}
