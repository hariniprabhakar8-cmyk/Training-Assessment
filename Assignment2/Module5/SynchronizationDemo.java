package Module5;

class Counter {

    int count = 0;

    synchronized void increment() {
        count++;
    }
}

public class SynchronizationDemo {

    public static void main(String[] args) {

        Counter c = new Counter();

        c.increment();
        c.increment();

        System.out.println("Counter: " + c.count);
    }
}