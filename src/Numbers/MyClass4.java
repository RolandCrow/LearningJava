package Numbers;

import java.util.Scanner;

public class MyClass4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = 0;
        System.out.print("Введите число от 0 до 2:");
        x = in.nextInt();
        if(x == 0) {
            System.out.println("Вы ввели число 0");
        } else if (x == 1) {
            System.out.println("Вы ввели число 1");
        } else if (x == 2) {
            System.out.println("Вы ввели число 2");
        } else {
            System.out.println("Вы ввели другое число");
            System.out.println("x =" + x);
        }



    }
}
