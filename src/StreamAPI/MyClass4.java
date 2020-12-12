package StreamAPI;


import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

public class MyClass4 {
    public static void main(String[] args) throws InterruptedException {
        Thread[] arr = new Thread[3];
        BlockingQueue<String> queue = new LinkedBlockingDeque<String>(2);
        arr[0] = new Thread(new MyThreadReader1(queue));
        arr[0].start();
        arr[1] = new Thread(new MyThreadWriter1(queue));
        arr[1].start();
        arr[2] = new Thread(new MyThreadReader1(queue));
        arr[2].start();
        Thread.sleep(10000);
        for (Thread t: arr) {
            t.interrupt();
        }
        System.out.println("Выход. Поток main.");
    }
}

class MyThreadReader1 implements Runnable {
    private BlockingQueue<String> queue;
    MyThreadReader1(BlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                System.out.println("Прочитано " + queue.take()
                + " " + Thread.currentThread().getName());
                Thread.sleep(1000);
            }
            catch (InterruptedException e) {return;}
        }
    }
}

class MyThreadWriter1 implements Runnable {
    private BlockingQueue<String> queue;
    MyThreadWriter1(BlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                queue.put(String.valueOf(Math.random()));
                Thread.sleep(1000);
            }
            catch (InterruptedException e) {return;}
        }
    }
}


