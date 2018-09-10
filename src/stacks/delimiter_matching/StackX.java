package stacks.delimiter_matching;

public class StackX {

    private int maxSize;
    private char[] stackArray;
    private int top;

    public StackX(int s) {
        maxSize = s;
        stackArray = new char[maxSize];
        top = -1;
    }

    public void push(char j) {
        if(!isFull()) {
            stackArray[++top] = j; // increment top - insert item
        } else {
            System.out.println("Sorry, you are out of space");
        }
    }

    public char pop() {
        return stackArray[top --];
    }

    // peek item at top
    public char peek() {
        return stackArray[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }

}
