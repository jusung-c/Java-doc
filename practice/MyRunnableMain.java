package practice;

import java.util.Arrays;

public class MyRunnableMain {
    public static void main(String[] args) {

        char[] From = {'h', 'e', 'l', 'l', 'o', '!'};
        char[] To = Arrays.copyOfRange(From, 1, 3);

        for (char c : To) {
            System.out.println(c);
        }

    }
}
