package assets;

import java.io.*;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.*;

public class test {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] sides = {11, 7};

        int answer = 0;

        // 가장 긴 변이 주어진 경우
        Arrays.sort(sides);

        for (int i = 1; i <= sides[1]; i++) {
            if (sides[0] + i > sides[1]) {
                answer++;
            }
        }

        // 아닌 경우
        for (int i = sides[1] + 1; i < sides[0] + sides[1]; i++) {
            answer++;
        }

        System.out.println(answer);

    }
}
