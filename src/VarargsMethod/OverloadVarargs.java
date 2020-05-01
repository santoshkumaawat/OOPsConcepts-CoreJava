package VarargsMethod;

public class OverloadVarargs {

    public static void add(String... s) {
        String sum = "";
        for (String tmp : s) {
            sum = sum + tmp;
        }
        System.out.println(sum);
    }

    public static void add(int a, int b) {
        System.out.println("Sum : " + (a + b));
    }

    public static void add(int... v) {
        int sum = 0;
        for (int tmp : v) {
            sum = sum + tmp;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        //add();
        add(10, 20);
        add(10, 20, 30);
        add(10, 20, 30, 40);
        add("Santosh ", "Kumawat");
    }
}
