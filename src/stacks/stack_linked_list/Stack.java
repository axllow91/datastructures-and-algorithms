package stacks.stack_linked_list;


import java.util.EmptyStackException;

// implementing stack data type with the help of linked list
public class Stack<T extends Comparable<T>> {

    private Node<T> rootNode;
    private int count;

    // constant time complexity O(1)
    public void push(T newData) {
        this.count++;
        if(rootNode == null) {
            // instantiate the node if no elements exists
            rootNode = new Node<>(newData);
        } else {
            // make rootNode to be the old node
            Node<T> oldRoot = rootNode;

            // create new node with the data
            rootNode = new Node<>(newData);

            // update the references
            rootNode.setNextNode(oldRoot);
        }
    }

    // pop element from the stack
    // time complexity is O(1)
    public T pop() {
        T itemToPop = rootNode.getData();
        rootNode = rootNode.getNextNode();
        count--;
        return itemToPop;
    }

    // constant time complexity O(1)
    // return the size
    public int size() {
        return count;
    }

    // constant time complexity O(1)
    // return the last element in the stack
    public T peek() {
        int len = size();
        if(len == 0) throw new EmptyStackException();
        else
            return rootNode.getData();

    }

    // check if empty
    public boolean isEmpty() {
        return rootNode == null;
    }
}
