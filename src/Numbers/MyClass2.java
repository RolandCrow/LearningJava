package Numbers;

public class MyClass2 {
    public static void main(String[] args) {
        int x = 0, y = 0;
        x = 5;
        y = x++;
        System.out.println("Постфиксная форма (y = x++;):");
        System.out.println("y =" + y);
        System.out.println("x =" + x);
        x = 5;
        y = ++x;
        System.out.println("Префиксная форма (y = ++x;):");
        System.out.println("y =" + y);
        System.out.println("x =" + x);


    }
}
