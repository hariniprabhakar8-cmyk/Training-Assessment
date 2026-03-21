package Module3;

public class calculator {
    int add(int a, int b) {
        return a + b;
    }

    int subtract(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {

        calculator calc = new calculator();

        int sum = calc.add(10, 5);
        int difference = calc.subtract(10, 5);

        System.out.println("Addition: " + sum);
        System.out.println("Subtraction: " + difference);
    }
}