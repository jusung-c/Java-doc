package practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class IOExam2 {
    public static void main(String[] args) throws IOException {
        InputStream in = new FileInputStream("/tmp/IOExam01.dat");

        int buf = -1;
        while ((buf = in.read()) != -1) {
            System.out.println(buf);
        }

        in.close();
    }
}
