package Constructors;

//Use of this keyword.
public class ThisKeyword {

    public ThisKeyword() {
        this(10);
        System.out.println("Welcome to the World of Java.");
    }

    public ThisKeyword(int a) {
        this("Santosh");
        System.out.println("How Are You?");
    }

    public ThisKeyword(String name) {
        System.out.println("Hello " + name);
    }

    public static void main(String[] args) {
        ThisKeyword ob = new ThisKeyword();
    }
}
