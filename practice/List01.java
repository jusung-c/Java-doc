package practice;

import java.util.ArrayList;
import java.util.Arrays;

public class List01 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("kim");
        list.add("lee");

        String s1 = (String) list.get(0);
        String s2 = (String) list.get(1);

        System.out.println(s1);
        System.out.println(s2);
    }
}
