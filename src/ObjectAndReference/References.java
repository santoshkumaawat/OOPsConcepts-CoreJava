package ObjectAndReference;

public class References {

    private int x, y;

    public References(int a, int b) {
        x = a;
        y = b;
    }

    public void show() {
        System.out.println(x + "," + y);
    }

    public boolean equals(References tmp) {
        if (x == tmp.x && y == tmp.y) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        References r1;
        new References(10, 20);
        References r2 = new References(30, 40);

        References r3 = r2;
        r1 = r3;

        r1.show();
        r2.show();
        r3.show();
        System.out.println("_______________________________");

        r3 = new References(50, 60);
        r1.show();
        r2.show();
        r3.show();
        System.out.println("_______________________________");

        r3 = r2;
        r1.show();
        r2.show();
        r3.show();
        System.out.println("_______________________________");
    }
}
