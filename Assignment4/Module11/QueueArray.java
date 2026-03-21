package Module11;
class QueueArray {
    int front = 0, rear = -1;
    int[] queue = new int[5];

    void enqueue(int x) {
        if (rear == 4) System.out.println("Full");
        else queue[++rear] = x;
    }

    void display() {
        for (int i = front; i <= rear; i++)
            System.out.print(queue[i] + " ");
    }

    public static void main(String[] args) {
        QueueArray q = new QueueArray();
        q.enqueue(10);
        q.enqueue(20);
        q.display();
    }
}