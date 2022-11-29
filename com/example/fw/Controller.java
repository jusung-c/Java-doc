package com.example.fw;

/*
Controller의 종류가 여러가지인 상황.
모든 Controller는 초기화 - 실행 - 마무리 단계로 구현되고, 초기화와 마무리 과정의 코드는 모두 동일하다.
일일히 초기화 - 마무리 코드는 항상 사용되고 수정되면 안되기에 추상클래스의 추상메소드로 등록해서 사용한다.
*/
public abstract class Controller {
    protected final void init() {
        System.out.println("초기화");
    }

    protected final void close() {
        System.out.println("마무리");
    }

    // Controller마다 매번 달라지는 코드
    protected abstract void run();

    // 내가 가지고 있는 메소드를 호출한다.
    // 어떤 순서를 가지고 있다. 이런 메소드를 템플릿 메소드라고 한다.
    public void execute() {
        // 초기화
        this.init();
        // 실행
        this.run();
        // 마무리
        this.close();
    }
}
