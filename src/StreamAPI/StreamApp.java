package StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class StreamApp {
    public static void main(String[] args) {
        List<String> phones = new ArrayList(Arrays.asList("Iphone 6 S", "Lumia 950", "Huawey Nexus 6p",
                "Samsung Galaxy S 6", "LG G 4", "Xiaomi MI 5",
                "Asus Zenfore 2", "Sony Xperia Z5", "Meizu Pro 5",
                "Lenovo S 850"));

        int pageSize = 3;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите номер страницы: ");
            int page = scanner.nextInt();
            if(page < 1) break;
            phones.stream().skip((page - 1) * pageSize)
                        .limit(pageSize).forEach(System.out::println);
        }

    }
}
