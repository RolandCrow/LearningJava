package Interface;

public class MyClass {
    public static void main(String[] args) {
        IRead r1 = new A();
        B r2 = new B();
        IWrite w = new C();
        D obj1 = new D(r1, w);
        obj1.change();
        obj1.print();
        D obj2 = new D(r2, w);
        obj2.change();
        obj2.print();

    }
}

class A implements IRead {
    @Override
    public String read() {
        return "строка 1";
    }
}

class B implements  IRead {
    private String s = "строка 2";
    @Override
    public  String read() {
        return this.s;
    }
    public void print() {
        System.out.println(this.s);
    }
}

class C implements IWrite {
    @Override
    public void write(String s) {
        System.out.println(s);
    }
}

class D {
    private IRead ir;
    private IWrite iw;
    private String str = "";

    public D(IRead r, IWrite w) {
        this.ir = r;
        this.iw = w;
        this.str = ir.read();
    }

    public void change() {
        this.str = this.str.toUpperCase();
    }
    public void print() {
        this.iw.write(this.str);
    }

}

class G implements IReadWrite {
    @Override
    public String read() {
        return "строка 4";
    }
    @Override
    public void write(String s) {
        System.out.println(s);
    }
}
