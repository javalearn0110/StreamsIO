package main.java.ru.sibintek.iostreams.file;

import java.io.File;

/**
 * -
 */
public class DeleteFile {
    public static void main(String args[]) {
        try {
            File f = new File("F:\\JavaProjects\\StreamsIO\\fordelete.txt");
            if (f.delete()) {
                System.out.print("File Deleted");
            } else {
                System.out.print("Nothing To Delete!");
            }
        } catch (Exception e) {
            System.out.print(e);
        }

    }
}
