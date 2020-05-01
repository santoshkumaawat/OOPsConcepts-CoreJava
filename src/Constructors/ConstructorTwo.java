package Constructors;

/**
 * This class is for Constructor without setData(); Method. and we assign x and
 * y directly by constructor. so we don't need to write setData method.
 */
public class ConstructorTwo {

    private int x, y;

    ConstructorTwo() {
        System.out.println("Zero Argument Constructor");
    }

    public ConstructorTwo(int a, int b) {
        x = a;
        y = b;
    }

    public void showData() {
        System.out.println(x + "," + y);
    }

    public static void main(String[] args) {
        ConstructorTwo ob1 = new ConstructorTwo();
        ConstructorTwo ob2 = new ConstructorTwo(10, 20);
        ob1.showData();
        ob2.showData();
    }
}
