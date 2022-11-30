package practice;

import java.lang.reflect.Method;

public class ClassLoaderMain {
    public static void main(String[] args) throws Exception {

        // Object o = new Bus();
        String className = "practice.Hi";
        Class clazz = Class.forName(className);
        Object o = clazz.newInstance();

        // a() 메소드 정보를 가지고 있는 Method 반환
        Method m = clazz.getDeclaredMethod("a", null);
        // Object o가 참조하는 객체의 m 메소드를 실행
        m.invoke(o, null);


        /*Method[] declaredMethods = clazz.getDeclaredMethods();
        for (Method m : declaredMethods) {
            System.out.println(m.getName());
        }*/


    }
}
