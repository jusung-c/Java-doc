package assets;

import java.io.*;
import java.math.BigInteger;

public class test {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int balls = Integer.parseInt(br.readLine());
        int share = Integer.parseInt(br.readLine());


        BigInteger answer = fac(balls).divide(fac(balls-share).multiply(fac(share)));

        System.out.println(answer);

        bw.close();
    }

    // fac(5)
    // 5 * fac(4)
    // 5* 4* fac(3)

    public static BigInteger fac(int n) {
        if (n<=1) return BigInteger.ONE;
        else return fac(n - 1).multiply(new BigInteger("" + n));
    }
}
