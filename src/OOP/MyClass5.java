package OOP;

public class MyClass5 {
    public static void main(String[] args) {
        C obj = new C();
        obj.func1();
        obj.func2();
        obj.func3();
    }
}

class A {
    public void func1() {System.out.println("A.func1()");}
}

class B extends A {
    public void func2() {System.out.println("B.func2()");}

}

class C extends B {
    public void func3() {System.out.println("C.func3()");}
}
