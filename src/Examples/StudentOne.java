package Examples;

public class StudentOne {

    private int rollNum;
    private String name;
    private double marks;
    private static int totalPass, totalFail;

    public static void showAverage(StudentOne... v) {
        int n = v.length;
        double total = 0;
        for (int i = 0; i < n; i++) {
            total = total + v[i].marks;
        }
        System.out.println("Average of " + n + " Student Is : " + (total / n));
    }

    public static void showGrade(StudentOne stud) {
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

    public void setData(int a, String b, double c) {
        rollNum = a;
        name = b;
        marks = c;
    }
}
