package Threads;

public class MyThread implements Runnable {
    public static void main(String[] args) {
        System.out.println("Главный поток начал работу");
        new Thread(new MyThread(), "MyThread").start();
        System.out.println("Главный поток завешрил работу");
    }

    MyThread() {

    }
    public void run() {
        System.out.printf("Поток %s начал свою работу...\n", Thread.currentThread().getName());
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            System.out.println("Поток прерван");
        }
        System.out.printf("Поток %s закончил свою работу...\n", Thread.currentThread().getName());
    }
}
