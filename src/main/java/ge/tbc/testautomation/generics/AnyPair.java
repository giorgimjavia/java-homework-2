package ge.tbc.testautomation.generics;

public class AnyPair <E,T>{
    private E elementOne;
    private T elementTwo;

    public AnyPair(E elementOne, T elementTwo) {
        this.elementOne = elementOne;
        this.elementTwo = elementTwo;
    }

    public E getElementOne() {
        return elementOne;
    }

    public T getElementTwo() {
        return elementTwo;
    }

    public void setElementOne(E elementOne) {
        this.elementOne = elementOne;
    }

    public void setElementTwo(T elementTwo) {
        this.elementTwo = elementTwo;
    }

    public String toString() {
        return "Element One: " + elementOne + "\nElement Two: " + elementTwo;
    }
}
