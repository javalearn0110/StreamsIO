package main.java.ru.sibintek.iostreams.file;

import java.io.File;
import java.util.Objects;

public class FileListFilesEx {

    public static void main(String[] args) {

        // определяем объект для каталога
        File dir = new File("F:\\JavaProjects\\StreamsIO");
        // если объект представляет каталог
        if (dir.isDirectory()) {
            // получаем все вложенные объекты в каталоге
            for (File item : Objects.requireNonNull(dir.listFiles())) {

                if (item.isDirectory()) {
                    System.out.println(item.getName() + "  \t folder");
                } else {

                    System.out.println(item.getName() + "\t file");
                }
            }
        }
    }
}