package main.java.ru.sibintek.iostreams.writers;

import java.io.*;
/**
*
* -
*/
public class CharArrayWriterEx {
    public static void main(String args[]){
        try{
            FileWriter fileW = new FileWriter("sourcefile.txt");
            CharArrayWriter chaw = new CharArrayWriter();
            String S = "TEST STRING";
            chaw.write(S);
            chaw.writeTo(fileW);
            fileW.close();
            System.out.print("Success");
            
        }
        catch(Exception e){
            System.out.print(e);
        }
}
}
