package Module5;

public class ThrowsExample {

    static void divide() throws ArithmeticException {

        int a = 10 / 0;
    }

    public static void main(String[] args) {

        try {
            divide();
        }

        catch (Exception e) {
            System.out.println("Exception handled");
        }
    }
}