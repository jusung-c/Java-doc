package assets;

import java.io.*;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.*;

public class test {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] spell = {"z", "d", "x"};
        String[] dic = {"def", "dww", "dzx", "loveaw"};
        int answer = 2;

        for(int i=0; i<dic.length; i++) {
            Set<Character> arr = new HashSet<>();
            for(int j=0; j<dic[i].length(); j++) {
                for(int k=0; k<spell.length; k++) {
                    char c = dic[i].charAt(j);
                    if(c == spell[k].charAt(0)){
                        arr.add(c);
                    }
                }
            }
            if (arr.size() == spell.length) {
                answer = 1;
            }
        }


        System.out.println(answer);
    }
}
