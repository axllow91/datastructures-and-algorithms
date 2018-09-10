package queus.simple_queue;

public class Queue {

    private int maxSize;
    private long[] queArray;
    private int front;
    private int rear;
    private static int nItems;

    public Queue(int s) {

        maxSize = s;
        queArray = new long[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    public void insert(long j) {
        // if rear is maxed read = -1
        if (rear == maxSize - 1)
            rear = -1;
        queArray[++rear] = j; // increment rear - insert item
        nItems++; // increment one item
    }

    public long remove() {

        if (isEmpty())
            return -1;
        else {
            long temp = queArray[front++];
            // get value and increment front
            if (front == maxSize)    // if front is max make it 0
                front = 0;
            nItems--;    // one less item

            return temp;
        }
    }


    public long peekFront() {
        return queArray[front];
    }

    // if no items in queue means empty
    public boolean isEmpty() {
        return (nItems == 0);
    }

    // full if rear is maxed
    public boolean isFull() {
        return (rear == maxSize);
    }

    public int size() {
        return nItems;
    }


}
