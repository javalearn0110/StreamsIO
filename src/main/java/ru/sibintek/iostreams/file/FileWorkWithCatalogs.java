package main.java.ru.sibintek.iostreams.file;

import java.io.File;

public class FileWorkWithCatalogs {
    public static void main(String[] args) {

        // определяем объект для каталога
        File dir = new File("F:\\JavaProjects\\StreamsIO\\NewDir");
        boolean created = dir.mkdir();
        if (created)
            System.out.println("Folder has been created");
        // переименуем каталог
        File newDir = new File("F:\\JavaProjects\\StreamsIO\\NewDirRenamed");
        dir.renameTo(newDir);
        // удалим каталог
        boolean deleted = newDir.delete();
        if (deleted)
            System.out.println("Folder has been deleted");
    }
}
