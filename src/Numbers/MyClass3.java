package Numbers;

import java.util.Scanner;

public class MyClass3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = 0;
        System.out.print("Введите целок число: ");
        x = in.nextInt();
        if(x % 2 == 0)
            System.out.print(x + "- четное число");
        else
            System.out.print(x + "- нечетное число");
        System.out.println();
    }
}
