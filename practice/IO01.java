package practice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class IO01 {
    public static void main(String[] args) throws IOException {
        // 파일 객체 생성
        File f = new File("/tmp/Sample.txt");

        // InputStream 생성
        FileReader fr = new FileReader(f);

        BufferedReader br = new BufferedReader(fr);
        String line = "";
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }

    }
}
