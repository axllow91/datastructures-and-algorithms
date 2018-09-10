package stacks.stack_array;

public class Stack<T> {
    private T[] stack;
    private int numOfItems;

    public Stack() {
        // java doesnt support generic array that's why i need to use Object obj
        this.stack = (T[]) new Object[1];
    }

    // time complexity O(1) - if no resize involved
    public void push(T newData) {
        // if stack is full
        // then we are going to double the size of the stack
        if(numOfItems == this.stack.length) {
            resize(2 * this.stack.length);
        }

        // insert new item
        this.stack[numOfItems++] = newData;
    }


    // time complexity O(1) - if no resize involved
    public T pop() {
        T itemToPop = this.stack[--numOfItems];

        // if num > 0 and the capacity is 25% of the stack
        if(numOfItems > 0 && numOfItems == this.stack.length / 4) {
            // make the size half of the original array
            resize(this.stack.length / 2);
        }

        return itemToPop;
    }

    public boolean isEmpty() {
        return this.numOfItems == 0;
    }

    public int size() {
        return this.numOfItems;
    }

    // time complexity - O(n) !!
    private void resize(int i) {
        T[] stackCopy = (T[]) new Object[i];

        for(i = 0; i < numOfItems; i++)
            // copy the elements from old stack to the new stack
            stackCopy[i] = this.stack[i];

        this.stack = stackCopy;
    }


}
