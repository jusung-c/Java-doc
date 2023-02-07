# Chapter 2. 자바와 절차적/구조적 프로그래밍

### 자바 프로그램의 개발과 구동

| 현실 | 가상 (자바) |
| --- | --- |
| 소프트웨어 개발 도구  | JDK - 자바 개발 도구: JVM용 소프트웨어 개발 도구 |
| 운영체제 | JRE - 자바 실행 환경: JVM용 OS |
| 하드웨어 - 물리적 컴퓨터 | JVM - 자바 가상 기계: 가상의 컴퓨터 |

자바 개발 도구인 JDK를 이용해 개발된 프로그램은 JRE에 의해 가상의 컴퓨터인 JVM 상에서 구동된다.

- 배포시에는 편의상 JDK가 JRE를 포함하고 JRE는 JVM을 포함하는 형태

![출처: [https://www.google.com/url?sa=i&url=https%3A%2F%2Flanguagefight.tistory.com%2F131&psig=AOvVaw2cPRVBgNp-5rWshCmBVZMX&ust=1675746142754000&source=images&cd=vfe&ved=0CBAQjRxqFwoTCJCc7v6OgP0CFQAAAAAdAAAAABAH](https://www.google.com/url?sa=i&url=https%3A%2F%2Flanguagefight.tistory.com%2F131&psig=AOvVaw2cPRVBgNp-5rWshCmBVZMX&ust=1675746142754000&source=images&cd=vfe&ved=0CBAQjRxqFwoTCJCc7v6OgP0CFQAAAAAdAAAAABAH)](Chapter%202%20%E1%84%8C%E1%85%A1%E1%84%87%E1%85%A1%E1%84%8B%E1%85%AA%20%E1%84%8C%E1%85%A5%E1%86%AF%E1%84%8E%E1%85%A1%E1%84%8C%E1%85%A5%E1%86%A8%20%E1%84%80%E1%85%AE%E1%84%8C%E1%85%A9%E1%84%8C%E1%85%A5%E1%86%A8%20%E1%84%91%E1%85%B3%E1%84%85%E1%85%A9%E1%84%80%E1%85%B3%E1%84%85%E1%85%A2%E1%84%86%E1%85%B5%E1%86%BC%20b09c7c7a593f47fc822fff1a70d4f2e3/Untitled.png)

출처: [https://www.google.com/url?sa=i&url=https%3A%2F%2Flanguagefight.tistory.com%2F131&psig=AOvVaw2cPRVBgNp-5rWshCmBVZMX&ust=1675746142754000&source=images&cd=vfe&ved=0CBAQjRxqFwoTCJCc7v6OgP0CFQAAAAAdAAAAABAH](https://www.google.com/url?sa=i&url=https%3A%2F%2Flanguagefight.tistory.com%2F131&psig=AOvVaw2cPRVBgNp-5rWshCmBVZMX&ust=1675746142754000&source=images&cd=vfe&ved=0CBAQjRxqFwoTCJCc7v6OgP0CFQAAAAAdAAAAABAH)

- JDK는 자바 소스 컴파일러 javac.exe를 포함하고 있고, JRE는 자바 프로그램 실행기인 java.exe를 포함하고 있다.

### Java 프로그램이 메모리를 사용하는 방식

- 코드 실행 영역 / 데이터 저장 영역으로 구분
- 객체 지향 프로그램에서는 데이터 저장 영역을 3개의 영역으로 분할해서 사용 (T 메모리 구조)
    1. Static 영역
    2. Stack 영역
    3. Heap 영역

![Untitled](Chapter%202%20%E1%84%8C%E1%85%A1%E1%84%87%E1%85%A1%E1%84%8B%E1%85%AA%20%E1%84%8C%E1%85%A5%E1%86%AF%E1%84%8E%E1%85%A1%E1%84%8C%E1%85%A5%E1%86%A8%20%E1%84%80%E1%85%AE%E1%84%8C%E1%85%A9%E1%84%8C%E1%85%A5%E1%86%A8%20%E1%84%91%E1%85%B3%E1%84%85%E1%85%A9%E1%84%80%E1%85%B3%E1%84%85%E1%85%A2%E1%84%86%E1%85%B5%E1%86%BC%20b09c7c7a593f47fc822fff1a70d4f2e3/Untitled%201.png)

### 자바에 존재하는 절차적/구조적 프로그래밍 유산

- 절차적 프로그래밍 = goto를 쓰지 마!
    - 자바는 goto를 예약어로 등록해놓고 사용하지 못하게끔 해두었다.
    - 자바 공식 문서 goto: not used

goto를 사용하면 프로그램의 실행 순서를 이리저리 조정할 수 있어 매우 복잡해질 가능성이 높기에 자바에서는 사용을 금지한다. 

- 구조적 프로그래밍 = 함수를 쓰자!
    - 중복 코드 한곳에 관리
    - 논리를 함수 단위로 분리해서 가독성 높히기
    - 전역 변수보다는 지역 변수 사용하기

자바의 키워드 중 절반 이상이 절차적/구조적 프로그래밍 언어에서 유래되었다.

### main() 메서드: 메서드 스택 프레임

```java
public class Start {
	public static void main(String[] args) {
			System.out.println("Hello OOP!!");
	}
}
```

**main 메서드가 실행될 때 T 메모리에서 일어나는 일**

1. JRE는 프로그램 안에 main() 메서드가 있는지 확인
2. main()의 존재가 확인되면 JRE는 JVM 부팅 + 메서드 전송
3. 부팅된 JVM은 먼저 전처리 과정
    1. 모든 자바 프로그램이 반드시 포함하게 되는 패키지 java.lang을 T 메모리의 스태틱 영역에 배치
    2. import된 패키지를 T 메모리의 스태틱 영역에 배치
    3. 프로그램 상의 모든 클래스를 T 메모리의 스태틱 영역에 배치

![Untitled](Chapter%202%20%E1%84%8C%E1%85%A1%E1%84%87%E1%85%A1%E1%84%8B%E1%85%AA%20%E1%84%8C%E1%85%A5%E1%86%AF%E1%84%8E%E1%85%A1%E1%84%8C%E1%85%A5%E1%86%A8%20%E1%84%80%E1%85%AE%E1%84%8C%E1%85%A9%E1%84%8C%E1%85%A5%E1%86%A8%20%E1%84%91%E1%85%B3%E1%84%85%E1%85%A9%E1%84%80%E1%85%B3%E1%84%85%E1%85%A2%E1%84%86%E1%85%B5%E1%86%BC%20b09c7c7a593f47fc822fff1a70d4f2e3/Untitled%202.png)

JVM의 전처리 과정이 끝나도 바로 main() 메서드의 첫 줄인 출력 구문이 실행되는 것은 아니다.

1. main() 메서드가 동작하기 위해 main 스택 프레임이 스택 영역에 배치된다. 
- 중괄호를 만날 때마다 스택 프레임이 하나씩 생긴다. (클래스 정의 제외)

![Untitled](Chapter%202%20%E1%84%8C%E1%85%A1%E1%84%87%E1%85%A1%E1%84%8B%E1%85%AA%20%E1%84%8C%E1%85%A5%E1%86%AF%E1%84%8E%E1%85%A1%E1%84%8C%E1%85%A5%E1%86%A8%20%E1%84%80%E1%85%AE%E1%84%8C%E1%85%A9%E1%84%8C%E1%85%A5%E1%86%A8%20%E1%84%91%E1%85%B3%E1%84%85%E1%85%A9%E1%84%80%E1%85%B3%E1%84%85%E1%85%A2%E1%84%86%E1%85%B5%E1%86%BC%20b09c7c7a593f47fc822fff1a70d4f2e3/Untitled%203.png)

1. 메서드의 인자 args를 저장할 변수 공간을 스택 프레임의 맨 밑에 확보해야 한다. 
- 메서드 인자들의 변수 공간 할당

![Untitled](Chapter%202%20%E1%84%8C%E1%85%A1%E1%84%87%E1%85%A1%E1%84%8B%E1%85%AA%20%E1%84%8C%E1%85%A5%E1%86%AF%E1%84%8E%E1%85%A1%E1%84%8C%E1%85%A5%E1%86%A8%20%E1%84%80%E1%85%AE%E1%84%8C%E1%85%A9%E1%84%8C%E1%85%A5%E1%86%A8%20%E1%84%91%E1%85%B3%E1%84%85%E1%85%A9%E1%84%80%E1%85%B3%E1%84%85%E1%85%A2%E1%84%86%E1%85%B5%E1%86%BC%20b09c7c7a593f47fc822fff1a70d4f2e3/Untitled%204.png)

1. main() 메서드 안 명령문 실행
- 메모리에서 코드 실행 공간은 별도로 있었기에 T 메모리에는 변화가 없다.

1. main 메서드의 끝을 나타내는 닫는 중괄호와 만나면 스택 프레임이 소멸된다.
2. JRE는 JVM을 종료하고 JRE 자체도 운영체제 상의 메모리에서 사라진다.
3. T 메모리도 소멸

### 변수와 메모리

```java
public class Start {
	public static void main(String[] args) {
		int i;
		
		i = 10;

		double d = 20.0;
	}
}
```

**변수 메모리 할당 과정**

![Untitled](Chapter%202%20%E1%84%8C%E1%85%A1%E1%84%87%E1%85%A1%E1%84%8B%E1%85%AA%20%E1%84%8C%E1%85%A5%E1%86%AF%E1%84%8E%E1%85%A1%E1%84%8C%E1%85%A5%E1%86%A8%20%E1%84%80%E1%85%AE%E1%84%8C%E1%85%A9%E1%84%8C%E1%85%A5%E1%86%A8%20%E1%84%91%E1%85%B3%E1%84%85%E1%85%A9%E1%84%80%E1%85%B3%E1%84%85%E1%85%A2%E1%84%86%E1%85%B5%E1%86%BC%20b09c7c7a593f47fc822fff1a70d4f2e3/Untitled%205.png)

만약 변수 i를 초기화하지 않고 사용한다면 자바 컴파일러(javac)는 다음과 같은 오류를 발생시킨다.

```java
"The local variable i may not have been initialized"
```

### 블록 구문과 메모리: 블록 스택 프레임

```java
public class Start {
    public static void main(String[] args) {
        int i = 10;
        int k = 20;

        if (i == 10) {
            int m = k + 5;
            k = m;
        } else {
            int p = k + 10;
            k = p;
        }
    }
}
```

- if 구문 진입

![Untitled](Chapter%202%20%E1%84%8C%E1%85%A1%E1%84%87%E1%85%A1%E1%84%8B%E1%85%AA%20%E1%84%8C%E1%85%A5%E1%86%AF%E1%84%8E%E1%85%A1%E1%84%8C%E1%85%A5%E1%86%A8%20%E1%84%80%E1%85%AE%E1%84%8C%E1%85%A9%E1%84%8C%E1%85%A5%E1%86%A8%20%E1%84%91%E1%85%B3%E1%84%85%E1%85%A9%E1%84%80%E1%85%B3%E1%84%85%E1%85%A2%E1%84%86%E1%85%B5%E1%86%BC%20b09c7c7a593f47fc822fff1a70d4f2e3/Untitled%206.png)

**외부 스택 프레임에서 내부 스택 프레임의 변수에 접근하는 것은 불가능하지만 그 역은 가능하다.**

### 지역 변수와 메모리: 스택 프레임

- 변수는 T 메모리 3 영역 모두에 존재할 수 있다.
- 지역변수: 스택 영역(스택 프레임 영역)
    - 스택 프레임이 사라지면 같이 사라진다.
- 클래스 멤버 변수: 스태틱 영역
    - JVM이 종료될 때까지 고정된(static) 상태로 존재
- 객체 멤버 변수: 힙 영역
    - 객체와 함께 GC에 의해 소멸

### 메서드 호출과 메모리

- 메서드를 호출할 때마다 해당 메서드의 스택 프레임이 생성된다.

```java
public class Start {
    public static void main(String[] args) {
        int k = 5;
        int m;

        m =square(k);

    }
    private static int square(int k) {
        int result;
        k = 25;
        result = k;

        return result;
    }
}

```

- 메서드 호출 과정
    
     1. 스태틱 영역
    

![Untitled](Chapter%202%20%E1%84%8C%E1%85%A1%E1%84%87%E1%85%A1%E1%84%8B%E1%85%AA%20%E1%84%8C%E1%85%A5%E1%86%AF%E1%84%8E%E1%85%A1%E1%84%8C%E1%85%A5%E1%86%A8%20%E1%84%80%E1%85%AE%E1%84%8C%E1%85%A9%E1%84%8C%E1%85%A5%E1%86%A8%20%E1%84%91%E1%85%B3%E1%84%85%E1%85%A9%E1%84%80%E1%85%B3%E1%84%85%E1%85%A2%E1%84%86%E1%85%B5%E1%86%BC%20b09c7c7a593f47fc822fff1a70d4f2e3/Untitled%207.png)

1. 스택 영역

![Untitled](Chapter%202%20%E1%84%8C%E1%85%A1%E1%84%87%E1%85%A1%E1%84%8B%E1%85%AA%20%E1%84%8C%E1%85%A5%E1%86%AF%E1%84%8E%E1%85%A1%E1%84%8C%E1%85%A5%E1%86%A8%20%E1%84%80%E1%85%AE%E1%84%8C%E1%85%A9%E1%84%8C%E1%85%A5%E1%86%A8%20%E1%84%91%E1%85%B3%E1%84%85%E1%85%A9%E1%84%80%E1%85%B3%E1%84%85%E1%85%A2%E1%84%86%E1%85%B5%E1%86%BC%20b09c7c7a593f47fc822fff1a70d4f2e3/Untitled%208.png)

square() 메서드를 여러번 호출한다면 매번 square() 메서드 스택 프레임이 만들어졌다 사라질 것이다. 만들어질 때마다 지역변수 result는 별개의 변수로 생성된다. 

**메서드의 블랙박스화**

- main() 메서드와 square() 메서드는 서로의 지역 변수에 접근할 수 없다.
- 입력 값들(인자 리스트)와 반환 값에 의해서만 메서드 사이에서 값이 전달될 뿐이다.
    - 메서드를 호출하면서 인자로 전달되는 것은 변수 자체가 아닌 값만을 복제해 전달한다.  이를 값에 의한 전달이라고 해서 Call By Value라고 한다.

![Untitled](Chapter%202%20%E1%84%8C%E1%85%A1%E1%84%87%E1%85%A1%E1%84%8B%E1%85%AA%20%E1%84%8C%E1%85%A5%E1%86%AF%E1%84%8E%E1%85%A1%E1%84%8C%E1%85%A5%E1%86%A8%20%E1%84%80%E1%85%AE%E1%84%8C%E1%85%A9%E1%84%8C%E1%85%A5%E1%86%A8%20%E1%84%91%E1%85%B3%E1%84%85%E1%85%A9%E1%84%80%E1%85%B3%E1%84%85%E1%85%A2%E1%84%86%E1%85%B5%E1%86%BC%20b09c7c7a593f47fc822fff1a70d4f2e3/Untitled%209.png)

### 전역 변수와 메모리

**메서드 사이 값을 전달하는 방법**

1. 메서드 호출 시 메서드의 인자 이용
2. 메서드 종료 시 반환 값 이용
3. 전역 변수

```java
public class Start {
    static int share;

    public static void main(String[] args) {
        share = 5;
        int k = fun(5, 7);

        System.out.println(share);
    }

    private static int fun(int m, int p) {
        share = m + p;
        return m - p;
    }
}
```

![Untitled](Chapter%202%20%E1%84%8C%E1%85%A1%E1%84%87%E1%85%A1%E1%84%8B%E1%85%AA%20%E1%84%8C%E1%85%A5%E1%86%AF%E1%84%8E%E1%85%A1%E1%84%8C%E1%85%A5%E1%86%A8%20%E1%84%80%E1%85%AE%E1%84%8C%E1%85%A9%E1%84%8C%E1%85%A5%E1%86%A8%20%E1%84%91%E1%85%B3%E1%84%85%E1%85%A9%E1%84%80%E1%85%B3%E1%84%85%E1%85%A2%E1%84%86%E1%85%B5%E1%86%BC%20b09c7c7a593f47fc822fff1a70d4f2e3/Untitled%2010.png)

- 프로젝트 규모가 커지면서 여러 메서드에서 전역 변수의 값을 변경하기 시작하면 T 메모리로 추적하지 않는 이상 전역 변수에 저장돼 있는 값을 파악하기 쉽지 않기 때문에 전역변수는 쓰지 않는 것이 좋다.
- 수정할 일이 없는 읽기 전용인 변수는 전역 변수로 공유하는 것이 좋다.

### 멀티 스레드 / 멀티 프로세스

**멀티 스레드(Multi Tread)**

![출처: [https://www.google.com/url?sa=i&url=https%3A%2F%2Fjuneyr.dev%2Fjava-things&psig=AOvVaw11ClBhJx_qtGVAQna3QjxF&ust=1675755386239000&source=images&cd=vfe&ved=0CBAQjRxqFwoTCOjN3bexgP0CFQAAAAAdAAAAABAP](https://www.google.com/url?sa=i&url=https%3A%2F%2Fjuneyr.dev%2Fjava-things&psig=AOvVaw11ClBhJx_qtGVAQna3QjxF&ust=1675755386239000&source=images&cd=vfe&ved=0CBAQjRxqFwoTCOjN3bexgP0CFQAAAAAdAAAAABAP)](Chapter%202%20%E1%84%8C%E1%85%A1%E1%84%87%E1%85%A1%E1%84%8B%E1%85%AA%20%E1%84%8C%E1%85%A5%E1%86%AF%E1%84%8E%E1%85%A1%E1%84%8C%E1%85%A5%E1%86%A8%20%E1%84%80%E1%85%AE%E1%84%8C%E1%85%A9%E1%84%8C%E1%85%A5%E1%86%A8%20%E1%84%91%E1%85%B3%E1%84%85%E1%85%A9%E1%84%80%E1%85%B3%E1%84%85%E1%85%A2%E1%84%86%E1%85%B5%E1%86%BC%20b09c7c7a593f47fc822fff1a70d4f2e3/Untitled%2011.png)

출처: [https://www.google.com/url?sa=i&url=https%3A%2F%2Fjuneyr.dev%2Fjava-things&psig=AOvVaw11ClBhJx_qtGVAQna3QjxF&ust=1675755386239000&source=images&cd=vfe&ved=0CBAQjRxqFwoTCOjN3bexgP0CFQAAAAAdAAAAABAP](https://www.google.com/url?sa=i&url=https%3A%2F%2Fjuneyr.dev%2Fjava-things&psig=AOvVaw11ClBhJx_qtGVAQna3QjxF&ust=1675755386239000&source=images&cd=vfe&ved=0CBAQjRxqFwoTCOjN3bexgP0CFQAAAAAdAAAAABAP)

- 스택 영역을 스레드 개수만큼 분할해서 사용
- 하나의 T 메모리만 사용하는데 스택 영역만 분할해서 사용하는 구조
- 하나의 스레드에서 다른 스레드의 스택 영역에는 접근할 수 없지만 스태틱, 힙 영역은 공유
    - 메모리 사용량 아낄 수 있는 구조

**멀티 프로세스(Multi Process)**

![출처: [https://www.google.com/url?sa=i&url=https%3A%2F%2Ftwinparadox.tistory.com%2F614&psig=AOvVaw11ClBhJx_qtGVAQna3QjxF&ust=1675755386239000&source=images&cd=vfe&ved=0CBAQjRxqGAoTCOjN3bexgP0CFQAAAAAdAAAAABDlAw](https://www.google.com/url?sa=i&url=https%3A%2F%2Ftwinparadox.tistory.com%2F614&psig=AOvVaw11ClBhJx_qtGVAQna3QjxF&ust=1675755386239000&source=images&cd=vfe&ved=0CBAQjRxqGAoTCOjN3bexgP0CFQAAAAAdAAAAABDlAw)](Chapter%202%20%E1%84%8C%E1%85%A1%E1%84%87%E1%85%A1%E1%84%8B%E1%85%AA%20%E1%84%8C%E1%85%A5%E1%86%AF%E1%84%8E%E1%85%A1%E1%84%8C%E1%85%A5%E1%86%A8%20%E1%84%80%E1%85%AE%E1%84%8C%E1%85%A9%E1%84%8C%E1%85%A5%E1%86%A8%20%E1%84%91%E1%85%B3%E1%84%85%E1%85%A9%E1%84%80%E1%85%B3%E1%84%85%E1%85%A2%E1%84%86%E1%85%B5%E1%86%BC%20b09c7c7a593f47fc822fff1a70d4f2e3/Untitled%2012.png)

출처: [https://www.google.com/url?sa=i&url=https%3A%2F%2Ftwinparadox.tistory.com%2F614&psig=AOvVaw11ClBhJx_qtGVAQna3QjxF&ust=1675755386239000&source=images&cd=vfe&ved=0CBAQjRxqGAoTCOjN3bexgP0CFQAAAAAdAAAAABDlAw](https://www.google.com/url?sa=i&url=https%3A%2F%2Ftwinparadox.tistory.com%2F614&psig=AOvVaw11ClBhJx_qtGVAQna3QjxF&ust=1675755386239000&source=images&cd=vfe&ved=0CBAQjRxqGAoTCOjN3bexgP0CFQAAAAAdAAAAABDlAw)

- 다수의 데이터 저장 영역, 즉 다수의 T 메모리를 갖는 구조
- 각 프로세스마다 각자의 T 메모리가 있고 서로 참조할 수 없다.
    - 서로 참조할 수 없어서 안전하지만 그만큼 메모리 사용량이 크다.

> 웹 프로그래밍할 때 서블릿은 요청당 프로세스가 아닌 요청당 스레드를 생성한다는 말이 있다. 요청당 스레드(Servlet)가 요청당 프로세스(CGI) 보다 왜 더 효율적인 지 알 수 있다.
> 

**멀티 스레드에서 전역변수 사용 시 문제점**

- 각 스레드가 전역 변수를 수정했을 때 스레드마다 예상 값이 달라지면서 스레드 안전성이 깨진다.
- 락을 거는 방법이 있긴 하지만 멀티 스레드의 장점이 사라진다.