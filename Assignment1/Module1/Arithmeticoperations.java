package Module1;

import java.util.Scanner;

public class Arithmeticoperations {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        int n=sc.nextInt();
        System.out.println("Enter the first number");
        int m=sc.nextInt();
        int a=m+n;
        int b=m-n;
        int c=m*n;
        int d=m/n;
        System.out.println("Addition of the two numbers = "+a);
        System.out.println("Subtraction of the two numbers = "+b);
        System.out.println("Multiplication of the two numbers = "+c);
        System.out.println("Division of the two numbers = "+d);
    }
}
