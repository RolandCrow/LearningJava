package Generalize;

public class TwoTypePair<T1, T2> {
    private T1 first;
    private T2 second;

    public TwoTypePair() {
        first = null;
        second = null;
    }
    public TwoTypePair(T1 firstItem, T2 secondItem) {
        first = firstItem;
        second = secondItem;
    }

    public void setFirst(T1 first) {
        this.first = first;
    }

    public void setSecond(T2 second) {
        this.second = second;
    }

    public T1 getFirst() {
        return first;
    }

    public T2 getSecond() {
        return second;
    }

    public String toString() {
        return ("first: " + first.toString() + "\n"
                + "second: " + second.toString());

    }


    public boolean equals(Object otherObject) {
        if(otherObject == null)
            return false;
        else if(getClass() != otherObject.getClass())
            return false;
        else  {
            TwoTypePair<T1, T2> otherPair = (TwoTypePair<T1, T2>) otherObject;
            return (first.equals(otherPair.first))&& second.equals(otherPair.second);

        }
    }
}
