package Module11;
class StackArray {
    int top = -1;
    int[] stack = new int[5];

    void push(int x) {
        if (top == 4) System.out.println("Overflow");
        else stack[++top] = x;
    }

    void display() {
        for (int i = top; i >= 0; i--)
            System.out.print(stack[i] + " ");
    }

    public static void main(String[] args) {
        StackArray s = new StackArray();
        s.push(10);
        s.push(20);
        s.display();
    }
}