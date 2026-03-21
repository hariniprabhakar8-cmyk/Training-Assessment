package Module3;

import java.util.Scanner;

public class square {
    int square(int n)
    {
        return n*n;
    }
    public static void main(String[]args){
        square ob=new square();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        System.out.println(ob.square(n));
    }
}


