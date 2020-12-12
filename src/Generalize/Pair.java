package Generalize;

import java.util.Objects;

public class Pair<T> {
    private T first; // T назначай что хочешь
    private T second;

    public Pair() {
        first = null;
        second = null;
    }

    Pair(T firstItem, T secondItem) {
        first = firstItem;
        second = secondItem;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public void setSecond(T second) {
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return ("first" + first.toString() + "\n"
        + "second:" + second.toString());

    }



  public boolean equals(Object otherObject) {
        if(otherObject == null)
            return false;
        else if (getClass() != otherObject.getClass())
            return false;
        else  {
            Pair<T> otherPair = (Pair<T>)otherObject;
            return (first.equals(otherPair.first)) &&
                    second.equals(otherPair.second);
        }
  }


}

