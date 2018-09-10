package stacks;

public class StackXApp {
    public static void main(String[] args) {
        int maxSize = 10;
        StackX theStack = new StackX(maxSize);

        // See if stack is not full
        // push items onto stack
        if(!theStack.isFull()) {
            theStack.push(20);  // Last in
            theStack.push(40);
            theStack.push(60);
            theStack.push(80); // First out
        } else {
            System.out.println("Sorry, we run out of space");
        }

        // See the element of the top (peek top)
        System.out.println(theStack.peek());



        // while stacks is not empty
        while(!theStack.isEmpty()) {
            // pop one element from the top until the stack is empty
            long value = theStack.pop();
            System.out.print(value);
            System.out.print(" ");
        }
        System.out.println();
    }
}
