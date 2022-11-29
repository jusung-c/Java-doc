package practice;

/*
1. 1~45까지 써있는 Ball을 로또 기계에 넣는다.
2. 로또 기계에 있는 Ball들을 섞는다.
3. 섞인 Ball중 6개를 꺼낸다.
 */
public interface LottoMachine {
    public static int MAX_BALL_COUNT = 45;
    public static int RETURN_BALL_COUNT = 6;

    // 45개 Ball 받기
    public abstract void setBalls(Ball[] balls);

    // Ball 섞기
    public abstract void mix();

    // 6개 Ball 반호나
    public abstract Ball[] getBalls();
}
