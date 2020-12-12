package StreamAPI;

import java.lang.annotation.Inherited;

public class MyClass1 {
    public static void main(String[] args) throws InterruptedException {
        MyThread1[] arr = new MyThread1[4];
        for (int i = 0; i < 4; i++) {
            arr[i] = new MyThread1();
            arr[i].start();
        }
        for (int i = 0; i < 4; i++) {
           try {
               Thread.sleep(2000);
           }
           catch (InterruptedException e) {}
           arr[i].interrupt();
           }


    }
}

class MyThread1 extends Thread {
    @Override
    public void run() {
        for(int i = 0; i < 20; i++) {
            System.out.println("Поток" + getId() + " i=" + i +
                                 " " + getName()   );
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Выход. Поток" + getId());
                return;
            }



        }

    }
}
