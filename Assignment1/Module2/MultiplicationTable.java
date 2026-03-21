package Module2;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i;
        for(i=1;i<=10;i++)
        {
            int a=n*i;
            System.out.println(n+ "x"+i+"="+a);
        }
    }
}
