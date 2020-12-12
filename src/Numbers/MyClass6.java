package Numbers;

import java.util.Scanner;

public class MyClass6 {
    public static void main(String[] args) {
        int x = 0 , result = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число 0 для получение результат\n");
        for( ; ;) {
            System.out.print("Введите число");
            x = in.nextInt();
            if(x == 0) break;
            result += x;
        }

        System.out.println("Сумма чисел равна: " + result);
    }
}
