package main.java.ru.sibintek.iostreams.chain;

import java.io.*;

public class ChainDemo2 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("chain.txt");
            DataInputStream dis = new DataInputStream(fis);

           System.out.println(dis.readUTF());

            int counter = dis.readInt();
            double sum = 0.0;
            for (int i = 0; i < counter; i++) {
                double current = dis.readDouble();
                System.out.println("Read" + current);
                sum += current;
            }
            System.out.println("Avg" + sum / counter);
            dis.close();
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
