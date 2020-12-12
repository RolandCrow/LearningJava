package StreamAPI;

public class MyClass3 {
    public static void main(String[] args)
        throws InterruptedException
    {
        Thread[] arr = new Thread[2];
        Message m = new Message();
        arr[0] = new Thread(new MyThreadReader(m));
        arr[0].start();
        arr[1] = new Thread(new MyThreadWriter(m));
        arr[1].start();
        Thread.sleep(1000);
        for(Thread t: arr) {
            t.interrupt();
        }
        System.out.println("Выход. Поток main");

    }

}

class Message {
    private String message;
    public synchronized String take() throws InterruptedException {
        while (this.message == null) {
            this.wait();
        }
        String result = this.message;
        this.message = null;
        this.notifyAll();
        return result;

    }

    public synchronized void put(String message) throws  InterruptedException {
        while (this.message != null) {
            this.wait();
        }
        this.message = message;
        this.notifyAll();
    }


}

class MyThreadReader implements Runnable {
    private Message m;
    MyThreadReader(Message m) {
        this.m = m;
    }


    @Override
    public void run() {
        while (true) {
            try {
                System.out.println("Прочитано " + m.take());
                Thread.sleep(500);
            }
            catch (InterruptedException e) {return;}
        }
    }
}

class MyThreadWriter implements Runnable {
    private Message m;
    MyThreadWriter(Message m) {
        this.m = m;
    }
    @Override
    public void run() {
        while (true) {
            try {
                m.put(String.valueOf(Math.random()));
                Thread.sleep(1000);
            }
            catch (InterruptedException e) {return;}
        }
    }
}