package StreamAPI;

public class MyClass2 {
    public static void main(String[] args) {
        Thread t = new Thread(new MyThread2());
        t.start();
        try {
            t.join();
        }
        catch (InterruptedException e) {}
        System.out.println("Выход. Поток" +
                            Thread.currentThread().getName());
    }
}

class MyThread2 implements Runnable {
    @Override
    public void run() {
        for(int i = 0; i < 10; i++) {
            System.out.println("i= " + i +
                    " Поток" + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
