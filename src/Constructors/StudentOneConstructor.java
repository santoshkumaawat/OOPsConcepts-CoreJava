package Constructors;

public class StudentOneConstructor {

    private int rollNum;
    private String name;
    private double marks;
    private static int totalPass, totalFail;
    private static double total;

    public static double calculateTotalMarks(StudentOneConstructor... v) {
        int n = v.length;
        total = 0;
        for (int i = 0; i < n; i++) {
            total = total + v[i].marks;
        }
        return total;
    }

    public static void totalMarks(StudentOneConstructor... v) {
        calculateTotalMarks(v);
        int n2 = v.length;
        System.out.println("Total Marks of " + n2 + " Student is :" + total);
    }

    public static void showAverage(StudentOneConstructor... v) {
        calculateTotalMarks(v);
        int n2 = v.length;
        System.out.println("Average of " + n2 + " Student is : " + (total / n2));
    }

    public static void showGrade(StudentOneConstructor stud) {
        String grade = "";
        if (stud.marks > 90) {
            grade = "A+";
        } else if (stud.marks > 80) {
            grade = "A";
        } else if (stud.marks > 70) {
            grade = "B+";
        } else if (stud.marks > 60) {
            grade = "B";
        } else if (stud.marks > 50) {
            grade = "C+";
        } else if (stud.marks > 40) {
            grade = "C";
        } else if (stud.marks >= 33) {
            grade = "D";
        } else {
            grade = "E";
        }
        System.out.println("Grade : " + grade);
        System.out.println("------------------------------------");
        System.out.println("------------------------------------");
    }

    public static void showOverAllResult() {
        System.out.println("Total Number of Pass Candidate : " + totalPass);
        System.out.println("Total Number of Fail Candidate : " + totalFail);
    }

    public void showResult() {
        System.out.println("Roll Number : " + rollNum);
        System.out.println("Name : " + name);
        System.out.println("Marks Obtained : " + marks);

        if (marks >= 33 && marks <= 100) {
            System.out.println("Result : PASSED");
            totalPass++;
        } else if (marks < 33 && marks >= 0) {
            System.out.println("Result : FAILED");
            totalFail++;
        } else {
            System.out.println("Invalid Marks Input");
        }
    }

    public StudentOneConstructor(int p, String q) {
        rollNum = p;
        name = q;
    }

    public StudentOneConstructor(int a, String b, double c) {
        this(a, b);
        marks = c;
    }
}
