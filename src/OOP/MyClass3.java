package OOP;

public class MyClass3 {
    public static void main(String[] args) {
        System.out.println(Class3.PI);
        System.out.println(Class3.x); // 10
        Class3.x += 10;
        System.out.println(Class3.x);
        System.out.println(Class3.sum(1,2));
    }



}


class Class3 {
    public static int x;
    public static final double PI = 3.14;

    public static int sum(int i, int j) {
        return  i + j;
    }
    static {
        x = 10;
    }

}
