package Interface;

import java.util.function.Supplier;

public class MyClass4 {
    public static void main(String[] args) {
        Supplier<A4> f = A4::new;
        A4 obj = f.get();
        System.out.println(obj.getX());
        f = () -> new A4();
        obj = f.get();
        System.out.println(obj.getX());
    }
}

class A4 {
    private int x;
    public A4() {
        this.x = 10;
    }
    public int getX() {
        return this.x;
    }
}
