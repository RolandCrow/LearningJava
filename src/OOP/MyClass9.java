package OOP;

public class MyClass9 {
    public static void main(String[] args) {
        A4 objA4 = new A4();
        B4 objB4 = new B4();
        C4 objC4 = new C4();

        objA4.func();
        objB4.func();
        objC4.func();
        objC4.func2();

        A4 obj1 = new A4();
        A4 obj2 = new B4();
        A4 obj3 = new C4();

        obj1.func();
        obj2.func();
        obj3.func();
    }
}

class A4 {
    public void func() {
        System.out.println("A.func()");
    }
}

class B4 extends A4 {
    @Override
    public void func() {
        System.out.println("B.func()");
    }
}

class C4 extends B4 {
    @Override
    public void func() {
        System.out.println("C.func()");
    }
    public void func2() {
        System.out.println("C.func2()");
    }
}
