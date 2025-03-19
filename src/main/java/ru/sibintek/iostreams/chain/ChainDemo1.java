package main.java.ru.sibintek.iostreams.chain;

import java.io.*;

public class ChainDemo1 {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("chain.txt");
            BufferedOutputStream buffer = new BufferedOutputStream(fos);
            DataOutputStream dataOut = new DataOutputStream(buffer);
            dataOut.writeUTF("Hello!");
            dataOut.writeInt(4);
            dataOut.writeInt(5);
            dataOut.writeDouble(100.0);
            dataOut.writeDouble(72.0);
            dataOut.writeDouble(89.0);
            dataOut.writeDouble(91.0);
            dataOut.close();
            buffer.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
