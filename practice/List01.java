package practice;

import java.util.*;


/**
 * List 인터페이스 실습
 *
 * @author jus
 * @since 22.12.10
 * @version 1.0
 *
 */

public class List01 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("kim");
        list.add("lee");
        list.add("hong");

        Collections.sort(list);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
