package Interface;

public class MyClass1 {
    public static void main(String[] args) {
        MyButton button = new MyButton();
        IClick ic = new A1();
        button.reg(ic);
        for(int i = 0; i < 5; i++) {
            button.click();
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
                System.exit(1);
            }
        }
    }
}

interface IClick {
    void onClick();

}

class A1 implements IClick {
    @Override
    public void onClick() {
        System.out.println("Нажата кнопка");
    }
}

class MyButton {
    private IClick ic = null;

    public void reg(IClick ic) {
        this.ic = ic;
    }

    public void click() {
        if(this.ic != null)
            this.ic.onClick();
    }
}
