package practice;

import java.io.IOException;
import java.io.InputStream;

public class InputStreamExam01 {
    public static void main(String[] args) {
        InputStream in = null;
        try {
            int data = in.read();
        } catch (IOException exception) {
            System.out.println("io 오류: " + exception);
        } finally {
            try {
                in.close();
            } catch (Exception e2) {
                System.out.println("io 오류: " + e2);
            }
        }
    }
}
