package Module1;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius");
        double radius=sc.nextDouble();
        double area=3.14*radius*radius;
        System.out.println("area of circle ="+area);
    }
}
