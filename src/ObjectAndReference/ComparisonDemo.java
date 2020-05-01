package ObjectAndReference;

public class ComparisonDemo {

    public static void main(String[] args) {
        String s1 = new String("Santosh");
        String s2 = new String("Santosh");

        System.out.println(s1);
        System.out.println(s2);

        boolean res1 = (s1 == s2);  //checking references
        System.out.println(res1);

        boolean res2 = s1.equals(s2);   //Checking objects
        System.out.println(res2);
    }
}
