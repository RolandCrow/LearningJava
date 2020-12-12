package Threads;

public class ThreadsApp {
    public static void main(String[] args) {
        CommonResource commonResource = new CommonResource();
        for(int i = 1; i < 6; i++) {
            Thread t = new Thread(new CountThreads(commonResource));
            t.setName("Поток" + i);
            t.start();
        }
    }
}

class CommonResource {
    int x = 0;
}

class CountThreads implements  Runnable {
    final CommonResource res;
    CountThreads(CommonResource res) {
        this.res = res;
    }

    @Override
    public void run() {
        synchronized (res) {
        res.x = 1;
        for (int i = 1; i < 5; i++) {
            System.out.printf("%s %d \n", Thread.currentThread().getName(), res.x);
            res.x++;
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {}

        }    }
}}