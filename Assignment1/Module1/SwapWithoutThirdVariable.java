package Module1;

public class SwapWithoutThirdVariable {
        public static void main(String[]args){
            int a=3;
            int b=4;
            a=a+b;
            b=a-b;
            a=a-b;
            System.out.println("The swapped numbers are");
            System.out.println(a);
            System.out.println(b);

        }
    }

