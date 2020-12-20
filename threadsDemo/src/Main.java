public class Main {

    public static void main(String[] args) {
        timerThread thread_1 = new timerThread("thread_1");
        timerThread thread_2 = new timerThread("thread_2");
        timerThread thread_3 = new timerThread("thread_3");

        thread_1.start();
        thread_2.start();
        thread_3.start();
    }
}
