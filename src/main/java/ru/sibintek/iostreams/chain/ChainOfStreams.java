package main.java.ru.sibintek.iostreams.chain;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

public class ChainOfStreams {

    String src = "F:\\JavaProjects\\StreamsIO\\log.txt";
    FileInputStream input;

    {
        try {
            input = new FileInputStream(src);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    InputStreamReader reader = new InputStreamReader(input);
}
