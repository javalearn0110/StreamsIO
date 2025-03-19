package main.java.ru.sibintek.iostreams.file;

import java.io.File;

/**
 * -
 */
public class RenameFile {
    public static void main(String[] args) {
        try {
            File f = new File("F:\\JavaProjects\\StreamsIO\\testfile.txt");
            File nf = new File("F:\\JavaProjects\\StreamsIO\\testfile_renamed.txt");
            if (f.renameTo(nf)) {
                System.out.print("File Renamed");
            } else {
                System.out.print("Nothing For Rename!");
            }
        } catch (Exception e) {
            System.out.print(e);
        }

    }
}
