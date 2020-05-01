package ObjectAndReference;

public class ThisReference {

    private int x, y;

    public static void main(String[] args) {
        ThisReference t1 = new ThisReference(10, 20);
        ThisReference t2 = new ThisReference(30, 40);
        t1.show();
        t2.show();
    }

    public void show() {
        int x = 55;
        System.out.println(this.x);
        System.out.println(this.y);
        System.out.println("_______________________");
    }

    public ThisReference(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
