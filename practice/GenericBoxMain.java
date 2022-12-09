package practice;

public class GenericBoxMain {
    public static void main(String[] args) {
        GenericBox<String> genericBox = new GenericBox<>();
        genericBox.add("kim");
        String str = genericBox.getT();
        System.out.println(str.toUpperCase());

        // genericBox.add(new Integer(5)); String이 아니기 때문에 컴파일 오류 발생
    }
}
