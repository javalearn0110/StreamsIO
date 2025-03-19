package main.java.ru.sibintek.iostreams;

import java.nio.file.Path;

public class PathExample {
    public static void main(String[] args) {
        //        Путь к файлу
        Path file = Path.of("F:\\JavaProjects\\StreamsIO\\note.txt");
        //        Путь к директории
        Path directory = Path.of("F:\\JavaProjects\\StreamsIO");

        String str = "c:\\windows\\projects\\note.txt";
        Path path = Path.of(str).getParent();  // "c:\\windows\\projects\\"

        String str2 = "c:\\windows\\projects\\";
        Path path2 = Path.of(str2).getParent();  // "c:\\windows\\"

        String str3 = "c:\\";
        Path path3 = Path.of(str3).getParent(); //null

        String str4 = "c:\\windows\\projects\\note.txt";
        Path path4 = Path.of(str4).getFileName(); //"note.txt"

        String str5 = "c:\\windows\\projects\\";
        Path path5 = Path.of(str5).getFileName(); //"projects"

        String str6 = "c:\\";
        Path path6 = Path.of(str6).getFileName(); //null

        String str7 = "c:\\windows\\projects\\";
        Path path7 = Path.of(str7).getRoot(); //"c:\\"

        String str8 = "c:\\windows\\projects\\note.txt";
        boolean abs = Path.of(str8).isAbsolute(); //true

        String str9 = "src\\com\\javarush\\Main.java";
        boolean abs2 = Path.of(str9).isAbsolute(); //false


    }
}
