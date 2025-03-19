package main.java.ru.sibintek.iostreams.file;

import java.io.File;

public class FilePathExample {

    public static void main(String[] args){
        try{
            File f = new File("testfile.txt");
            System.out.println("getName " + f.getName());
            System.out.println("getPath " + f.getPath());
            System.out.println("getParent " + f.getParent());
            System.out.println("getAbsolutePath " + f.getAbsolutePath());
            System.out.println("isDirectory " + f.isDirectory());
            System.out.println("isFile " + f.isFile());
            System.out.println("isHidden " + f.isHidden());
            System.out.println("length " + f.length());
            System.out.println("lastModified " + f.lastModified());
        }
        catch(Exception e){
            System.out.print(e.getMessage());
        }
    }
}
