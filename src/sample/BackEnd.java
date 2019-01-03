package sample;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BackEnd {
    File file = new File("append.txt");
    FileWriter fr = new FileWriter(file,true);
    BufferedWriter br = new BufferedWriter(fr);

    public BackEnd() throws IOException {
    }
}
