package Generalize;

public class MyClass1 {
    public static void main(String[] args) {
        A1 obj1 = new A1();
        obj1.<Integer>print(10);
        obj1.print(10);

        B1<Integer>  obj2 = new B1<Integer>(50);
        obj2.<String>print(10, "строка");
        obj2.print(10, "строка");
    }


}

class A1 {
    public <T> void print(T obj) {
        System.out.println(obj.toString());
    }

}

class B1<T> {
    private T obj;

    public B1(T obj) {
        this.obj = obj;
    }

    public <U> void print(T obj1, U obj2) {
        System.out.println(obj1.toString());
        System.out.println(obj2.toString());
        System.out.println(this.obj.toString());
    }
}
