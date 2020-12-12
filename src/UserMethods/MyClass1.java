package UserMethods;

import java.time.LocalDate;

public class MyClass1 {
    public static void main(String[] args) {
        Class1.print("Сообщение");
        LocalDate d = LocalDate.now();
        Class1.print(d.toString());
    }
}

class Class1 {
    public static void print(String s) {
        System.out.println(s);
    }
}
