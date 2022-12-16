package practice;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class HelloIO2 {
    public static void main(String[] args) throws IOException {
        Reader in = new FileReader("/tmp/Hello.txt");

        int buf = -1;
        while ((buf = in.read()) != -1) {
            System.out.println((char)buf);
        }
    }
}
