package practice;

import java.io.File;
import java.io.IOException;

public class TempFile {
    public static void main(String[] args) {
        try {
            File f = File.createTempFile("tmp_", ".dat");
            System.out.println(f.getAbsolutePath());
            System.out.println("60초 정지");
            try {
                Thread.sleep(60000);     // 60초간 프로그램 정지
            } catch (InterruptedException e1) {
                System.out.println(e1);
            }
            f.deleteOnExit();    // JVM이 종료될 때 임시파일 자동 삭제
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
