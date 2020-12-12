package OOP;

public class MyClass1 {
    public static void main(String[] args) {
        Class2 c = new Class2();
        System.out.println(c.getX()); // 25
        c = new Class2(33);
        System.out.println(c.getX());
    }
}

class Class2 {
    private int x;

    public Class2() {
        this(25);
    }
    public Class2(int x) {
        this.x = x;
    }
    public int getX() {
        return x;
    }

}
