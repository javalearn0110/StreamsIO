package main.java.ru.sibintek.iostreams.file;

import java.io.File;
/**
*
* -
*/
public class CreateDirectory {
    public static void main(String args[]){
        try{
            File f = new File("F:\\JavaProjects\\StreamsIO\\NewFile\\NewFolder");
            if(f.mkdirs()){
                System.out.print("Folder Created");
            }
            else
            {
                System.out.print("Folder exists!");
            }
        }
        catch(Exception e){
            System.out.print(e);
        }
        
    }
}
