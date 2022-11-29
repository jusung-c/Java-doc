package practice;

// 생성자에서 초기값을 넘겨서 필드를 초기화해주고 값을 리턴만 해주는 것을 불변 객체라고 했다.
public class Ball {
    private int number;    // 외부에서 변경할 수 없도록 private

    // 공은 생성될 때부터 숫자를 가지고 태어나고 바뀌면 안된다. - 불변
    public Ball(int number) {
        this.number = number;
    }

    // 외부에 숫자를 알려주기 위해 getter 생성
    public int getNumber() {
        return number;
    }
}
