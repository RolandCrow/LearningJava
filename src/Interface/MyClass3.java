package Interface;

public class MyClass3 {
    public static void main(String[] args) {
        MyButton2 button = new MyButton2();
        A3 a = new A3();
        button.reg(a::printOnClick);
        for(int i = 0; i < 5; i++) {
            button.click();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.exit(1);
            }
        }
    }
}

interface IClick1 {
    void onClick();
}

class A3 {
    private int x = 10;
    public void printOnClick() {
        System.out.println("Нажата кнопка. x = " + this.x);
        this.x++;
    }

}

class MyButton2 {
    private IClick1 ic = null;
    public void reg(IClick1 ic) {
        this.ic = ic;
    }

    public void click() {
        if(this.ic != null)
            this.ic.onClick();
    }
}
