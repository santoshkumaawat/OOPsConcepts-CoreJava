package Constructors;

public class StudentTwoConstructor {

    public static void main(String[] args) {
        StudentOneConstructor s1 = new StudentOneConstructor(111, "Arun", 88);
        StudentOneConstructor s2 = new StudentOneConstructor(112, "Lalit", 55);
        StudentOneConstructor s3 = new StudentOneConstructor(113, "Akshay", 20);
        StudentOneConstructor s4 = new StudentOneConstructor(114, "Vijay");
        StudentOneConstructor s5 = new StudentOneConstructor(115, "Pawan",33);

        s1.showResult();
        StudentOneConstructor.showGrade(s1);

        s2.showResult();
        StudentOneConstructor.showGrade(s2);

        s3.showResult();
        StudentOneConstructor.showGrade(s3);

        s4.showResult();
        StudentOneConstructor.showGrade(s4);

        s5.showResult();
        StudentOneConstructor.showGrade(s5);

        StudentOneConstructor.showOverAllResult();
        StudentOneConstructor.totalMarks(s1, s2, s3, s4, s5);
        StudentOneConstructor.showAverage(s1, s2, s3, s4, s5);
    }
}
