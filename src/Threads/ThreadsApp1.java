package Threads;

import java.util.concurrent.Semaphore;

public class ThreadsApp1 {
    public static void main(String[] args) {
        Semaphore sem = new Semaphore(1);
        CommonResource1 res1 = new CommonResource1();
        new Thread(new CountThreads1(res1, sem, "CountThread 1")).start();
        new Thread(new CountThreads1(res1, sem, "CountThread 2")).start();
        new Thread(new CountThreads1(res1, sem, "CountThread 3")).start();

    }


}

// 192

class CommonResource1 {
    int x = 0;
}

class CountThreads1 implements  Runnable {
    CommonResource1 res1;
    Semaphore sem;
    String name;

    CountThreads1(CommonResource1 res1, Semaphore sem, String name) {
        this.res1 = res1;
        this.sem = sem;
        this.name = name;

    }

    @Override
    public void run() {
        try {
            System.out.println(name + " ожидает разрешение.");
            sem.acquire();
            res1.x = 1;
            for(int i = 1;  i< 5; i++) {
                System.out.println(this.name + "; " + res1.x);
                res1.x++;
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(name + " освобождает разрешение");
        sem.release();


    }
}

