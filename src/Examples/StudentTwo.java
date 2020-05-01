package Examples;

public class StudentTwo {

    public static void main(String[] args) {
        StudentOne s1 = new StudentOne();
        StudentOne s2 = new StudentOne();
        StudentOne s3 = new StudentOne();
        StudentOne s4 = new StudentOne();
        StudentOne s5 = new StudentOne();
        StudentOne s6 = new StudentOne();
        StudentOne s7 = new StudentOne();
        StudentOne s8 = new StudentOne();
        StudentOne s9 = new StudentOne();
        StudentOne s10 = new StudentOne();

        s1.setData(111, "Arun", 88);
        s1.showResult();
        StudentOne.showGrade(s1);

        s2.setData(112, "Lalit", 55);
        s2.showResult();
        StudentOne.showGrade(s2);

        s3.setData(113, "Akshay", 58);
        s3.showResult();
        StudentOne.showGrade(s3);

        s4.setData(114, "Vijay", 76);
        s4.showResult();
        StudentOne.showGrade(s4);

        s5.setData(115, "Pawan", 56);
        s5.showResult();
        StudentOne.showGrade(s5);

        s6.setData(116, "Neeraj", 59);
        s6.showResult();
        StudentOne.showGrade(s6);

        s7.setData(117, "Pankaj", 26);
        s7.showResult();
        StudentOne.showGrade(s7);

        s8.setData(118, "Ajay", 66);
        s8.showResult();
        StudentOne.showGrade(s8);

        s9.setData(119, "Vinay", 30);
        s9.showResult();
        StudentOne.showGrade(s9);

        s10.setData(120, "Shubham", 35);
        s10.showResult();
        StudentOne.showGrade(s10);

        StudentOne.showOverAllResult();
        StudentOne.showAverage(s1, s2, s3, s4, s5, s6, s7, s8, s9, s10);
        StudentOne.showAverage(s1, s2, s3, s4, s5);
    }
}
