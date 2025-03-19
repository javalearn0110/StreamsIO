package main.java.ru.sibintek.iostreams.input;

import java.io.*;

public class ByteIStreamExample {
    public static void main(String[] args) throws IOException {
        byte myByteMin3 = -3; // 11111101
        byte[] myArrayMin3 = {myByteMin3};

        try (InputStream inMin3 = new ByteArrayInputStream(myArrayMin3)) {
            int myInt = inMin3.read();
            System.out.println(myInt); // 253
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
