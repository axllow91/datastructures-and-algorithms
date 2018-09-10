package stacks.stack_linked_list;

public class App {
    public static void main(String[] args) {
        Stack<Integer> theStack = new Stack<>();

        theStack.push(11);
        theStack.push(22);
        theStack.push(33);
        theStack.push(44);
        theStack.push(55);

        System.out.println(theStack.size());

        while(!theStack.isEmpty()) {
            for(int i = 0; i < theStack.size(); i++) {
                int element = theStack.pop();
                System.out.println(element);
            }
        }

    }
}
