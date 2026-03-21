package Module5;
class LifeCycleThread extends Thread {

    public void run() {
        System.out.println("Thread is running");
    }
}
public class ThreadLifeCycle{

    public static void main(String[] args) {

        LifeCycleThread t = new LifeCycleThread();

        System.out.println("Thread state: " + t.getState());

        t.start();

        System.out.println("Thread state after start: " + t.getState());
    }
}
