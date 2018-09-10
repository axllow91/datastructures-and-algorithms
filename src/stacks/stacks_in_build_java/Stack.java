package stacks.stacks_in_build_java;

public class Stack {

    /*
    * A Stack is a data structure where you add elements to the "top" of the stack, and
    * also remove elements from the top again.
    *
    * Last In First Out (LIFO) principle
    *
    * push() method pushes an object onto the top of the stack
    * peek() method returns the object at the top of the stack, but not remove the object
    * pop() method returns the object at the top of the stack, and removes the object from the Stack
    * Applications -> for example graph traversing with depth-first search!
    * */

    public static void main(String[] args) {
        java.util.Stack<Integer> stack = new java.util.Stack<>();

        stack.push(10);
        stack.push(30);
        stack.push(40);

        System.out.println(stack.empty());

        while(!stack.empty()) {
            int values = stack.pop();
            System.out.print(values + " ");
        }

        System.out.println("\n" + stack.size());






    }
}
