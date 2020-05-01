package Constructors;

/**
 * ConstructorOne With setData(); method which is assign a value to x and y. and
 * when we need to access x and y we have to call setData method by object.
 */
public class ConstructorOne {

    private int x, y;

    //Constructors
    ConstructorOne() {
        System.out.println("Zero Argument Constructor");
    }

    ConstructorOne(int a) {
        System.out.println("One Argument Constructor : " + a);
    }

    ConstructorOne(int a, int b) {
        System.out.println("Two Argument Constructor : " + a + "," + b);
    }

    ConstructorOne(String a, String b) {
        System.out.println("Two String Type Argument Constructor : " + a + " " + b);
    }

    //Methods
    public void setData(int a, int b) {
        x = a;
        y = b;
    }

    public void showData() {
        System.out.println(x + "," + y);

    }

    //Main Method
    public static void main(String[] args) {
        ConstructorOne ob1 = new ConstructorOne();
        ConstructorOne ob2 = new ConstructorOne(10);
        ConstructorOne ob3 = new ConstructorOne(10, 20);
        ConstructorOne ob4 = new ConstructorOne("Santosh", "Kumawat");
        ob1.setData(10, 20); //here we have to call setData method for accessing value of x and y.
        ob2.setData(30, 40);
        ob1.showData();
        ob2.showData();
    }
}
