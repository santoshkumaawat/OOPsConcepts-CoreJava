package ObjectAndReference;

public class ObjectComparison {

    public static void main(String[] args) {
        References ob1 = new References(10, 20);
        References ob2 = new References(10, 20);
        References ob3 = ob1;

        boolean res1 = (ob1 == ob2);    //checking references
        System.out.println(res1);

        boolean res2 = ob1.equals(ob2); //checking objects
        System.out.println(res2);

        boolean res3 = (ob1 == ob3);
        System.out.println(res3);
    }
}
