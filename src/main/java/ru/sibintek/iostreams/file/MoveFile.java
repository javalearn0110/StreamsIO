package main.java.ru.sibintek.iostreams.file;

import java.io.File;

/**
 * -
 */
public class MoveFile {
    public static void main(String args[]) {
        try {
            File f = new File("F:\\JavaProjects\\StreamsIO\\testfile.txt");
            File nf = new File("F:\\JavaProjects\\StreamsIO\\src\\testfile.txt");
            if (f.renameTo(nf)) {
                System.out.print("File Moved!");
            } else {
                System.out.print("Nothing For Move!");
            }
        } catch (Exception e) {
            System.out.print(e);
        }

    }
}
