package Encapsulation;

import java.util.Scanner;

public class StudentTwoEncapsulation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Roll Number of Student");
        int i = sc.nextInt();
        System.out.println("Enter Name of Student");
        String s = sc.next();
        System.out.println("Enter Marks of Student");
        double d = sc.nextDouble();
        StudentOneEncapsulation s1 = new StudentOneEncapsulation();
        s1.setData(i, s, d);
        s1.showResult();
    }
}
