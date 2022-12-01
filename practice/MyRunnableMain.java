package practice;

public class MyRunnableMain {
    public static void main(String[] args) {

        RunnableExecute runnableExecute = new RunnableExecute();
        System.out.println("---------------------------");
        runnableExecute.execute(()->{
            System.out.println("run!!");
        });
        System.out.println("---------------------------");
    }
}
