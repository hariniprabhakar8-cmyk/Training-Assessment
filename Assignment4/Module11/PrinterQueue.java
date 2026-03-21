package Module11;
import java.util.LinkedList;
import java.util.Queue;

public class PrinterQueue {
    public static void main(String[] args) {
        Queue<String> q = new LinkedList<>();

        q.add("Doc1");
        q.add("Doc2");
        q.add("Doc3");

        while (!q.isEmpty()) {
            System.out.println("Printing: " + q.poll());
        }
    }
}