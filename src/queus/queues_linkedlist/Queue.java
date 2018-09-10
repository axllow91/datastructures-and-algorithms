package queus.queues_linkedlist;

public class Queue<T extends Comparable<T>> {

    private Node<T> firstNode;
    private Node<T> lastNode; // --> here is where we add the data
    private int count;

    public boolean isEmpty() {
        return this.firstNode == null;
    }

    public int size() {
        return this.count;
    }

    // time complexity O(1)
    public void enqueue(T newData) {

        // increment size of counter
        this.count++;


        // create new node which will be the old last node
        // and initialize it with the current last node
        Node<T> oldLastNode = this.lastNode;

        // create a new node for the last node
        this.lastNode = new Node<>(newData);

        // last node should check to a null
        this.lastNode.setNextNode(null);

        if(isEmpty()) {
            // if queue is not empty
            // first node gets the last node
            this.firstNode = this.lastNode;
        } else {
            // old last node will set the node to the last node
            oldLastNode.setNextNode(this.lastNode);
        }
    }

    // time complexity - O(1)
    // not that good because of the pointers we need to store everytime
    public T dequeue() {

        // decrease the count (size of queue)
        this.count--;

        // make a new Type(generics) var
        T dataToDequeue = this.firstNode.getData();

        // update the references
        this.firstNode = this.firstNode.getNextNode();


        if(isEmpty()) {
            // if first node is null make last node null too
            this.lastNode = null;
        }

        // return data to be dequeue
        return dataToDequeue;
    }
}
