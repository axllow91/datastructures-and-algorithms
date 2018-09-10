package stacks.reverse_word;

public class StackX {

    private int maxSize;
    private char[] stackArray;
    private int top;

    public StackX(int s) {
        maxSize = s;
        stackArray = new char[maxSize];
        top = -1;  // no elements
    }

    public void push(char j) {
        stackArray[++top] = j;  // increment position - insert item
    }

    public char pop() {
        return stackArray[top--];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }

    public char peek() {
        return stackArray[top];
    }

}
