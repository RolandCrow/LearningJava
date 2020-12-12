package OOP;

public class MyClass6 {
    public static void main(String[] args) {
        B1 obj = new B1();
        obj.func();
    }
}

class A1 {
    public void func() {
        System.out.println("A.func()");
    }
}

class B1 extends A1 {
    @Override
    public void func() {
        System.out.println("B.func()");
        super.func();
    }
}

