package Interface;

public class MyClass5 {
    public static void main(String[] args) {
        A5 obj = new A5(10);
        A5 obj2 = new A5(10);
        A5 obj3 = new A5(3);
        A5 obj4 = new A5(15);
        System.out.println(obj.compareTo(obj2));
        System.out.println(obj.compareTo(obj2));
        System.out.println(obj.compareTo(obj3));
        System.out.println(obj4.compareTo(obj));
    }
}

class A5 implements Comparable<A5> {
    private int x;
    public A5(int x) {
        this.x = x;
    }
    @Override
    public int compareTo(A5 other) {
        if(this.x > other.x) return 1;
        if(this.x < other.x) return -1;
        return 0;
    }
}
