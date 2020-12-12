package StreamAPI;

public class MyClass {
    public static void main(String[] args) {
        for(int i = 1; i < 5; i++) {
            new Thread(new MyThread(i)).start();
        }
    }
}

class MyThread implements Runnable {
   private int id;
   MyThread(int id) {
       this.id = id;
   }
   public int getId() {
       return id;
   }
   @Override
    public void run() {
       for (int i = 0; i < 3; i++) {
           System.out.println("Поток" + getId() + " i=" + i +
                   " " + Thread.currentThread().getName() +
                   " " + Thread.currentThread().getId());
        try {
            Thread.sleep(1000);
            } catch (InterruptedException e) {}
       }
   }
}



