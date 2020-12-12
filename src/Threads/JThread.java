package Threads;

public class JThread extends Thread {

    public static void main(String[] args) {
        System.out.println("Главный поток начал работу");
        new JThread("JThread").start();
        System.out.println("Главный поток завешрил работу");
    }
    JThread(String name) {
        super(name);
    }


    public void run() {
        System.out.printf("Поток %s начал работу...\n", Thread.currentThread().getName() );
        try {
            Thread.sleep(500);
        }catch (InterruptedException e) {
            System.out.println("Поток прерван");
        }

        System.out.printf("Поток %s завершил работу...\n", Thread.currentThread().getName());
    }
}
