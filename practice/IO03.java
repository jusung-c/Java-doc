package practice;

import java.io.*;

public class IO03 {
    public static void main(String[] args) throws IOException {
        // 입력받을 파일 객체 생성
        File f1 = new File("/tmp/Sample.txt");

        // FileReader 생성 - 주인공
        FileReader fr = new FileReader(f1);

        // BufferedReader 생성 - 데코레이터
        BufferedReader br = new BufferedReader(fr);

        // 출력할 파일 객체 생성
        File f2 = new File("/tmp/Sample02.txt");

        // FileWriter 생성 - 주인공
        FileWriter fw = new FileWriter(f2);

        // BufferedWriter 생성 - 데코레이터
        BufferedWriter bw = new BufferedWriter(fw);

        String line = "";
        while ((line = br.readLine()) != null) {
            bw.write(line + "\n");
        }

        bw.flush();
        bw.close();
    }
}
