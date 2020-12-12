package Threads;

public class MyThread1 implements Runnable {
    public static void main(String[] args) {
        System.out.println("Главный поток начал работу");
       MyThread1 myThread1 = new MyThread1();
       new Thread(myThread1, "MyThread1").start();
       try {
           Thread.sleep(1100);
           myThread1.disable();
           Thread.sleep(1000);
       } catch (InterruptedException e) {
           System.out.println("Поток прерван");
       }

        System.out.println("Главный поток завешрил работу");
    }

    private boolean isActive;
    void disable() {
        isActive = false;
    }
    MyThread1() {
        isActive = true;
    }


    @Override
    public void run() {

        System.out.printf("Поток %s начал свою работу...\n", Thread.currentThread().getName());
        int counter = 1;
        while (isActive) {
            System.out.println("Цикл" + counter++);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Поток прерван");
            }
            System.out.printf("Поток %s закончил свою работу...\n", Thread.currentThread().getName());
        }

    }
}
