package practice;

public class LottoMachineMain {
    public static void main(String[] args) {
        // Ball 인스턴스를 45개 참조할 수 있는 배열 생성
        // 아직 Ball 인스턴스를 생성한 것이 아닌 Ball을 참조할 수 있는 참조변수 45개를 만든 것이다.
        Ball[] balls = new Ball[LottoMachine.MAX_BALL_COUNT];
        for (int i = 0; i < LottoMachine.MAX_BALL_COUNT; i++) {
            balls[i] = new Ball(i + 1);
        }

        // LottoMachine 인스턴스 생성
        LottoMachine lottoMachine = new LottoMachineImpl();
        lottoMachine.setBalls(balls);
        lottoMachine.mix();
        Ball[] result = lottoMachine.getBalls();

        // 당첨 공번호 출력
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i].getNumber());
        }
    }
}
