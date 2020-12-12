package StreamAPI;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class MyClass5 {
    public static void main(String[] args) {
        FutureTask<Integer> ft =
                new FutureTask<Integer>(new MyCallable(10));
        new Thread(ft).start();
        try {
            Integer result = ft.get();
            System.out.println("Результат: " + result);
        }
        catch (Exception e) {
            System.out.println("Ошибка");
        }
    }
}

class MyCallable implements Callable<Integer> {
    private Integer x;
    public MyCallable(Integer x) {
        this.x = x;
    }
    @Override
    public Integer call() throws Exception {
        System.out.println("Задание запущено");
        Thread.sleep(1000);
        return this.x * 2;
    }
}
