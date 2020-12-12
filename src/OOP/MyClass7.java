package OOP;

public class MyClass7 {
    public static void main(String[] args) {
        B2 obj = new B2();
        obj.func();
        obj.print();
    }
}

abstract class A2 {
    public abstract void func();
    public void print() {
        System.out.println("A.print()");
    }
}

class B2 extends A2 {
    @Override
    public void func() {
        System.out.println("B.func()");
    }
}
