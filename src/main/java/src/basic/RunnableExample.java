package src.basic;

/**
 * Created by Boxiong on 7/23/17.
 */
public class RunnableExample {
    public static void main(String[] args) {
        Thread myThread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("runnable.");
            }
        });

        Thread myLambda = new Thread(() -> System.out.println("lamda run."));

        myThread.run();
        myLambda.run();
    }
}
