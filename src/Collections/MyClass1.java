package Collections;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Comparator;

public class MyClass1 {
    public static void main(String[] args) {
        ArrayList<A> arr = new ArrayList<A>();
        arr.add(new A(1,3));
        arr.add(new A(3,1));
        arr.add(new A(2,4));
        System.out.println(arr.toString());
        arr.sort(null);
        System.out.println(arr.toString());
        arr.sort(new Comparator<A>() {
            @Override
            public int compare(A a, A b) {
                if (a.getY()  > b.getY()) return 1;
                if(a.getY() < b.getY()) return  -1;
                return 0;
            }
        });


        System.out.println(arr.toString());
        arr.sort(new ReverseX());
        System.out.println(arr.toString());
        arr.sort( (a,b) -> {
            return Integer.compare(b.getY(), a.getY());
        });
        System.out.println(arr.toString());
    }
}

class A implements Comparable<A> {
    private int x;
    private int y;

    A(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }

    @Override
    public int compareTo(A other) {
        return Integer.compare(this.x, other.x);
    }
    @Override
    public String toString() {
        return "{" + this.x + ";" + this.y + "}";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + x;
        result = prime * result + y;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null) return false;
        if(this.getClass() != obj.getClass())
            return false;
        A other = (A) obj;
        if(this.x != other.x) return false;
        return this.y == other.y;
    }

}

class ReverseX implements Comparator<A> {
    @Override
    public int compare(A a, A b) {
        return b.compareTo(a);
    }
}
