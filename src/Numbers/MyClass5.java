package Numbers;

import java.util.Scanner;

public class MyClass5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int os = 0;
        System.out.print(
                "Какой операционной системой пользуетесь?\n\n"
                + "1 - Windows XP\n"
                + "2 - Windows 7\n"
                + "3 - Windows 8\n"
                + "4- Другая\n"
                + "Введите соответствующее число: "
        );


        os = in.nextInt();
        switch (os) {
            case 1:
                System.out.println("Вы выбрали - Windows XP");
                break;
            case 2:
                System.out.println("Вы выбрали - Windows 7");
                break;
            case 3:
                System.out.println("Вы выбрали - Windows 8");
                break;
            case 4:
                System.out.println("Вы выбрали - Другая");
                break;
            default:
                System.out.println("Мы не смогли определить систему");
        }

    }
}
