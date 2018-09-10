package stacks;

// LIFO
public class StackX {
    private int maxSize;
    private long[] stackArray;
    private int top;

    public StackX(int s) {
        maxSize = s;
        stackArray = new long[maxSize];
        top = -1;
    }

    public void push(long j) {
        stackArray[++top] = j; // increment top - insert item
    }

    // take one item from top out of the stack
    public long pop() {
        return stackArray[top--]; // access item - decrement top
    }

    // peek at top of the stack
    public long peek() {
        return stackArray[top];
    }

    // if stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // if top == maxSize - 1 = full
    public boolean isFull() {
        return (top == maxSize - 1);
    }


}
