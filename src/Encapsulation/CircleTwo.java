package Encapsulation;

import java.util.Scanner;
 
public class CircleTwo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Radius of Cicle : ");
        double r = sc.nextDouble();
        CircleOne c1 = new CircleOne();
        c1.setRadius(r);
        c1.computeArea();
        c1.computeCircumference();
        c1.computeDiameter();
    }
}
