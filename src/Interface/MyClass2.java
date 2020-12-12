package Interface;

import java.util.function.Function;

public class MyClass2 {
    public static void main(String[] args) {
        A2 obj = new A2();
        obj.print();
    }
}

class A2 {
    public static int sx = 40;
    public static final int MY_CONST = 50;
    private int cy = 125;

    public void print() {
        int x = 10;
        final int y = 20;

        int cy_tmp = this.cy;
        int sx_tmp = A2.sx;

        Function<Integer, Integer> f = n -> {
            System.out.println(cy_tmp);
            System.out.println(this.cy);
            System.out.println(sx_tmp);
            System.out.println(A2.sx);

            A2.sx += 10;
            this.cy += 5;
            A2.test();
            this.echo();
            return n + x + y + A2.sx + MY_CONST + this.cy;

        };

    }





public void echo() {
    System.out.println("echo()");
}

public static void test() {
    System.out.println("test()");
}
}
