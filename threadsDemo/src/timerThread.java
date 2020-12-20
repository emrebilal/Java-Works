public class timerThread implements Runnable{
    private Thread thread;
    private String threadName;

    public timerThread(String threadName){
        this.threadName = threadName;
        System.out.println("Creating : "+threadName);
    }

    @Override
    public void run() {
        System.out.println("Working : "+threadName);

        try
        {
            for (int i=1;i<=10;i++){
                System.out.println(threadName + " : "+i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException exception){
            System.out.println("Interruptted : "+threadName);
        }

        System.out.println("Thread done : "+ threadName);

    }

    public void start(){
        System.out.println("Creating a thread object");
        if(thread==null){
            thread =new Thread(this,threadName);
            thread.start();
        }
    }
}
