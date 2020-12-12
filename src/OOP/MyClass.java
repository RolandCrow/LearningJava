package OOP;

public class MyClass {
    public static void main(String[] args) {
        System.out.println(Class1.x);
        System.out.println(Class1.PI);
    }
}

class Class1 {
    public static int x;
    public static final double PI;

    static {
        x = 10;
        PI = 3.14;
    }
}
