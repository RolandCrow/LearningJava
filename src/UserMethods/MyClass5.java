package UserMethods;

public class MyClass5 {
    public static void main(String[] args) {
        for(long i  = 3; i < 11; i++) {
            System.out.println(i + "! = " + factorial(i));
        }


    }

    public static long factorial(long n) {
        if(n <= 1) return 1;
        else return n * factorial(n-1);
    }
}
