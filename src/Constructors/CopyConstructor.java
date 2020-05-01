package Constructors;

/**
 * This Class is for Copy Constructor :- Java do not support Copy Constructor
 * but we can create our own copy constructor. but instead of creating our own
 * copy constructor, We can use clone() method. So therefore java do not support
 * copy constructor.
 */
public class CopyConstructor {

    private int x, y;

    //Regular constructor
    public CopyConstructor(int a, int b) {
        x = a;
        y = b;
    }

    //Copy Constructor    
    CopyConstructor(CopyConstructor tmp) {
        x = tmp.x;
        y = tmp.y;
    }

    public void showData() {
        System.out.println(x + "," + y);
    }

    public static void main(String[] args) {
        CopyConstructor ob1 = new CopyConstructor(10, 20);
        CopyConstructor ob2 = new CopyConstructor(ob1);//Copy Constructor called.
        ob1.showData();
        ob2.showData();
    }
}
