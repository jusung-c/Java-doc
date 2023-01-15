package memo.assets;

import java.io.*;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.*;

public class test {
    public static void main(String[] args) throws IOException {
        File f1 = new File("/tmp/test.txt");
        BufferedReader br = new BufferedReader(new FileReader(f1));

        File f2 = new File("/tmp/Sample.txt");
        BufferedWriter bw = new BufferedWriter(new FileWriter(f2));

        String line = "";
        while ((line = br.readLine()) != null) {
            bw.write(line + "\n");
        }

        PrintWriter pw = new PrintWriter(new OutputStreamWriter(new FileOutputStream("/tmp/tt.txt")));
        

        bw.flush();
        bw.close();
    }
}
