package ClassDesigning.Variables;

public class Variables {

    int x;   //Non Static Variales (Instance Variable)
    static int a;    //Static Variables (Class Variable)

    public static void main(String[] args) {
        //Instantiating of class Variables
        Variables v1 = new Variables();
        Variables v2 = new Variables();
        Variables v3 = new Variables();

        System.out.println("v1.x :" + v1.x);
        System.out.println("v2.x :" + v2.x);
        System.out.println("v3.x :" + v3.x);

        v1.x = 10;
        v2.x = 50;
        v3.x = 70;

        System.out.println("v1.x :" + v1.x);
        System.out.println("v2.x :" + v2.x);
        System.out.println("v3.x :" + v3.x);

        System.out.println("v1.a :" + v1.a);
        System.out.println("v2.a :" + v2.a);
        System.out.println("v3.a :" + v3.a);

        v1.a = 100;
        v2.a = 200;
        //v3.a = 300;

        System.out.println("v1.a :" + v1.a);
        System.out.println("v2.a :" + v2.a);
        System.out.println("v3.a :" + v3.a);
    }
}
