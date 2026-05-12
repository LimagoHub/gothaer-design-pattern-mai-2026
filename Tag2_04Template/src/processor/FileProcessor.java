package processor;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;

public abstract class FileProcessor {

    public final void run(String filename){


        try (FileReader fileReader = new FileReader(filename)){
            init();
            int c;
            while ((c = fileReader.read()) != -1){
                process((char)c);
            }
            dipose();

        } catch(Exception e){
            e.printStackTrace();
        }
    }

    public void init() {

    }

    public void dipose() {

    }

    public abstract void process(char c);
}
