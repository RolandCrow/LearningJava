package Numbers;

public class MyClass1 {
    static int x; // global

    public static void main(String[] args) {
        x  = 10;
        System.out.println(x);
        func();
        System.out.println(x);
    }

    public static void func() {
        int x = 30; // local
        System.out.println(x);
        System.out.println(MyClass.x);
        MyClass1.x = 88;
    }

}

