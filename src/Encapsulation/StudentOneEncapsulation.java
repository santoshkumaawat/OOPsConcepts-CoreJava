package Encapsulation;

public class StudentOneEncapsulation {

    private int rollNum;
    private String name;
    private double marks;

    public void setData(int a, String b, double c) {
        rollNum = a;
        name = b;
        marks = c;
    }

    public void showResult() {
        System.out.println("Roll Number :" + rollNum);
        System.out.println("Name :" + name);
        System.out.println("Marks :" + marks);
        if (marks >= 33 && marks <= 100) {
            System.out.println("PASSED");
        } else if (marks < 33 && marks >= 0) {
            System.out.println("FAILED");
        } else {
            System.out.println("Invalid Marks Input");
        }
    }
}
