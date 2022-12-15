package practice;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class KeyboardIO {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line = null;

        while ((line = br.readLine()) != null) {
            System.out.println("읽어들인 값: " + line);
        }
    }
}
