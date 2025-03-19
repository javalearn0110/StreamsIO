package main.java.ru.sibintek.iostreams.output;

import java.io.*;
/**
*
* -
*/
public class DataOutputStreamEx {
    public static void main(String args[]){
        try{
            FileOutputStream fout = new FileOutputStream("sourcefile.txt");
            DataOutputStream dout = new DataOutputStream(fout);
            
            dout.write(70);
            dout.flush();
            dout.close();
            System.out.print("Success");
        }
        catch(Exception e){
            System.out.print(e);
        }
    }
}
