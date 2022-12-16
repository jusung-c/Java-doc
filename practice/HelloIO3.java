package practice;

import java.io.*;

public class HelloIO3 {
    public static void main(String[] args) throws IOException {
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("/tmp/my.txt")));

        out.write("hello!!");
        out.write("hi!!");
        out.write("hell!!");

        out.close();
    }
}
