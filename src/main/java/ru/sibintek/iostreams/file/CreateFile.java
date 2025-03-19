package main.java.ru.sibintek.iostreams.file;

import java.io.File;
/**
*
* -
*/
public class CreateFile {
    public static void main(String args[]){
        try{
            File f = new File("F:\\JavaProjects\\StreamsIO\\testfile.txt");
            if(f.createNewFile()){
                System.out.print("File Created");
            }
            else
            {
                System.out.print("File exists!");
            }
        }
        catch(Exception e){
            System.out.print(e);
        }
        
    }
}
