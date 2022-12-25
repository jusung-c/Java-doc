package assets;

import java.io.*;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.*;

public class test {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[][] dots = {{1, 1}, {2, 1}, {2, 2}, {1, 2}};

        int x = 0;
        int y = 0;

        for (int j = 1; j < dots.length; j++) {
            if (dots[0][0] == dots[j][0]) {
                y = dots[0][1] - dots[j][1];
                if (y < 0) y *= -1;
//                System.out.println("y:" + y);
            }

            if (dots[0][1] == dots[j][1]) {
                x = dots[0][0] - dots[j][0];
                if (x < 0) x *= -1;
//                System.out.println("x:"+x);
            }
        }

        System.out.println(x * y);
    }
}
