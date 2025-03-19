package main.java.ru.sibintek.iostreams.file;

import java.io.File;
/**
*
* -
*/
public class FilePath {
    public static void main(String[] args){
        try{
            File f = new File("testfile.txt");
                System.out.println(f.getName());
                System.out.println(f.getPath());
                System.out.println(f.getParent());
        }
        catch(Exception e){
            System.out.print(e);
        }
    }
}
