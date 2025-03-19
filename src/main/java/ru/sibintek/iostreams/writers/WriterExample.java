package main.java.ru.sibintek.iostreams.writers;

// Demonstrate the woking of FileWriter class
import java.io.FileWriter;
import java.io.IOException;

public class WriterExample {
    public static void main(String[] args)
    {
        try {

            // Create a FileWriter to write to a file named
            // "targetfile.txt"
            FileWriter w = new FileWriter("targetfile.txt");

            // Write a simple message to the file
            w.write("Hello, World!");

            // Close the writer
            w.close();

            System.out.println(
                    "Geeks for Geeks");
        }
        catch (IOException e) {
            System.out.println("An error occurred: "
                    + e.getMessage());
        }
    }
}