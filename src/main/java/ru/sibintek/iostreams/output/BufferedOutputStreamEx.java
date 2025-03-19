package main.java.ru.sibintek.iostreams.output;

import java.io.*;

/**
 * -
 */
public class BufferedOutputStreamEx {
    public static void main(String args[]) {
        try {
            FileOutputStream fout = new FileOutputStream("sourcefile.txt");
            BufferedOutputStream bout = new BufferedOutputStream(fout);
            String s = "TEST STRING";
            byte[] b = s.getBytes();
            bout.write(b);
            bout.flush();
            bout.close();
            fout.close();
            System.out.print("Success");
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }
}
