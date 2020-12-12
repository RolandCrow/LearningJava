package OOP;




public class MyClass8 {
    public static void main(String[] args) {
        final int x = 10;
        A3 obj = new A3() {
        private int y = 20;

        @Override
        public void func() {
            System.out.println("?.func()");
            System.out.println(x);
            System.out.println(y);
            System.out.println(this.y);
            System.out.println(z);
            System.out.println(super.z);

        }
    };
        obj.func();
    }
}

class A3 {
    public  int z = 30;

    public void func() {
        System.out.println("A.func()");
    }
}

