package StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class MyClass6 {
    public static void main(String[] args) {
        ExecutorService pool = Executors.newWorkStealingPool();
        List<Future<Integer>> list = new ArrayList<>();
        for(int i = 0; i <= 20; i++) {
            Future<Integer> future = pool.submit(new MyCallable1(i));
            list.add(future);
        }
        for (Future<Integer> future: list) {
            try {
                Integer result = future.get();
                System.out.println("Результат: " + result);
            }
            catch (Exception e) {
                System.out.println("Ошибка");
            }
        }
        pool.shutdown();
        try {
            if(!pool.awaitTermination(10, TimeUnit.SECONDS)) {
                pool.shutdown();
                if(!pool.awaitTermination(10, TimeUnit.SECONDS)) {
                    System.out.println("Ошибка при завершении");
                }
            }

        } catch (InterruptedException e) {
            pool.shutdownNow();
            Thread.currentThread().interrupt();
        }
        System.out.println("Выход");
    }
}

class MyCallable1 implements Callable<Integer> {
    private Integer x;
    public MyCallable1(Integer x) {
        this.x = x;
    }
    @Override
    public Integer call() throws Exception {
        System.out.println("x=" + this.x + " Поток:" +
                                Thread.currentThread().getName());
        Thread.sleep(1000);
        return this.x * 2;
    }
}


