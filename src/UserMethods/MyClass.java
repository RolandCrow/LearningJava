package UserMethods;

public class MyClass {
    public static void main(String[] args) {
        int n;
        n = sum(3,5);
        print("Сообщение");
        print("n = " + n);
        printOK();

        System.out.println(sum(10,20));
        System.out.println(sum(10.5, 20.7));
        System.out.println(sum(10L, 20L));
    }


    public static int sum(int x, int y) {
        return x + y;
    }

    public static double sum(double x, double y) {
        return x + y;
    }

    public static void print(String s) {
        System.out.println(s);
    }

    public static void printOK() {
        System.out.println("OK");
    }


}
