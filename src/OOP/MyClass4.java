package OOP;

public class MyClass4 {
    public static void main(String[] args) {
        Class4 c2 = Class4.getInstance(10);
        Class4 c3 = Class4.getInstance(45);
        System.out.println(c2.getX());
        System.out.println(c3.getX());
    }
}

class Class4 {
    private int x;

    private Class4(int x) {
        this.x = x;
    }
    public static Class4 getInstance(int x) {
        return new Class4(x);
    }

    public int getX() {return this.x;}

}
