package VarargsMethod;

public class VarargsDemo {

    public static void add(int... v) {
        int sum = 0;
        for (int tmp : v) {
            sum = sum + tmp;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        int x[] = {10, 2};
        int y[] = {10, 20, 5};
        add(x);
        add(y);
        add();
        add(10, 20);
        add(10, 20, 30);
        add(10, 20, 30, 40);
        add(10, 20, 30, 40, 50);
        add((int) 5.5);
    }
}
