package practice;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class HelloIO {
    public static void main(String[] args) throws IOException {

        Writer out = new FileWriter("/tmp/Hello.txt");
        out.write((int) 'ㄱ');
        out.write((int) 'ㄴ');
        out.write((int) 'ㄷ');
        out.close();


    }
}
