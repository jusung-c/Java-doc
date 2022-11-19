## Hello.java 파일 분석

```java
public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello");
    }
}
```

* `public class Hello { ... }`
  * public class로 정의된 Hello class
  * 클래스는 Field와 Method를 가질 수 있다.
    * 자바에서는 함수를 메소드라고 한다.


* `public static void main(String[] arg) { ... }`
  * 프로그램을 실행하려면 반드시 가져야 하는 main 메소드로 프로그램 시작점을 뜻함


* `System.out.println("Hello");`
  * 자바에서 첫글자가 대문자면 클래스라고 생각하면 된다.
  * System 클래스의 out 필드의 println 메소드를 사용한 예시이다.
  * System의 구성을 알려면 [java API 문서](https://docs.oracle.com/javase/8/docs/api/java/lang/System.html)를 살펴봐야 한다.


## 컴파일


* 컴파일을 하려면 javac라는 프로그램이 필요하다.
  * javac: 자바 컴파일러
* `javac Hello.java`
  * Hello.java 파일 컴파일 후 성공하면 Hello.class 파일 생성, 실패하면 오류메세지
  * Hello.class: byte 파일로 구성
    * byte 코드 : 작성된 소스 코드를 JVM이 이해할 수 있는 중간 코드로 컴파일한 것을 말한다. JVM은 이 byte 코드를 한줄씩 읽어들이면서 각각의 하드웨어 아키텍처에 맞는 기계어로 바꿔가며 실행한다.(Interpreter 방식)

> C언어는 컴파일을 하면 기계어로 바로 바뀌지만 CPU마다 다른 명령어들을 가지고 있기 때문에 문제가 생길 수 있다. 하지만 자바는 CPU에 상관없이 여러 컴퓨터에서 실행될 수 있도록 바로 기계어로 바꾸지 않고 byte 코드로 바꾼 후에 기계어로 바꾸는 과정을 거친다. 이것이 가능한 이유는 Java에서 제공하는 JVM이 각 운영체제에 맞게 제공되기 때문이다. (M1 CPU용, Intel CPU용...)
