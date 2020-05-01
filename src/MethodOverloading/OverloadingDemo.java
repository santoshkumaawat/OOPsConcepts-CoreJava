package MethodOverloading;

public class OverloadingDemo {

    public static void add(String a, String b) {
        System.out.println(a + b);
    }

    public static void add(double a, double b) {
        System.out.println(a + b);
    }

    public static void add(int a, int b) {
        System.out.println(a + b);
    }

    public static void add(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    public static void add(int a) {
        System.out.println(a);
    }

    public static void main(String[] args) {
        /*firstly compiler calling add method with exact match. 
         and if exact math doesnot happen then compiler try to casting.*/

        add("Santosh ", "Kumawat");

        /*here exact match does not happen
         so compiler automatically casting second parameter(10) to int to double.
         and calling add(double a, double b).*/
        add(5.5, 10);

        add(5, 10);
        add(10, 20, 30);

        /*here forcely we passing the double value into integer type variable
         by type casting.*/
        add((int) 5.5);
    }
}
