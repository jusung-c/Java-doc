package practice;

import java.io.*;

public class IO02 {
    public static void main(String[] args) throws IOException {
        // 키보드로부터 한줄씩 입력받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = "";

        // 파일 객체 생성
        File f = new File(args[0]);

        // BufferedWrite 생성자에 넣을 OutputStream 생성
        FileWriter fw = new FileWriter(f);

        // BufferedWrite 생성
        BufferedWriter bw = new BufferedWriter(fw);

        while (true) {
            s = br.readLine();
            if (s.equals("q")) {
                break;
            }
            bw.write(s+"\n");
        }

        bw.flush();
        bw.close();
    }
}
