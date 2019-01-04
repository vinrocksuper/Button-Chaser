package sample;

import com.sun.prism.impl.Disposer;

import java.io.*;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.List;

public class BackEnd {

    public class writer{
        private final String COMMA_DELIMITER = ",";
        private final String NEW_LINE_SEPARATOR = "\n";
        private final String FILE_HEADER = "name,clicks";

        public void write()
        {
            List HighScores = new ArrayList();

            FileWriter fileWriter = null;
            try{
                fileWriter = new FileWriter("scores.csv");
                fileWriter.append(FILE_HEADER.toString());
                fileWriter.append(NEW_LINE_SEPARATOR);

            }
        }


        public void read(){
            BufferedReader fileReader = null;
            try{
                List records = new ArrayList();
                String s="";
                fileReader = new BufferedReader(new FileReader("scores.csv"));
                fileReader.readLine();
                while((s = fileReader.readLine()) != null){
                    String[] tokens = s.split(COMMA_DELIMITER);
                    if(tokens.length>0){
                        records temp = new records(Integer.parseInt(tokens[0]),tokens[1]);
                        records.add(temp);
                    }
                }

            }catch(Exception e){
                e.printStackTrace();
            } finally

        }

    }


















    public class records{
        private int clicks;
        private String name;

        public records(int c, String n)
        {
            clicks=c;
            name =n;
        }
        public int getClicks()
        {
            return clicks;
        }
        public String getName()
        {
            return name;
        }
    }
}

