package OOP;

public class MyClass2 {
    public static void main(String[] args) {
        System.out.println(Class2.PI);
        Class2 c = new Class2(10);
        System.out.println(c.MY_CONST);
        c = new Class2(20);
        System.out.println(c.MY_CONST);
    }



    static class Class2 {
        public final int MY_CONST;
        public static final double PI = 3.14;

        public Class2(int x) {
            MY_CONST = x;
        }
    }
}
