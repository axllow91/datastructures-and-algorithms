package queus.impl_of_queue;

public interface Queue<E> {
    // returns the number of elements in the queue
    int size();

    // Test whether the queue is empty
    boolean isEmpty();

    // Inserts an elem at the rear of the queue
    void enqueue(E e);

    // Returns, but does not remove, the first element of the queue(null if empty)
    E first();

    // Removes and return the first element of the queue (null if empty)
    E dequeue();

}
