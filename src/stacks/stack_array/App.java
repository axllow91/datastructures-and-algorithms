package stacks.stack_array;

public class App {
    public static void main(String[] args) {
        Stack<Integer> myStack = new Stack<>();

        myStack.push(10);
        myStack.push(100);
        myStack.push(1000);
        myStack.push(10000);

        System.out.println(myStack.size());

        while (!myStack.isEmpty()) {

            int popValue = myStack.pop();
            System.out.println(popValue);
        }
    }
}
