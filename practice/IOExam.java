package practice;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class IOExam {
    public static void main(String[] args) throws IOException {
        OutputStream out = new FileOutputStream("/tmp/IOExam01.dat");
        out.write(1);
        out.write(255);
        out.write(0);

        out.close();
    }
}
