package Module3;

import java.util.Scanner;

public class Student {

    String name;
    int marks;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student s = new Student();

        System.out.print("Enter name: ");
        s.name = sc.nextLine();

        System.out.print("Enter marks: ");
        s.marks = sc.nextInt();
        s.display();


    }
}