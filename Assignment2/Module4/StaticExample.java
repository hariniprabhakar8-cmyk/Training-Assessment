package Module4;
public class StaticExample {

    static int count = 0;

    StaticExample() {
        count++;
    }

    static void showCount() {
        System.out.println("Total objects: " + count);
    }

    public static void main(String[] args) {

        new StaticExample();
        new StaticExample();
        new StaticExample();

        showCount();
    }
}
